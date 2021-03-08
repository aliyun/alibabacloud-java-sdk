// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class CreateHiTSDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHiTSDBInstanceResponseBody body;

    public static CreateHiTSDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHiTSDBInstanceResponse self = new CreateHiTSDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateHiTSDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHiTSDBInstanceResponse setBody(CreateHiTSDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHiTSDBInstanceResponseBody getBody() {
        return this.body;
    }

}
