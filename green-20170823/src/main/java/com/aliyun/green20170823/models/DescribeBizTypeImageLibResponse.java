// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeBizTypeImageLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBizTypeImageLibResponseBody body;

    public static DescribeBizTypeImageLibResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizTypeImageLibResponse self = new DescribeBizTypeImageLibResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBizTypeImageLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBizTypeImageLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBizTypeImageLibResponse setBody(DescribeBizTypeImageLibResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBizTypeImageLibResponseBody getBody() {
        return this.body;
    }

}
