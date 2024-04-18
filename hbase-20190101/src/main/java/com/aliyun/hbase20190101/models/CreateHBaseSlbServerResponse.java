// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateHBaseSlbServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHBaseSlbServerResponseBody body;

    public static CreateHBaseSlbServerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHBaseSlbServerResponse self = new CreateHBaseSlbServerResponse();
        return TeaModel.build(map, self);
    }

    public CreateHBaseSlbServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHBaseSlbServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHBaseSlbServerResponse setBody(CreateHBaseSlbServerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHBaseSlbServerResponseBody getBody() {
        return this.body;
    }

}
