// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class OperateBlackNoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OperateBlackNoResponseBody body;

    public static OperateBlackNoResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateBlackNoResponse self = new OperateBlackNoResponse();
        return TeaModel.build(map, self);
    }

    public OperateBlackNoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateBlackNoResponse setBody(OperateBlackNoResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateBlackNoResponseBody getBody() {
        return this.body;
    }

}
