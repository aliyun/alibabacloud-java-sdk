// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsServiceLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDtsServiceLogResponseBody body;

    public static DescribeDtsServiceLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsServiceLogResponse self = new DescribeDtsServiceLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDtsServiceLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDtsServiceLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDtsServiceLogResponse setBody(DescribeDtsServiceLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDtsServiceLogResponseBody getBody() {
        return this.body;
    }

}
