// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveMessageGroupMessageRequest extends TeaModel {
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
     * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a> operation to create the interactive messaging application. Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The ID of the user who deletes the message. The ID must be up to 64 bytes in length and can contain letters and digits.</p>
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
     * <p>testname</p>
     */
    @NameInMap("DeleterInfo")
    public String deleterInfo;

    /**
     * <p>The group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the message that you want to delete. Set this parameter to the value of MsgTid that you specified when you called the SendLiveMessageGroup operation. The ID must be up to 64 bytes in length and can contain letters and digits.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a74a8fbd3cfe4b2daa8517e4e3******</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    public static DeleteLiveMessageGroupMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveMessageGroupMessageRequest self = new DeleteLiveMessageGroupMessageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveMessageGroupMessageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteLiveMessageGroupMessageRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public DeleteLiveMessageGroupMessageRequest setDeleterId(String deleterId) {
        this.deleterId = deleterId;
        return this;
    }
    public String getDeleterId() {
        return this.deleterId;
    }

    public DeleteLiveMessageGroupMessageRequest setDeleterInfo(String deleterInfo) {
        this.deleterInfo = deleterInfo;
        return this;
    }
    public String getDeleterInfo() {
        return this.deleterInfo;
    }

    public DeleteLiveMessageGroupMessageRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteLiveMessageGroupMessageRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
