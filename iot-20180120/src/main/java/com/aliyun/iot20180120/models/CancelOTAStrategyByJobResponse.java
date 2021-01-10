// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CancelOTAStrategyByJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CancelOTAStrategyByJobResponse setBody(CancelOTAStrategyByJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelOTAStrategyByJobResponseBody getBody() {
        return this.body;
    }

}
