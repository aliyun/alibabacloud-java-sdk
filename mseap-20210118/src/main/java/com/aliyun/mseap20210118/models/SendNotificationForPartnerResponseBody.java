// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class SendNotificationForPartnerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11111111111111111111111</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>0A011920166449C2FAAE8D179E1704C5</p>
     */
    @NameInMap("MsgId")
    public String msgId;

    /**
     * <strong>example:</strong>
     * <p>1940A84F-6D90-5764-9119-6279970C6FF5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SendNotificationForPartnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendNotificationForPartnerResponseBody self = new SendNotificationForPartnerResponseBody();
        return TeaModel.build(map, self);
    }

    public SendNotificationForPartnerResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SendNotificationForPartnerResponseBody setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public SendNotificationForPartnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendNotificationForPartnerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
