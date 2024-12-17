// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ElectronicItineraryGetApplyResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ElectronicItineraryGetApplyResultResponseBody body;

    public static ElectronicItineraryGetApplyResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ElectronicItineraryGetApplyResultResponse self = new ElectronicItineraryGetApplyResultResponse();
        return TeaModel.build(map, self);
    }

    public ElectronicItineraryGetApplyResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ElectronicItineraryGetApplyResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ElectronicItineraryGetApplyResultResponse setBody(ElectronicItineraryGetApplyResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ElectronicItineraryGetApplyResultResponseBody getBody() {
        return this.body;
    }

}
