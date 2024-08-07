// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteWaterMarkTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWaterMarkTemplateResponseBody body;

    public static DeleteWaterMarkTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWaterMarkTemplateResponse self = new DeleteWaterMarkTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWaterMarkTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWaterMarkTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWaterMarkTemplateResponse setBody(DeleteWaterMarkTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWaterMarkTemplateResponseBody getBody() {
        return this.body;
    }

}
