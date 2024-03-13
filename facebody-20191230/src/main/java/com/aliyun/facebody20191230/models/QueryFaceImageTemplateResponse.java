// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class QueryFaceImageTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFaceImageTemplateResponseBody body;

    public static QueryFaceImageTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceImageTemplateResponse self = new QueryFaceImageTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceImageTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFaceImageTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFaceImageTemplateResponse setBody(QueryFaceImageTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceImageTemplateResponseBody getBody() {
        return this.body;
    }

}
