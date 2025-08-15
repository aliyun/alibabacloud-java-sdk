// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class CreateAdvancedQueryTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAdvancedQueryTemplateResponseBody body;

    public static CreateAdvancedQueryTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAdvancedQueryTemplateResponse self = new CreateAdvancedQueryTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateAdvancedQueryTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAdvancedQueryTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAdvancedQueryTemplateResponse setBody(CreateAdvancedQueryTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAdvancedQueryTemplateResponseBody getBody() {
        return this.body;
    }

}
