// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ModifyDistributionItemInventoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDistributionItemInventoryResponseBody body;

    public static ModifyDistributionItemInventoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDistributionItemInventoryResponse self = new ModifyDistributionItemInventoryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDistributionItemInventoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDistributionItemInventoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDistributionItemInventoryResponse setBody(ModifyDistributionItemInventoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDistributionItemInventoryResponseBody getBody() {
        return this.body;
    }

}
