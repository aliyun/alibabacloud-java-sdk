// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class CreateHbaseSlbServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHbaseSlbServerResponseBody body;

    public static CreateHbaseSlbServerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHbaseSlbServerResponse self = new CreateHbaseSlbServerResponse();
        return TeaModel.build(map, self);
    }

    public CreateHbaseSlbServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHbaseSlbServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHbaseSlbServerResponse setBody(CreateHbaseSlbServerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHbaseSlbServerResponseBody getBody() {
        return this.body;
    }

}
