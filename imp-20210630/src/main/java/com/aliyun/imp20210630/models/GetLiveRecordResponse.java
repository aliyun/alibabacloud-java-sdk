// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public GetLiveRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLiveRecordResponse setBody(GetLiveRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveRecordResponseBody getBody() {
        return this.body;
    }

}
