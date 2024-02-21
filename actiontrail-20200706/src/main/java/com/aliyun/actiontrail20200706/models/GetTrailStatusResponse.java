// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetTrailStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTrailStatusResponseBody body;

    public static GetTrailStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrailStatusResponse self = new GetTrailStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetTrailStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrailStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrailStatusResponse setBody(GetTrailStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrailStatusResponseBody getBody() {
        return this.body;
    }

}
