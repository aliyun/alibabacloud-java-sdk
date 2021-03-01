// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateHealthCheckUrlRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

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
