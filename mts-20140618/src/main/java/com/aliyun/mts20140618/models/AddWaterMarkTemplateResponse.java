// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddWaterMarkTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddWaterMarkTemplateResponseBody body;

    public static AddWaterMarkTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWaterMarkTemplateResponse self = new AddWaterMarkTemplateResponse();
        return TeaModel.build(map, self);
    }

    public AddWaterMarkTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddWaterMarkTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddWaterMarkTemplateResponse setBody(AddWaterMarkTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddWaterMarkTemplateResponseBody getBody() {
        return this.body;
    }

}
