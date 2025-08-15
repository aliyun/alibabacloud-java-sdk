// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DeleteAdvancedQueryTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAdvancedQueryTemplateResponseBody body;

    public static DeleteAdvancedQueryTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAdvancedQueryTemplateResponse self = new DeleteAdvancedQueryTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAdvancedQueryTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAdvancedQueryTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAdvancedQueryTemplateResponse setBody(DeleteAdvancedQueryTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAdvancedQueryTemplateResponseBody getBody() {
        return this.body;
    }

}
