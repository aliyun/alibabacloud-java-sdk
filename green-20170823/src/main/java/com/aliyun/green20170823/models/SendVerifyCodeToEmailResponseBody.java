// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class SendVerifyCodeToEmailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SendVerifyCodeToEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendVerifyCodeToEmailResponseBody self = new SendVerifyCodeToEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public SendVerifyCodeToEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
