// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCustomFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomFieldResponseBody body;

    public static GetCustomFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomFieldResponse self = new GetCustomFieldResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomFieldResponse setBody(GetCustomFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomFieldResponseBody getBody() {
        return this.body;
    }

}
