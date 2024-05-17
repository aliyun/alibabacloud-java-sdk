// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateStreamingDataServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStreamingDataServiceResponseBody body;

    public static CreateStreamingDataServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamingDataServiceResponse self = new CreateStreamingDataServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateStreamingDataServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStreamingDataServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStreamingDataServiceResponse setBody(CreateStreamingDataServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStreamingDataServiceResponseBody getBody() {
        return this.body;
    }

}
