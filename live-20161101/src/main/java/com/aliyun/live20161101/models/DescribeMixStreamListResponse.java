// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeMixStreamListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMixStreamListResponseBody body;

    public static DescribeMixStreamListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMixStreamListResponse self = new DescribeMixStreamListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMixStreamListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMixStreamListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMixStreamListResponse setBody(DescribeMixStreamListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMixStreamListResponseBody getBody() {
        return this.body;
    }

}
