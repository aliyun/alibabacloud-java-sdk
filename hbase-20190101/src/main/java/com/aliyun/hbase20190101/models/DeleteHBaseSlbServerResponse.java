// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteHBaseSlbServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHBaseSlbServerResponseBody body;

    public static DeleteHBaseSlbServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHBaseSlbServerResponse self = new DeleteHBaseSlbServerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHBaseSlbServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHBaseSlbServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHBaseSlbServerResponse setBody(DeleteHBaseSlbServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHBaseSlbServerResponseBody getBody() {
        return this.body;
    }

}
