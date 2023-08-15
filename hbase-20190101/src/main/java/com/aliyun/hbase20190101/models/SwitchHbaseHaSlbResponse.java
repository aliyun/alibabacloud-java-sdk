// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class SwitchHbaseHaSlbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchHbaseHaSlbResponseBody body;

    public static SwitchHbaseHaSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchHbaseHaSlbResponse self = new SwitchHbaseHaSlbResponse();
        return TeaModel.build(map, self);
    }

    public SwitchHbaseHaSlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchHbaseHaSlbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchHbaseHaSlbResponse setBody(SwitchHbaseHaSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchHbaseHaSlbResponseBody getBody() {
        return this.body;
    }

}
