// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class SetFundAccountLowAvailableAmountAlarmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetFundAccountLowAvailableAmountAlarmResponseBody body;

    public static SetFundAccountLowAvailableAmountAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        SetFundAccountLowAvailableAmountAlarmResponse self = new SetFundAccountLowAvailableAmountAlarmResponse();
        return TeaModel.build(map, self);
    }

    public SetFundAccountLowAvailableAmountAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetFundAccountLowAvailableAmountAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetFundAccountLowAvailableAmountAlarmResponse setBody(SetFundAccountLowAvailableAmountAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public SetFundAccountLowAvailableAmountAlarmResponseBody getBody() {
        return this.body;
    }

}
