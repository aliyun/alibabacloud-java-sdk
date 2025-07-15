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
     * <p>The data center where the interactive messaging application is deployed. Set this parameter to the value of DataCenter that you specified when you called the <a href="https://help.aliyun.com/document_detail/2593195.html">CreateLiveMessageApp</a> operation. Valid values: cn-shanghai (Shanghai) and ap-southeast-1 (Singapore).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The ID of the user who performs the deletion operation. The ID can contain only letters and digits and can be up to 64 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>169830****</p>
     */
    @NameInMap("DeleterId")
    public String deleterId;

    /**
     * <p>The additional information about the user who performs the deletion operation. The value can be up to 512 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("DeleterInfo")
    public String deleterInfo;

    /**
     * <p>The ID of the message that you want to delete. Set this parameter to the value of MsgTid that you specified when you called the SendLiveMessageUser operation. The ID can contain only letters and digits and can be up to 64 bytes in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The ID of the user who received the message to delete. The ID can contain only letters and digits and can be up to 64 bytes in length.</p>
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
