// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DeleteHbaseSlbServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHbaseSlbServerResponseBody body;

    public static DeleteHbaseSlbServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHbaseSlbServerResponse self = new DeleteHbaseSlbServerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHbaseSlbServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHbaseSlbServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHbaseSlbServerResponse setBody(DeleteHbaseSlbServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHbaseSlbServerResponseBody getBody() {
        return this.body;
    }

}
