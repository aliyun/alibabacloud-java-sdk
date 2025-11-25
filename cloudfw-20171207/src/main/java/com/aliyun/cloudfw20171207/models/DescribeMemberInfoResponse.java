// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeMemberInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMemberInfoResponseBody body;

    public static DescribeMemberInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMemberInfoResponse self = new DescribeMemberInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMemberInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMemberInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMemberInfoResponse setBody(DescribeMemberInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMemberInfoResponseBody getBody() {
        return this.body;
    }

}
