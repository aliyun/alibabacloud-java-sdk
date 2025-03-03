// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class SetFundAccountCreditAmountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetFundAccountCreditAmountResponseBody body;

    public static SetFundAccountCreditAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        SetFundAccountCreditAmountResponse self = new SetFundAccountCreditAmountResponse();
        return TeaModel.build(map, self);
    }

    public SetFundAccountCreditAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetFundAccountCreditAmountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetFundAccountCreditAmountResponse setBody(SetFundAccountCreditAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public SetFundAccountCreditAmountResponseBody getBody() {
        return this.body;
    }

}
