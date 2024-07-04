// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetIndexJobStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIndexJobStatusResponseBody body;

    public static GetIndexJobStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIndexJobStatusResponse self = new GetIndexJobStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetIndexJobStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIndexJobStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIndexJobStatusResponse setBody(GetIndexJobStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIndexJobStatusResponseBody getBody() {
        return this.body;
    }

}
