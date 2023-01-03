// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SendTTSVerifyLinkResponseBody extends TeaModel {
    // Indicates whether the mobile phone number verification text message was successfully sent.
    // 
    // *   `true`: Sent successfully
    // *   `false`: Failed to send
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static SendTTSVerifyLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendTTSVerifyLinkResponseBody self = new SendTTSVerifyLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public SendTTSVerifyLinkResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public SendTTSVerifyLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
