// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class HangUpDoubleCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public HangUpDoubleCallResponseBody body;

    public static HangUpDoubleCallResponse build(java.util.Map<String, ?> map) throws Exception {
        HangUpDoubleCallResponse self = new HangUpDoubleCallResponse();
        return TeaModel.build(map, self);
    }

    public HangUpDoubleCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HangUpDoubleCallResponse setBody(HangUpDoubleCallResponseBody body) {
        this.body = body;
        return this;
    }
    public HangUpDoubleCallResponseBody getBody() {
        return this.body;
    }

}
