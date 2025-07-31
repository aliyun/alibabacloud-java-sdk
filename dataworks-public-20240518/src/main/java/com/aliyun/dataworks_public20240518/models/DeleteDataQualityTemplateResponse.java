// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataQualityTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataQualityTemplateResponseBody body;

    public static DeleteDataQualityTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataQualityTemplateResponse self = new DeleteDataQualityTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataQualityTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataQualityTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataQualityTemplateResponse setBody(DeleteDataQualityTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataQualityTemplateResponseBody getBody() {
        return this.body;
    }

}
