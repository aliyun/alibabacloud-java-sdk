// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetCallDetailRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCallDetailRecordResponseBody body;

    public static GetCallDetailRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCallDetailRecordResponse self = new GetCallDetailRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetCallDetailRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCallDetailRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCallDetailRecordResponse setBody(GetCallDetailRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCallDetailRecordResponseBody getBody() {
        return this.body;
    }

}
