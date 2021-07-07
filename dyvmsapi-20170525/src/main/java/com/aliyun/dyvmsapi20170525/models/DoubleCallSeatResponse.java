// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class DoubleCallSeatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DoubleCallSeatResponseBody body;

    public static DoubleCallSeatResponse build(java.util.Map<String, ?> map) throws Exception {
        DoubleCallSeatResponse self = new DoubleCallSeatResponse();
        return TeaModel.build(map, self);
    }

    public DoubleCallSeatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DoubleCallSeatResponse setBody(DoubleCallSeatResponseBody body) {
        this.body = body;
        return this;
    }
    public DoubleCallSeatResponseBody getBody() {
        return this.body;
    }

}
