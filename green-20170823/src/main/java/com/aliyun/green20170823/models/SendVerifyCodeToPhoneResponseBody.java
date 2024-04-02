// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class SendVerifyCodeToPhoneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SendVerifyCodeToPhoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendVerifyCodeToPhoneResponseBody self = new SendVerifyCodeToPhoneResponseBody();
        return TeaModel.build(map, self);
    }

    public SendVerifyCodeToPhoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
