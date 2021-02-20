// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportMeasurementDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportMeasurementDataResponseBody body;

    public static ExportMeasurementDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportMeasurementDataResponse self = new ExportMeasurementDataResponse();
        return TeaModel.build(map, self);
    }

    public ExportMeasurementDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportMeasurementDataResponse setBody(ExportMeasurementDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportMeasurementDataResponseBody getBody() {
        return this.body;
    }

}
