// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoScaleInstancePolicyListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAutoScaleInstancePolicyListResponseBody body;

    public static GetAutoScaleInstancePolicyListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScaleInstancePolicyListResponse self = new GetAutoScaleInstancePolicyListResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoScaleInstancePolicyListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoScaleInstancePolicyListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutoScaleInstancePolicyListResponse setBody(GetAutoScaleInstancePolicyListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoScaleInstancePolicyListResponseBody getBody() {
        return this.body;
    }

}
