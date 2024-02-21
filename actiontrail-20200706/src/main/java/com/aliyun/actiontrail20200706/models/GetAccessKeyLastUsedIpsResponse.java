// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccessKeyLastUsedIpsResponseBody body;

    public static GetAccessKeyLastUsedIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedIpsResponse self = new GetAccessKeyLastUsedIpsResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessKeyLastUsedIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccessKeyLastUsedIpsResponse setBody(GetAccessKeyLastUsedIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessKeyLastUsedIpsResponseBody getBody() {
        return this.body;
    }

}
