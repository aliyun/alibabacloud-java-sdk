// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBatchTaskInfoByVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBatchTaskInfoByVersionResponseBody body;

    public static GetBatchTaskInfoByVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTaskInfoByVersionResponse self = new GetBatchTaskInfoByVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetBatchTaskInfoByVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBatchTaskInfoByVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBatchTaskInfoByVersionResponse setBody(GetBatchTaskInfoByVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBatchTaskInfoByVersionResponseBody getBody() {
        return this.body;
    }

}
