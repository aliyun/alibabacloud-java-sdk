// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetEditingJobInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEditingJobInfoResponseBody body;

    public static GetEditingJobInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEditingJobInfoResponse self = new GetEditingJobInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetEditingJobInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEditingJobInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEditingJobInfoResponse setBody(GetEditingJobInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEditingJobInfoResponseBody getBody() {
        return this.body;
    }

}
