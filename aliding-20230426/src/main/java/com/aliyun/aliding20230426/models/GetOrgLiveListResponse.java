// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetOrgLiveListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOrgLiveListResponseBody body;

    public static GetOrgLiveListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrgLiveListResponse self = new GetOrgLiveListResponse();
        return TeaModel.build(map, self);
    }

    public GetOrgLiveListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrgLiveListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrgLiveListResponse setBody(GetOrgLiveListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrgLiveListResponseBody getBody() {
        return this.body;
    }

}
