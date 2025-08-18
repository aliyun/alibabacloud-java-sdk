// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeUrlObservationDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUrlObservationDataResponseBody body;

    public static DescribeUrlObservationDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUrlObservationDataResponse self = new DescribeUrlObservationDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUrlObservationDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUrlObservationDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUrlObservationDataResponse setBody(DescribeUrlObservationDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUrlObservationDataResponseBody getBody() {
        return this.body;
    }

}
