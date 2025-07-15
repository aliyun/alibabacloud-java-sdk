// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveMessageGroupMessageResponseBody extends TeaModel {
    /**
     * <p>The group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the deleted or non-existent message.</p>
     * 
     * <strong>example:</strong>
     * <p>a74a8fbd3cfe4b2daa8517e4e3******</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B95BE680-5A6A-1CAD-8AB1-09DFF5D6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveMessageGroupMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveMessageGroupMessageResponseBody self = new DeleteLiveMessageGroupMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveMessageGroupMessageResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteLiveMessageGroupMessageResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public DeleteLiveMessageGroupMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
