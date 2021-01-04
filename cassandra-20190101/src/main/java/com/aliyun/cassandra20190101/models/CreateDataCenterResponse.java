// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class CreateDataCenterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDataCenterResponseBody body;

    public static CreateDataCenterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataCenterResponse self = new CreateDataCenterResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataCenterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataCenterResponse setBody(CreateDataCenterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataCenterResponseBody getBody() {
        return this.body;
    }

}
