// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyDataFlowAutoRefreshResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDataFlowAutoRefreshResponseBody body;

    public static ModifyDataFlowAutoRefreshResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataFlowAutoRefreshResponse self = new ModifyDataFlowAutoRefreshResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDataFlowAutoRefreshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDataFlowAutoRefreshResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDataFlowAutoRefreshResponse setBody(ModifyDataFlowAutoRefreshResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDataFlowAutoRefreshResponseBody getBody() {
        return this.body;
    }

}
