// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitIProductionJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitIProductionJobResponseBody body;

    public static SubmitIProductionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitIProductionJobResponse self = new SubmitIProductionJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitIProductionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitIProductionJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitIProductionJobResponse setBody(SubmitIProductionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitIProductionJobResponseBody getBody() {
        return this.body;
    }

}
