// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class NotifyUserBusinessCommandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("MessageID")
    public String messageID;

    public static NotifyUserBusinessCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NotifyUserBusinessCommandResponseBody self = new NotifyUserBusinessCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public NotifyUserBusinessCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NotifyUserBusinessCommandResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public NotifyUserBusinessCommandResponseBody setMessageID(String messageID) {
        this.messageID = messageID;
        return this;
    }
    public String getMessageID() {
        return this.messageID;
    }

}
