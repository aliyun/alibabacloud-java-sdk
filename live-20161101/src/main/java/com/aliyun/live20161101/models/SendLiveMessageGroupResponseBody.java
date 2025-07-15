// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendLiveMessageGroupResponseBody extends TeaModel {
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
     * <p>E4C1245F-597B-1BD1-B9BB-9D220E99****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SendLiveMessageGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendLiveMessageGroupResponseBody self = new SendLiveMessageGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public SendLiveMessageGroupResponseBody setMsgTid(String msgTid) {
        this.msgTid = msgTid;
        return this;
    }
    public String getMsgTid() {
        return this.msgTid;
    }

    public SendLiveMessageGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
