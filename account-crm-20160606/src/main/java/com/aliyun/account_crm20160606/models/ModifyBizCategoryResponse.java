// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ModifyBizCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBizCategoryResponseBody body;

    public static ModifyBizCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBizCategoryResponse self = new ModifyBizCategoryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBizCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBizCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBizCategoryResponse setBody(ModifyBizCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBizCategoryResponseBody getBody() {
        return this.body;
    }

}
