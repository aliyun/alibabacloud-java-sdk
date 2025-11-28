// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeMemberTotalStatInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMemberTotalStatInfoResponseBody body;

    public static DescribeMemberTotalStatInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMemberTotalStatInfoResponse self = new DescribeMemberTotalStatInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMemberTotalStatInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMemberTotalStatInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMemberTotalStatInfoResponse setBody(DescribeMemberTotalStatInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMemberTotalStatInfoResponseBody getBody() {
        return this.body;
    }

}
