// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteHBaseSlbServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteHBaseSlbServerResponse setBody(DeleteHBaseSlbServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHBaseSlbServerResponseBody getBody() {
        return this.body;
    }

}
