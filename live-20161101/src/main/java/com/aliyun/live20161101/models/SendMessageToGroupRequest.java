// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendMessageToGroupRequest extends TeaModel {
    /**
     * <p>Interactive Messages application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VKL3***</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Message body, JSONString type.</p>
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
     * <p>Specifies whether the current message content requires Alibaba Cloud Content Moderation. Valid values:</p>
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
     * 
     * <strong>example:</strong>
     * <p>12000</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static SendMessageToGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageToGroupRequest self = new SendMessageToGroupRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageToGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SendMessageToGroupRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SendMessageToGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SendMessageToGroupRequest setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
        return this;
    }
    public String getOperatorUserId() {
        return this.operatorUserId;
    }

    public SendMessageToGroupRequest setSkipAudit(Boolean skipAudit) {
        this.skipAudit = skipAudit;
        return this;
    }
    public Boolean getSkipAudit() {
        return this.skipAudit;
    }

    public SendMessageToGroupRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
