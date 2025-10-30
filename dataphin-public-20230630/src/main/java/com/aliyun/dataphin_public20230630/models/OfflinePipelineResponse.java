// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OfflinePipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflinePipelineResponseBody body;

    public static OfflinePipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflinePipelineResponse self = new OfflinePipelineResponse();
        return TeaModel.build(map, self);
    }

    public OfflinePipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflinePipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflinePipelineResponse setBody(OfflinePipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflinePipelineResponseBody getBody() {
        return this.body;
    }

}
