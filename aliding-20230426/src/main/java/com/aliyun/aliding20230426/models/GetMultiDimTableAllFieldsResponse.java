// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultiDimTableAllFieldsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMultiDimTableAllFieldsResponseBody body;

    public static GetMultiDimTableAllFieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMultiDimTableAllFieldsResponse self = new GetMultiDimTableAllFieldsResponse();
        return TeaModel.build(map, self);
    }

    public GetMultiDimTableAllFieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMultiDimTableAllFieldsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMultiDimTableAllFieldsResponse setBody(GetMultiDimTableAllFieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMultiDimTableAllFieldsResponseBody getBody() {
        return this.body;
    }

}
