// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeBizTypeTextLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBizTypeTextLibResponseBody body;

    public static DescribeBizTypeTextLibResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizTypeTextLibResponse self = new DescribeBizTypeTextLibResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBizTypeTextLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBizTypeTextLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBizTypeTextLibResponse setBody(DescribeBizTypeTextLibResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBizTypeTextLibResponseBody getBody() {
        return this.body;
    }

}
