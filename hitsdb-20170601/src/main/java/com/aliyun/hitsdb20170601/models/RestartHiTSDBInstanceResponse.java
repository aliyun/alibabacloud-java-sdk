// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class RestartHiTSDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestartHiTSDBInstanceResponseBody body;

    public static RestartHiTSDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartHiTSDBInstanceResponse self = new RestartHiTSDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RestartHiTSDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartHiTSDBInstanceResponse setBody(RestartHiTSDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartHiTSDBInstanceResponseBody getBody() {
        return this.body;
    }

}
