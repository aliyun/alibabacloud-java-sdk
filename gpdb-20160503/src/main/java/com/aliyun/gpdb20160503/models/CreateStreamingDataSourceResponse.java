// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateStreamingDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStreamingDataSourceResponseBody body;

    public static CreateStreamingDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamingDataSourceResponse self = new CreateStreamingDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateStreamingDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStreamingDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStreamingDataSourceResponse setBody(CreateStreamingDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStreamingDataSourceResponseBody getBody() {
        return this.body;
    }

}
