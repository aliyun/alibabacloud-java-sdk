// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CompleteBoardRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CompleteBoardRecordResponseBody body;

    public static CompleteBoardRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteBoardRecordResponse self = new CompleteBoardRecordResponse();
        return TeaModel.build(map, self);
    }

    public CompleteBoardRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompleteBoardRecordResponse setBody(CompleteBoardRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CompleteBoardRecordResponseBody getBody() {
        return this.body;
    }

}
