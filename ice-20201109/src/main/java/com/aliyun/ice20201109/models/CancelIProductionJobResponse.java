// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CancelIProductionJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelIProductionJobResponseBody body;

    public static CancelIProductionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelIProductionJobResponse self = new CancelIProductionJobResponse();
        return TeaModel.build(map, self);
    }

    public CancelIProductionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelIProductionJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelIProductionJobResponse setBody(CancelIProductionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelIProductionJobResponseBody getBody() {
        return this.body;
    }

}
