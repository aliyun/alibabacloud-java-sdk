// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRecordResponseBody body;

    public static GetRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecordResponse self = new GetRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRecordResponse setBody(GetRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRecordResponseBody getBody() {
        return this.body;
    }

}
