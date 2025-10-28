// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateHealthCheckUrlRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c627c157-560d-43ff-***************</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The health check URL of the application. The URL must start with <code>http://</code>, and can be up to 255 characters in length. Example: <code>http://127.0.0.1:8080/_ehc.html</code>. If this parameter is not specified, the health check URL of the application is not changed.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://127.0.0.1:8080/_ehc.html">http://127.0.0.1:8080/_ehc.html</a></p>
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
