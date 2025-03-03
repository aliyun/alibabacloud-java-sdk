// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountLowAvailableAmountAlarmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFundAccountLowAvailableAmountAlarmResponseBody body;

    public static GetFundAccountLowAvailableAmountAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountLowAvailableAmountAlarmResponse self = new GetFundAccountLowAvailableAmountAlarmResponse();
        return TeaModel.build(map, self);
    }

    public GetFundAccountLowAvailableAmountAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFundAccountLowAvailableAmountAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFundAccountLowAvailableAmountAlarmResponse setBody(GetFundAccountLowAvailableAmountAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFundAccountLowAvailableAmountAlarmResponseBody getBody() {
        return this.body;
    }

}
