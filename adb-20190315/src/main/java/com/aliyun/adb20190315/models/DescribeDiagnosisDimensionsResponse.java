// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisDimensionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiagnosisDimensionsResponseBody body;

    public static DescribeDiagnosisDimensionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisDimensionsResponse self = new DescribeDiagnosisDimensionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisDimensionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiagnosisDimensionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiagnosisDimensionsResponse setBody(DescribeDiagnosisDimensionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnosisDimensionsResponseBody getBody() {
        return this.body;
    }

}
