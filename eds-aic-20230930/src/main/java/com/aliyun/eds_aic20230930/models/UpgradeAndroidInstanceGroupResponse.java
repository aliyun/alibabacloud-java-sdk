// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UpgradeAndroidInstanceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeAndroidInstanceGroupResponseBody body;

    public static UpgradeAndroidInstanceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAndroidInstanceGroupResponse self = new UpgradeAndroidInstanceGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeAndroidInstanceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeAndroidInstanceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeAndroidInstanceGroupResponse setBody(UpgradeAndroidInstanceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeAndroidInstanceGroupResponseBody getBody() {
        return this.body;
    }

}
