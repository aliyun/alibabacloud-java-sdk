// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendLiveMessageGroupRequest extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application in which the message is received.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The message body. The body can be up to 15 KB in length.</p>
     * 
     * <strong>example:</strong>
     * <p>hello,group</p>
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
     * <p>The ID of the group that receives the message.</p>
     * <blockquote>
     * <p> Make sure that the specified group ID exists. Otherwise, a ResourceNotExist error is returned.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest</p>
     */
    @NameInMap("GroupId")
    public String groupId;

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
     * <p>1</p>
     */
    @NameInMap("MsgType")
    public Long msgType;

    /**
     * <p>Specifies whether to disable message caching. Valid values: true and false. Default value: false, which specifies that the message is cached to the recent message list of the group.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NoCache")
    public Boolean noCache;

    /**
     * <p>Specifies whether to disable message storage. Valid values: true and false. Default value: false, which specifies that the message is stored for a validity period of 30 days. You can find the message in the response of the ListLiveMessageGroupMessages operation. If you do not want to store the message, set this parameter to true.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NoStorage")
    public Boolean noStorage;

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
     * <p>The additional information about the user who sends the message. The value can be up to 512 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>uid1meta1</p>
     */
    @NameInMap("SenderMetaInfo")
    public String senderMetaInfo;

    /**
     * <p>The contribution of the message to the increase in the number of messages of this type. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StaticsIncrease")
    public Long staticsIncrease;

    /**
     * <p>The weight of the message. Default value: 1. A greater value indicates a higher priority. For a message of the highest priority, you can set the weight to 1000000.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Weight")
    public Long weight;

    public static SendLiveMessageGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SendLiveMessageGroupRequest self = new SendLiveMessageGroupRequest();
        return TeaModel.build(map, self);
    }

    public SendLiveMessageGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SendLiveMessageGroupRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public SendLiveMessageGroupRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public SendLiveMessageGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SendLiveMessageGroupRequest setMsgTid(String msgTid) {
        this.msgTid = msgTid;
        return this;
    }
    public String getMsgTid() {
        return this.msgTid;
    }

    public SendLiveMessageGroupRequest setMsgType(Long msgType) {
        this.msgType = msgType;
        return this;
    }
    public Long getMsgType() {
        return this.msgType;
    }

    public SendLiveMessageGroupRequest setNoCache(Boolean noCache) {
        this.noCache = noCache;
        return this;
    }
    public Boolean getNoCache() {
        return this.noCache;
    }

    public SendLiveMessageGroupRequest setNoStorage(Boolean noStorage) {
        this.noStorage = noStorage;
        return this;
    }
    public Boolean getNoStorage() {
        return this.noStorage;
    }

    public SendLiveMessageGroupRequest setSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }
    public String getSenderId() {
        return this.senderId;
    }

    public SendLiveMessageGroupRequest setSenderMetaInfo(String senderMetaInfo) {
        this.senderMetaInfo = senderMetaInfo;
        return this;
    }
    public String getSenderMetaInfo() {
        return this.senderMetaInfo;
    }

    public SendLiveMessageGroupRequest setStaticsIncrease(Long staticsIncrease) {
        this.staticsIncrease = staticsIncrease;
        return this;
    }
    public Long getStaticsIncrease() {
        return this.staticsIncrease;
    }

    public SendLiveMessageGroupRequest setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

}
