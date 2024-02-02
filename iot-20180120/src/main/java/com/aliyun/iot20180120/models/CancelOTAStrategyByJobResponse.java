// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CancelOTAStrategyByJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelOTAStrategyByJobResponseBody body;

    public static CancelOTAStrategyByJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelOTAStrategyByJobResponse self = new CancelOTAStrategyByJobResponse();
        return TeaModel.build(map, self);
    }

    public CancelOTAStrategyByJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelOTAStrategyByJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelOTAStrategyByJobResponse setBody(CancelOTAStrategyByJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelOTAStrategyByJobResponseBody getBody() {
        return this.body;
    }

}
