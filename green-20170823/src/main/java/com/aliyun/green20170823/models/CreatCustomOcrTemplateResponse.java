// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreatCustomOcrTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatCustomOcrTemplateResponseBody body;

    public static CreatCustomOcrTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatCustomOcrTemplateResponse self = new CreatCustomOcrTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreatCustomOcrTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatCustomOcrTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatCustomOcrTemplateResponse setBody(CreatCustomOcrTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatCustomOcrTemplateResponseBody getBody() {
        return this.body;
    }

}
