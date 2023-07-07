// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class RecordDemandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecordDemandResponseBody body;

    public static RecordDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        RecordDemandResponse self = new RecordDemandResponse();
        return TeaModel.build(map, self);
    }

    public RecordDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecordDemandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecordDemandResponse setBody(RecordDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public RecordDemandResponseBody getBody() {
        return this.body;
    }

}
