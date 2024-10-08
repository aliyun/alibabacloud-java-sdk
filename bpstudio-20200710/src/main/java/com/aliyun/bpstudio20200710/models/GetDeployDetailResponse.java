// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20200710.models;

import com.aliyun.tea.*;

public class GetDeployDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeployDetailResponseBody body;

    public static GetDeployDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeployDetailResponse self = new GetDeployDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetDeployDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeployDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeployDetailResponse setBody(GetDeployDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeployDetailResponseBody getBody() {
        return this.body;
    }

}
