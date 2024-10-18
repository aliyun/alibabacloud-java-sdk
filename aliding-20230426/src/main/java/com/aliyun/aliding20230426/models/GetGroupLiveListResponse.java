// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetGroupLiveListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGroupLiveListResponseBody body;

    public static GetGroupLiveListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGroupLiveListResponse self = new GetGroupLiveListResponse();
        return TeaModel.build(map, self);
    }

    public GetGroupLiveListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGroupLiveListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGroupLiveListResponse setBody(GetGroupLiveListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGroupLiveListResponseBody getBody() {
        return this.body;
    }

}
