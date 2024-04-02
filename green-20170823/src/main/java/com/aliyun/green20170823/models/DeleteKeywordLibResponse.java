// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteKeywordLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKeywordLibResponseBody body;

    public static DeleteKeywordLibResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeywordLibResponse self = new DeleteKeywordLibResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKeywordLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKeywordLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKeywordLibResponse setBody(DeleteKeywordLibResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKeywordLibResponseBody getBody() {
        return this.body;
    }

}
