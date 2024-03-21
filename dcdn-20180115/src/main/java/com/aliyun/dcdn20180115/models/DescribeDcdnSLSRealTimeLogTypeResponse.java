// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSLSRealTimeLogTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnSLSRealTimeLogTypeResponseBody body;

    public static DescribeDcdnSLSRealTimeLogTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSLSRealTimeLogTypeResponse self = new DescribeDcdnSLSRealTimeLogTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSLSRealTimeLogTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnSLSRealTimeLogTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnSLSRealTimeLogTypeResponse setBody(DescribeDcdnSLSRealTimeLogTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnSLSRealTimeLogTypeResponseBody getBody() {
        return this.body;
    }

}
