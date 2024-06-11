// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ResetAndroidInstancesInGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetAndroidInstancesInGroupResponseBody body;

    public static ResetAndroidInstancesInGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAndroidInstancesInGroupResponse self = new ResetAndroidInstancesInGroupResponse();
        return TeaModel.build(map, self);
    }

    public ResetAndroidInstancesInGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAndroidInstancesInGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetAndroidInstancesInGroupResponse setBody(ResetAndroidInstancesInGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAndroidInstancesInGroupResponseBody getBody() {
        return this.body;
    }

}
