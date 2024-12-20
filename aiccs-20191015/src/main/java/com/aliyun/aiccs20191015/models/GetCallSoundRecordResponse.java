// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetCallSoundRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetCallSoundRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCallSoundRecordResponse setBody(GetCallSoundRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCallSoundRecordResponseBody getBody() {
        return this.body;
    }

}
