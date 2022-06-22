// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetUnFinishedPublishOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUnFinishedPublishOrderResponseBody body;

    public static GetUnFinishedPublishOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUnFinishedPublishOrderResponse self = new GetUnFinishedPublishOrderResponse();
        return TeaModel.build(map, self);
    }

    public GetUnFinishedPublishOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUnFinishedPublishOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUnFinishedPublishOrderResponse setBody(GetUnFinishedPublishOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUnFinishedPublishOrderResponseBody getBody() {
        return this.body;
    }

}
