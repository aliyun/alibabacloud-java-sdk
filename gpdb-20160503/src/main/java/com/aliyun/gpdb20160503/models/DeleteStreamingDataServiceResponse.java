// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteStreamingDataServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStreamingDataServiceResponseBody body;

    public static DeleteStreamingDataServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamingDataServiceResponse self = new DeleteStreamingDataServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStreamingDataServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStreamingDataServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStreamingDataServiceResponse setBody(DeleteStreamingDataServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStreamingDataServiceResponseBody getBody() {
        return this.body;
    }

}
