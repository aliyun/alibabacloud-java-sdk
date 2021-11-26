// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateRDSToClickhouseDbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRDSToClickhouseDbResponseBody body;

    public static CreateRDSToClickhouseDbResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRDSToClickhouseDbResponse self = new CreateRDSToClickhouseDbResponse();
        return TeaModel.build(map, self);
    }

    public CreateRDSToClickhouseDbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRDSToClickhouseDbResponse setBody(CreateRDSToClickhouseDbResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRDSToClickhouseDbResponseBody getBody() {
        return this.body;
    }

}
