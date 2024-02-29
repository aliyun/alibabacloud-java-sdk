// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ApplyDataFlowAutoRefreshResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyDataFlowAutoRefreshResponseBody body;

    public static ApplyDataFlowAutoRefreshResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyDataFlowAutoRefreshResponse self = new ApplyDataFlowAutoRefreshResponse();
        return TeaModel.build(map, self);
    }

    public ApplyDataFlowAutoRefreshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyDataFlowAutoRefreshResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyDataFlowAutoRefreshResponse setBody(ApplyDataFlowAutoRefreshResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyDataFlowAutoRefreshResponseBody getBody() {
        return this.body;
    }

}
