// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMmsJobResponseBody body;

    public static GetMmsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMmsJobResponse self = new GetMmsJobResponse();
        return TeaModel.build(map, self);
    }

    public GetMmsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMmsJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMmsJobResponse setBody(GetMmsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMmsJobResponseBody getBody() {
        return this.body;
    }

}
