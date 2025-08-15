// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class UpdateAdvancedQueryTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAdvancedQueryTemplateResponseBody body;

    public static UpdateAdvancedQueryTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdvancedQueryTemplateResponse self = new UpdateAdvancedQueryTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAdvancedQueryTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAdvancedQueryTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAdvancedQueryTemplateResponse setBody(UpdateAdvancedQueryTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAdvancedQueryTemplateResponseBody getBody() {
        return this.body;
    }

}
