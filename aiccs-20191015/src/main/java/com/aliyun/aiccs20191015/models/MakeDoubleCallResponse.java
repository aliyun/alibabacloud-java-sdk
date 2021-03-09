// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class MakeDoubleCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MakeDoubleCallResponseBody body;

    public static MakeDoubleCallResponse build(java.util.Map<String, ?> map) throws Exception {
        MakeDoubleCallResponse self = new MakeDoubleCallResponse();
        return TeaModel.build(map, self);
    }

    public MakeDoubleCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MakeDoubleCallResponse setBody(MakeDoubleCallResponseBody body) {
        this.body = body;
        return this;
    }
    public MakeDoubleCallResponseBody getBody() {
        return this.body;
    }

}
