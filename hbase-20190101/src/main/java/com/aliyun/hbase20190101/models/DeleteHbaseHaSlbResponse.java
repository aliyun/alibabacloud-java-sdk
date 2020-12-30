// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteHbaseHaSlbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteHbaseHaSlbResponse setBody(DeleteHbaseHaSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHbaseHaSlbResponseBody getBody() {
        return this.body;
    }

}
