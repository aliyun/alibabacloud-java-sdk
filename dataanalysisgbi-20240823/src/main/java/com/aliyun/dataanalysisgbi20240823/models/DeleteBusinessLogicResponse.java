// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class DeleteBusinessLogicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBusinessLogicResponseBody body;

    public static DeleteBusinessLogicResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBusinessLogicResponse self = new DeleteBusinessLogicResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBusinessLogicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBusinessLogicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBusinessLogicResponse setBody(DeleteBusinessLogicResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBusinessLogicResponseBody getBody() {
        return this.body;
    }

}
