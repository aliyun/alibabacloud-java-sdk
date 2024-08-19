// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetJobNameListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJobNameListResponseBody body;

    public static GetJobNameListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobNameListResponse self = new GetJobNameListResponse();
        return TeaModel.build(map, self);
    }

    public GetJobNameListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobNameListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobNameListResponse setBody(GetJobNameListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobNameListResponseBody getBody() {
        return this.body;
    }

}
