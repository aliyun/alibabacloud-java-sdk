// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelDataFlowAutoRefreshResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelDataFlowAutoRefreshResponseBody body;

    public static CancelDataFlowAutoRefreshResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelDataFlowAutoRefreshResponse self = new CancelDataFlowAutoRefreshResponse();
        return TeaModel.build(map, self);
    }

    public CancelDataFlowAutoRefreshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelDataFlowAutoRefreshResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelDataFlowAutoRefreshResponse setBody(CancelDataFlowAutoRefreshResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelDataFlowAutoRefreshResponseBody getBody() {
        return this.body;
    }

}
