// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateHbaseHaSlbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHbaseHaSlbResponseBody body;

    public static CreateHbaseHaSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHbaseHaSlbResponse self = new CreateHbaseHaSlbResponse();
        return TeaModel.build(map, self);
    }

    public CreateHbaseHaSlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHbaseHaSlbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHbaseHaSlbResponse setBody(CreateHbaseHaSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHbaseHaSlbResponseBody getBody() {
        return this.body;
    }

}
