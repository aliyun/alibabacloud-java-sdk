// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccessKeyLastUsedInfoResponseBody body;

    public static GetAccessKeyLastUsedInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedInfoResponse self = new GetAccessKeyLastUsedInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessKeyLastUsedInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccessKeyLastUsedInfoResponse setBody(GetAccessKeyLastUsedInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessKeyLastUsedInfoResponseBody getBody() {
        return this.body;
    }

}
