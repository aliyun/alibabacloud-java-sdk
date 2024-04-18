// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteHbaseHaSlbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHbaseHaSlbResponseBody body;

    public static DeleteHbaseHaSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHbaseHaSlbResponse self = new DeleteHbaseHaSlbResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHbaseHaSlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHbaseHaSlbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHbaseHaSlbResponse setBody(DeleteHbaseHaSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHbaseHaSlbResponseBody getBody() {
        return this.body;
    }

}
