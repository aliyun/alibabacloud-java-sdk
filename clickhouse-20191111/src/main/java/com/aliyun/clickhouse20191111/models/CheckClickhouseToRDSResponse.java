// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckClickhouseToRDSResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckClickhouseToRDSResponseBody body;

    public static CheckClickhouseToRDSResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckClickhouseToRDSResponse self = new CheckClickhouseToRDSResponse();
        return TeaModel.build(map, self);
    }

    public CheckClickhouseToRDSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckClickhouseToRDSResponse setBody(CheckClickhouseToRDSResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckClickhouseToRDSResponseBody getBody() {
        return this.body;
    }

}
