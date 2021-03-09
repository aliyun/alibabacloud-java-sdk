// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class MakeCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MakeCallResponseBody body;

    public static MakeCallResponse build(java.util.Map<String, ?> map) throws Exception {
        MakeCallResponse self = new MakeCallResponse();
        return TeaModel.build(map, self);
    }

    public MakeCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MakeCallResponse setBody(MakeCallResponseBody body) {
        this.body = body;
        return this;
    }
    public MakeCallResponseBody getBody() {
        return this.body;
    }

}
