// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateHbaseHaSlbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateHbaseHaSlbResponse setBody(CreateHbaseHaSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHbaseHaSlbResponseBody getBody() {
        return this.body;
    }

}
