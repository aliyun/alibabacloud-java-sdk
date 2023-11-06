// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class GetDrdsDbRdsRelationInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDrdsDbRdsRelationInfoResponseBody body;

    public static GetDrdsDbRdsRelationInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDrdsDbRdsRelationInfoResponse self = new GetDrdsDbRdsRelationInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDrdsDbRdsRelationInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDrdsDbRdsRelationInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDrdsDbRdsRelationInfoResponse setBody(GetDrdsDbRdsRelationInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDrdsDbRdsRelationInfoResponseBody getBody() {
        return this.body;
    }

}
