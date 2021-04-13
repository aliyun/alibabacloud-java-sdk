// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class SendCommonMessageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("MessageID")
    public String messageID;

    public static SendCommonMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendCommonMessageResponseBody self = new SendCommonMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendCommonMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendCommonMessageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SendCommonMessageResponseBody setMessageID(String messageID) {
        this.messageID = messageID;
        return this;
    }
    public String getMessageID() {
        return this.messageID;
    }

}
