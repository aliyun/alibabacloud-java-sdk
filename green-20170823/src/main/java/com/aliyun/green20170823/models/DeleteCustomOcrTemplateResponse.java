// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteCustomOcrTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomOcrTemplateResponseBody body;

    public static DeleteCustomOcrTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomOcrTemplateResponse self = new DeleteCustomOcrTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomOcrTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomOcrTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomOcrTemplateResponse setBody(DeleteCustomOcrTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomOcrTemplateResponseBody getBody() {
        return this.body;
    }

}
