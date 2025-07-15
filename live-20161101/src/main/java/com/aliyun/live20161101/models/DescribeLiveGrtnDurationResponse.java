// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveGrtnDurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveGrtnDurationResponseBody body;

    public static DescribeLiveGrtnDurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveGrtnDurationResponse self = new DescribeLiveGrtnDurationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveGrtnDurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveGrtnDurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveGrtnDurationResponse setBody(DescribeLiveGrtnDurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveGrtnDurationResponseBody getBody() {
        return this.body;
    }

}
