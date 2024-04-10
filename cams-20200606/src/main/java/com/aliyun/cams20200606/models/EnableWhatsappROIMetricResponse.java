// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class EnableWhatsappROIMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableWhatsappROIMetricResponseBody body;

    public static EnableWhatsappROIMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableWhatsappROIMetricResponse self = new EnableWhatsappROIMetricResponse();
        return TeaModel.build(map, self);
    }

    public EnableWhatsappROIMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableWhatsappROIMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableWhatsappROIMetricResponse setBody(EnableWhatsappROIMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableWhatsappROIMetricResponseBody getBody() {
        return this.body;
    }

}
