// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSdlEventDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSdlEventDetailResponseBody body;

    public static DescribeSdlEventDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdlEventDetailResponse self = new DescribeSdlEventDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSdlEventDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSdlEventDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSdlEventDetailResponse setBody(DescribeSdlEventDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSdlEventDetailResponseBody getBody() {
        return this.body;
    }

}
