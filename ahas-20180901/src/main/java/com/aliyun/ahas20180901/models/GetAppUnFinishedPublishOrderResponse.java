// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetAppUnFinishedPublishOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppUnFinishedPublishOrderResponseBody body;

    public static GetAppUnFinishedPublishOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppUnFinishedPublishOrderResponse self = new GetAppUnFinishedPublishOrderResponse();
        return TeaModel.build(map, self);
    }

    public GetAppUnFinishedPublishOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppUnFinishedPublishOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppUnFinishedPublishOrderResponse setBody(GetAppUnFinishedPublishOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppUnFinishedPublishOrderResponseBody getBody() {
        return this.body;
    }

}
