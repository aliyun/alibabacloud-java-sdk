// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetCallSoundRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCallSoundRecordResponseBody body;

    public static GetCallSoundRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCallSoundRecordResponse self = new GetCallSoundRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetCallSoundRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCallSoundRecordResponse setBody(GetCallSoundRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCallSoundRecordResponseBody getBody() {
        return this.body;
    }

}
