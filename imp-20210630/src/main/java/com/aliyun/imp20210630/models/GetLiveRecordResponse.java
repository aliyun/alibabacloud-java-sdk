// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLiveRecordResponseBody body;

    public static GetLiveRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRecordResponse self = new GetLiveRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveRecordResponse setBody(GetLiveRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveRecordResponseBody getBody() {
        return this.body;
    }

}
