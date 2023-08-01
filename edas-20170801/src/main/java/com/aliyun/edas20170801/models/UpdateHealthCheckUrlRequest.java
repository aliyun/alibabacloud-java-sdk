// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateHealthCheckUrlRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The health check URL of the application. The URL must start with `http://`, and can be up to 255 characters in length. Example: `http://127.0.0.1:8080/_ehc.html`. If this parameter is not specified, the health check URL of the application is not changed.</p>
     */
    @NameInMap("hcURL")
    public String hcURL;

    public static UpdateHealthCheckUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHealthCheckUrlRequest self = new UpdateHealthCheckUrlRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHealthCheckUrlRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateHealthCheckUrlRequest setHcURL(String hcURL) {
        this.hcURL = hcURL;
        return this;
    }
    public String getHcURL() {
        return this.hcURL;
    }

}
