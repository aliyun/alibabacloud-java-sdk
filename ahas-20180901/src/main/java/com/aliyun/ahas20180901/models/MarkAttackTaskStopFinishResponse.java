// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class MarkAttackTaskStopFinishResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MarkAttackTaskStopFinishResponseBody body;

    public static MarkAttackTaskStopFinishResponse build(java.util.Map<String, ?> map) throws Exception {
        MarkAttackTaskStopFinishResponse self = new MarkAttackTaskStopFinishResponse();
        return TeaModel.build(map, self);
    }

    public MarkAttackTaskStopFinishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MarkAttackTaskStopFinishResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MarkAttackTaskStopFinishResponse setBody(MarkAttackTaskStopFinishResponseBody body) {
        this.body = body;
        return this;
    }
    public MarkAttackTaskStopFinishResponseBody getBody() {
        return this.body;
    }

}
