// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SendTTSVerifyLinkResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the mobile phone number verification text message was successfully sent.</p>
     * <br>
     * <p>*   `true`: Sent successfully</p>
     * <p>*   `false`: Failed to send</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     */
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
