// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveMessageUserMessageRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The data center, which must be the same as the data center specified in <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a>. Currently, Shanghai (cn-shanghai) and Singapore (ap-southeast-1) are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The ID of the user who initiates the message deletion. The value consists of uppercase and lowercase letters and digits, and cannot exceed 64 bytes in length. This parameter is required in practice. If not specified, InputInvalid is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>169830****</p>
     */
    @NameInMap("DeleterId")
    public String deleterId;

    /**
     * <p>The extended information of the user who initiates the message deletion. The value cannot exceed 512 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("DeleterInfo")
    public String deleterInfo;

    /**
     * <p>The ID of the message to be deleted, which corresponds to the MsgTid in the send message operation. The value consists of uppercase and lowercase letters and digits, and cannot exceed 64 bytes in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The ID of the user who receives the delete message notification. The value consists of uppercase and lowercase letters and digits, and cannot exceed 64 bytes in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>169830****</p>
     */
    @NameInMap("ReceiverId")
    public String receiverId;

    public static DeleteLiveMessageUserMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveMessageUserMessageRequest self = new DeleteLiveMessageUserMessageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveMessageUserMessageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteLiveMessageUserMessageRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public DeleteLiveMessageUserMessageRequest setDeleterId(String deleterId) {
        this.deleterId = deleterId;
        return this;
    }
    public String getDeleterId() {
        return this.deleterId;
    }

    public DeleteLiveMessageUserMessageRequest setDeleterInfo(String deleterInfo) {
        this.deleterInfo = deleterInfo;
        return this;
    }
    public String getDeleterInfo() {
        return this.deleterInfo;
    }

    public DeleteLiveMessageUserMessageRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public DeleteLiveMessageUserMessageRequest setReceiverId(String receiverId) {
        this.receiverId = receiverId;
        return this;
    }
    public String getReceiverId() {
        return this.receiverId;
    }

}
