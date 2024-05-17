// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteStreamingDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStreamingDataSourceResponseBody body;

    public static DeleteStreamingDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamingDataSourceResponse self = new DeleteStreamingDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStreamingDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStreamingDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStreamingDataSourceResponse setBody(DeleteStreamingDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStreamingDataSourceResponseBody getBody() {
        return this.body;
    }

}
