// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyBizItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyBizItemsResponseBody body;

    public static ModifyBizItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBizItemsResponse self = new ModifyBizItemsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBizItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBizItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBizItemsResponse setBody(ModifyBizItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBizItemsResponseBody getBody() {
        return this.body;
    }

}
