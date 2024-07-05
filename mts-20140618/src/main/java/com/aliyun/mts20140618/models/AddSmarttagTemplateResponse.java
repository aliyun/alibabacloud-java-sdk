// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddSmarttagTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSmarttagTemplateResponseBody body;

    public static AddSmarttagTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSmarttagTemplateResponse self = new AddSmarttagTemplateResponse();
        return TeaModel.build(map, self);
    }

    public AddSmarttagTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSmarttagTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSmarttagTemplateResponse setBody(AddSmarttagTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSmarttagTemplateResponseBody getBody() {
        return this.body;
    }

}
