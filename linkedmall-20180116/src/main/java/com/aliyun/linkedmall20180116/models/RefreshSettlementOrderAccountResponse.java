// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefreshSettlementOrderAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshSettlementOrderAccountResponseBody body;

    public static RefreshSettlementOrderAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshSettlementOrderAccountResponse self = new RefreshSettlementOrderAccountResponse();
        return TeaModel.build(map, self);
    }

    public RefreshSettlementOrderAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshSettlementOrderAccountResponse setBody(RefreshSettlementOrderAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshSettlementOrderAccountResponseBody getBody() {
        return this.body;
    }

}
