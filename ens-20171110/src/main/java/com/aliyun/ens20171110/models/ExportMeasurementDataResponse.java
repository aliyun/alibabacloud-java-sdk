// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportMeasurementDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ExportMeasurementDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportMeasurementDataResponse setBody(ExportMeasurementDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportMeasurementDataResponseBody getBody() {
        return this.body;
    }

}
