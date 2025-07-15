// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePrivateLineAvailGAResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLivePrivateLineAvailGAResponseBody body;

    public static DescribeLivePrivateLineAvailGAResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePrivateLineAvailGAResponse self = new DescribeLivePrivateLineAvailGAResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLivePrivateLineAvailGAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLivePrivateLineAvailGAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLivePrivateLineAvailGAResponse setBody(DescribeLivePrivateLineAvailGAResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLivePrivateLineAvailGAResponseBody getBody() {
        return this.body;
    }

}
