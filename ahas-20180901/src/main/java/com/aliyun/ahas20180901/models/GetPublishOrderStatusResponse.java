// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetPublishOrderStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPublishOrderStatusResponseBody body;

    public static GetPublishOrderStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublishOrderStatusResponse self = new GetPublishOrderStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetPublishOrderStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPublishOrderStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPublishOrderStatusResponse setBody(GetPublishOrderStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPublishOrderStatusResponseBody getBody() {
        return this.body;
    }

}
