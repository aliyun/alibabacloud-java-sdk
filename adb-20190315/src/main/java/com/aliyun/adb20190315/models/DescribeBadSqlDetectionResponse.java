// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeBadSqlDetectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBadSqlDetectionResponseBody body;

    public static DescribeBadSqlDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBadSqlDetectionResponse self = new DescribeBadSqlDetectionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBadSqlDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBadSqlDetectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBadSqlDetectionResponse setBody(DescribeBadSqlDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBadSqlDetectionResponseBody getBody() {
        return this.body;
    }

}
