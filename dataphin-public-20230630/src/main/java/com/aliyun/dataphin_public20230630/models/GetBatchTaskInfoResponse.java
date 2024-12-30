// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBatchTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBatchTaskInfoResponseBody body;

    public static GetBatchTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTaskInfoResponse self = new GetBatchTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetBatchTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBatchTaskInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBatchTaskInfoResponse setBody(GetBatchTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBatchTaskInfoResponseBody getBody() {
        return this.body;
    }

}
