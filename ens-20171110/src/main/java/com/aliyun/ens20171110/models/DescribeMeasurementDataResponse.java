// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeMeasurementDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMeasurementDataResponseBody body;

    public static DescribeMeasurementDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeasurementDataResponse self = new DescribeMeasurementDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeasurementDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeasurementDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeasurementDataResponse setBody(DescribeMeasurementDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeasurementDataResponseBody getBody() {
        return this.body;
    }

}
