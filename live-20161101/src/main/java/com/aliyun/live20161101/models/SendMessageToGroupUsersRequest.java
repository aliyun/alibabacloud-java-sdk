// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendMessageToGroupUsersRequest extends TeaModel {
    /**
     * <p>Interactive Messages application</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VKL3***</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Message body in JSONString format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Message group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AE35-****-T95F</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Operator user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de1**a0</p>
     */
    @NameInMap("OperatorUserId")
    public String operatorUserId;

    /**
     * <p>User list.</p>
     */
    @NameInMap("ReceiverIdList")
    public java.util.List<String> receiverIdList;

    /**
     * <p>Specifies whether the current message content requires Content Moderation by Alibaba Cloud. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Content Moderation is not required.</li>
     * <li><strong>false</strong> (default): Content Moderation is required.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SkipAudit")
    public Boolean skipAudit;

    /**
     * <p>Message type. When the type field value is less than or equal to 10000, it indicates a system message. When the value is greater than 10000, it indicates a custom message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12000</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static SendMessageToGroupUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageToGroupUsersRequest self = new SendMessageToGroupUsersRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageToGroupUsersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SendMessageToGroupUsersRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SendMessageToGroupUsersRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SendMessageToGroupUsersRequest setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
        return this;
    }
    public String getOperatorUserId() {
        return this.operatorUserId;
    }

    public SendMessageToGroupUsersRequest setReceiverIdList(java.util.List<String> receiverIdList) {
        this.receiverIdList = receiverIdList;
        return this;
    }
    public java.util.List<String> getReceiverIdList() {
        return this.receiverIdList;
    }

    public SendMessageToGroupUsersRequest setSkipAudit(Boolean skipAudit) {
        this.skipAudit = skipAudit;
        return this;
    }
    public Boolean getSkipAudit() {
        return this.skipAudit;
    }

    public SendMessageToGroupUsersRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
