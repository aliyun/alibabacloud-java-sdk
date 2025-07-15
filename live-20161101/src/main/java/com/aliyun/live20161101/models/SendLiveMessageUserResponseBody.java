// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendLiveMessageUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the message, which is a unique identifier that can be used to delete the message. The ID can be up to 64 bytes in length and can contain letters and digits.</p>
     * 
     * <strong>example:</strong>
     * <p>169830****</p>
     */
    @NameInMap("MsgTid")
    public String msgTid;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6CFDE7AB-571A-14EA-B072-989FF753****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SendLiveMessageUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendLiveMessageUserResponseBody self = new SendLiveMessageUserResponseBody();
        return TeaModel.build(map, self);
    }

    public SendLiveMessageUserResponseBody setMsgTid(String msgTid) {
        this.msgTid = msgTid;
        return this;
    }
    public String getMsgTid() {
        return this.msgTid;
    }

    public SendLiveMessageUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
