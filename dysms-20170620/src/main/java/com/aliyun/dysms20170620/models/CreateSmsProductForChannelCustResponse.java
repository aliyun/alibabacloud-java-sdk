// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsProductForChannelCustResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSmsProductForChannelCustResponseBody body;

    public static CreateSmsProductForChannelCustResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsProductForChannelCustResponse self = new CreateSmsProductForChannelCustResponse();
        return TeaModel.build(map, self);
    }

    public CreateSmsProductForChannelCustResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSmsProductForChannelCustResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSmsProductForChannelCustResponse setBody(CreateSmsProductForChannelCustResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSmsProductForChannelCustResponseBody getBody() {
        return this.body;
    }

}
