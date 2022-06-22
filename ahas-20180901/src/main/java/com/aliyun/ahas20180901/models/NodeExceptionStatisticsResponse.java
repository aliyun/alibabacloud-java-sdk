// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class NodeExceptionStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public NodeExceptionStatisticsResponseBody body;

    public static NodeExceptionStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        NodeExceptionStatisticsResponse self = new NodeExceptionStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public NodeExceptionStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NodeExceptionStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NodeExceptionStatisticsResponse setBody(NodeExceptionStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public NodeExceptionStatisticsResponseBody getBody() {
        return this.body;
    }

}
