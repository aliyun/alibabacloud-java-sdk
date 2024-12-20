// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetRecordUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRecordUrlResponseBody body;

    public static GetRecordUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecordUrlResponse self = new GetRecordUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetRecordUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRecordUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRecordUrlResponse setBody(GetRecordUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRecordUrlResponseBody getBody() {
        return this.body;
    }

}
