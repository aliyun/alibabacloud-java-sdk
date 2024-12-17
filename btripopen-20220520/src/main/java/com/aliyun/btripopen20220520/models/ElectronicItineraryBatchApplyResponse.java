// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ElectronicItineraryBatchApplyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ElectronicItineraryBatchApplyResponseBody body;

    public static ElectronicItineraryBatchApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        ElectronicItineraryBatchApplyResponse self = new ElectronicItineraryBatchApplyResponse();
        return TeaModel.build(map, self);
    }

    public ElectronicItineraryBatchApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ElectronicItineraryBatchApplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ElectronicItineraryBatchApplyResponse setBody(ElectronicItineraryBatchApplyResponseBody body) {
        this.body = body;
        return this;
    }
    public ElectronicItineraryBatchApplyResponseBody getBody() {
        return this.body;
    }

}
