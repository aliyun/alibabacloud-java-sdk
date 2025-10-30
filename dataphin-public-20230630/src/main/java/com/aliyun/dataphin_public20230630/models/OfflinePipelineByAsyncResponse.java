// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OfflinePipelineByAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflinePipelineByAsyncResponseBody body;

    public static OfflinePipelineByAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflinePipelineByAsyncResponse self = new OfflinePipelineByAsyncResponse();
        return TeaModel.build(map, self);
    }

    public OfflinePipelineByAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflinePipelineByAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflinePipelineByAsyncResponse setBody(OfflinePipelineByAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflinePipelineByAsyncResponseBody getBody() {
        return this.body;
    }

}
