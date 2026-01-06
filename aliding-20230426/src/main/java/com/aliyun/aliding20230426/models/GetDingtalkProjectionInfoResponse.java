// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkProjectionInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDingtalkProjectionInfoResponseBody body;

    public static GetDingtalkProjectionInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkProjectionInfoResponse self = new GetDingtalkProjectionInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDingtalkProjectionInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDingtalkProjectionInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDingtalkProjectionInfoResponse setBody(GetDingtalkProjectionInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDingtalkProjectionInfoResponseBody getBody() {
        return this.body;
    }

}
