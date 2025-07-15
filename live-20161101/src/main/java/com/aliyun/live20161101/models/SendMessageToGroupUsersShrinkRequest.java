// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendMessageToGroupUsersShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VKL3***</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The message body. The value is a JSON string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the message group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AE35-****-T95F</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the user who performs the operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de1**a0</p>
     */
    @NameInMap("OperatorUserId")
    public String operatorUserId;

    /**
     * <p>The list of users to receive the message.</p>
     */
    @NameInMap("ReceiverIdList")
    public String receiverIdListShrink;

    /**
     * <p>Specifies whether the message requires Alibaba Cloud content moderation. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: does not require content moderation.</li>
     * <li><strong>false</strong>: requires content moderation. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SkipAudit")
    public Boolean skipAudit;

    /**
     * <p>The type of the message. A value that is less than or equal to 10000 specifies a system message. A value that is greater than 10000 specifies a custom message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12000</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static SendMessageToGroupUsersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageToGroupUsersShrinkRequest self = new SendMessageToGroupUsersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageToGroupUsersShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SendMessageToGroupUsersShrinkRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SendMessageToGroupUsersShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SendMessageToGroupUsersShrinkRequest setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
        return this;
    }
    public String getOperatorUserId() {
        return this.operatorUserId;
    }

    public SendMessageToGroupUsersShrinkRequest setReceiverIdListShrink(String receiverIdListShrink) {
        this.receiverIdListShrink = receiverIdListShrink;
        return this;
    }
    public String getReceiverIdListShrink() {
        return this.receiverIdListShrink;
    }

    public SendMessageToGroupUsersShrinkRequest setSkipAudit(Boolean skipAudit) {
        this.skipAudit = skipAudit;
        return this;
    }
    public Boolean getSkipAudit() {
        return this.skipAudit;
    }

    public SendMessageToGroupUsersShrinkRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
