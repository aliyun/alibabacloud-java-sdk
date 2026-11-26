// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetMyAgenticNotificationChannelAuthorizeUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMyAgenticNotificationChannelAuthorizeUrlResponseBody body;

    public static GetMyAgenticNotificationChannelAuthorizeUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMyAgenticNotificationChannelAuthorizeUrlResponse self = new GetMyAgenticNotificationChannelAuthorizeUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetMyAgenticNotificationChannelAuthorizeUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMyAgenticNotificationChannelAuthorizeUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMyAgenticNotificationChannelAuthorizeUrlResponse setBody(GetMyAgenticNotificationChannelAuthorizeUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMyAgenticNotificationChannelAuthorizeUrlResponseBody getBody() {
        return this.body;
    }

}
