// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GetFaceEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFaceEntityResponseBody body;

    public static GetFaceEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFaceEntityResponse self = new GetFaceEntityResponse();
        return TeaModel.build(map, self);
    }

    public GetFaceEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFaceEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFaceEntityResponse setBody(GetFaceEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFaceEntityResponseBody getBody() {
        return this.body;
    }

}
