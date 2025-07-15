// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendLiveMessageUserRequest extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application in which the message is sent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The message body. It can be up to 15 KB in length.</p>
     * 
     * <strong>example:</strong>
     * <p>hello, user</p>
     */
    @NameInMap("Body")
    public String body;

    /**
     * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a> operation to create the interactive messaging application. Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>Specifies whether to set the message as a highly reliable message. A highly reliable message ensures that success is returned only after the receiver has received the message and responded. If the receiver does not respond within 3 seconds, failure is returned.</p>
     * <ul>
     * <li>true: sets the message as a highly reliable message.</li>
     * <li>false (default): does not set the message as a highly reliable message.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is supported only by the client SDK V1.5.1 and later. When you send a message to a client with an earlier SDK version, the message can be successfully sent without waiting for an acknowledgement (ACK) response.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HighReliability")
    public Boolean highReliability;

    /**
     * <p>The ID of the message, which is a unique identifier that can be used to delete the message. The ID can be up to 64 bytes in length and can contain letters and digits.</p>
     * 
     * <strong>example:</strong>
     * <p>169830****</p>
     */
    @NameInMap("MsgTid")
    public String msgTid;

    /**
     * <p>The message type.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MsgType")
    public Long msgType;

    /**
     * <p>The ID of the user who receives the message. The ID can be up to 64 bytes in length and can contain letters and digits.</p>
     * <blockquote>
     * <p> Make sure that the user who receives the message is online. You can call the CheckLiveMessageUsersOnline operation to query whether the user is online.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>uid2</p>
     */
    @NameInMap("ReceiverId")
    public String receiverId;

    /**
     * <p>The ID of the user who sends the message. The ID can be up to 64 bytes in length and can contain letters and digits.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>uid1</p>
     */
    @NameInMap("SenderId")
    public String senderId;

    /**
     * <p>The additional information about the user who sends the message. It can be up to 512 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>uid1meta1</p>
     */
    @NameInMap("SenderInfo")
    public String senderInfo;

    /**
     * <p>Specifies whether to store the message.</p>
     * <ul>
     * <li>true: stores the message.</li>
     * <li>false (default): does not store the message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Storage")
    public Boolean storage;

    public static SendLiveMessageUserRequest build(java.util.Map<String, ?> map) throws Exception {
        SendLiveMessageUserRequest self = new SendLiveMessageUserRequest();
        return TeaModel.build(map, self);
    }

    public SendLiveMessageUserRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SendLiveMessageUserRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public SendLiveMessageUserRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public SendLiveMessageUserRequest setHighReliability(Boolean highReliability) {
        this.highReliability = highReliability;
        return this;
    }
    public Boolean getHighReliability() {
        return this.highReliability;
    }

    public SendLiveMessageUserRequest setMsgTid(String msgTid) {
        this.msgTid = msgTid;
        return this;
    }
    public String getMsgTid() {
        return this.msgTid;
    }

    public SendLiveMessageUserRequest setMsgType(Long msgType) {
        this.msgType = msgType;
        return this;
    }
    public Long getMsgType() {
        return this.msgType;
    }

    public SendLiveMessageUserRequest setReceiverId(String receiverId) {
        this.receiverId = receiverId;
        return this;
    }
    public String getReceiverId() {
        return this.receiverId;
    }

    public SendLiveMessageUserRequest setSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }
    public String getSenderId() {
        return this.senderId;
    }

    public SendLiveMessageUserRequest setSenderInfo(String senderInfo) {
        this.senderInfo = senderInfo;
        return this;
    }
    public String getSenderInfo() {
        return this.senderInfo;
    }

    public SendLiveMessageUserRequest setStorage(Boolean storage) {
        this.storage = storage;
        return this;
    }
    public Boolean getStorage() {
        return this.storage;
    }

}
