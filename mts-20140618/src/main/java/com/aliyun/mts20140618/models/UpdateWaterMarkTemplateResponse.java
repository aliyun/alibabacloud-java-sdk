// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateWaterMarkTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWaterMarkTemplateResponseBody body;

    public static UpdateWaterMarkTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWaterMarkTemplateResponse self = new UpdateWaterMarkTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWaterMarkTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWaterMarkTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWaterMarkTemplateResponse setBody(UpdateWaterMarkTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWaterMarkTemplateResponseBody getBody() {
        return this.body;
    }

}
