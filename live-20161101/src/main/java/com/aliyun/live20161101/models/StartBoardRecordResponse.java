// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartBoardRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartBoardRecordResponseBody body;

    public static StartBoardRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        StartBoardRecordResponse self = new StartBoardRecordResponse();
        return TeaModel.build(map, self);
    }

    public StartBoardRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartBoardRecordResponse setBody(StartBoardRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public StartBoardRecordResponseBody getBody() {
        return this.body;
    }

}
