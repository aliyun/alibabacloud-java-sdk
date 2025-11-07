// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ModifyCustomizeFlowStrategyListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCustomizeFlowStrategyListResponseBody body;

    public static ModifyCustomizeFlowStrategyListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomizeFlowStrategyListResponse self = new ModifyCustomizeFlowStrategyListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCustomizeFlowStrategyListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCustomizeFlowStrategyListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCustomizeFlowStrategyListResponse setBody(ModifyCustomizeFlowStrategyListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCustomizeFlowStrategyListResponseBody getBody() {
        return this.body;
    }

}
