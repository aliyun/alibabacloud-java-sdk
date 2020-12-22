// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BodyPostureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BodyPostureResponseBody body;

    public static BodyPostureResponse build(java.util.Map<String, ?> map) throws Exception {
        BodyPostureResponse self = new BodyPostureResponse();
        return TeaModel.build(map, self);
    }

    public BodyPostureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BodyPostureResponse setBody(BodyPostureResponseBody body) {
        this.body = body;
        return this;
    }
    public BodyPostureResponseBody getBody() {
        return this.body;
    }

}
