// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DowngradeAndroidInstanceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DowngradeAndroidInstanceGroupResponseBody body;

    public static DowngradeAndroidInstanceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DowngradeAndroidInstanceGroupResponse self = new DowngradeAndroidInstanceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DowngradeAndroidInstanceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DowngradeAndroidInstanceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DowngradeAndroidInstanceGroupResponse setBody(DowngradeAndroidInstanceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DowngradeAndroidInstanceGroupResponseBody getBody() {
        return this.body;
    }

}
