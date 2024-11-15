// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAnswerImportProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAnswerImportProgressResponseBody body;

    public static GetAnswerImportProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAnswerImportProgressResponse self = new GetAnswerImportProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetAnswerImportProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAnswerImportProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAnswerImportProgressResponse setBody(GetAnswerImportProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAnswerImportProgressResponseBody getBody() {
        return this.body;
    }

}
