// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifySettleAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySettleAccountResponseBody body;

    public static ModifySettleAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySettleAccountResponse self = new ModifySettleAccountResponse();
        return TeaModel.build(map, self);
    }

    public ModifySettleAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySettleAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySettleAccountResponse setBody(ModifySettleAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySettleAccountResponseBody getBody() {
        return this.body;
    }

}
