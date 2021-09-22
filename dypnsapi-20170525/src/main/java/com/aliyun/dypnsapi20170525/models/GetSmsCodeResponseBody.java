// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsCodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("SmsToken")
    public String smsToken;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSmsCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmsCodeResponseBody self = new GetSmsCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmsCodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSmsCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSmsCodeResponseBody setSmsToken(String smsToken) {
        this.smsToken = smsToken;
        return this;
    }
    public String getSmsToken() {
        return this.smsToken;
    }

    public GetSmsCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
