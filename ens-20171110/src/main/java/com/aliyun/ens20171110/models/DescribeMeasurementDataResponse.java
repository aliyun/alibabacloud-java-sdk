// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeMeasurementDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeMeasurementDataResponse setBody(DescribeMeasurementDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeasurementDataResponseBody getBody() {
        return this.body;
    }

}
