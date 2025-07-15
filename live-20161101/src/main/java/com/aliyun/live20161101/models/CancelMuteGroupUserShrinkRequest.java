// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CancelMuteGroupUserShrinkRequest extends TeaModel {
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
     * <p>The mode in which system messages are broadcasted. Valid values:</p>
     * <ul>
     * <li>0: specifies that system messages are not broadcasted. This is the default value.</li>
     * <li>1: specifies that system messages are broadcasted to specified users.</li>
     * <li>2: specifies that system messages are broadcasted to the message group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BroadCastType")
    public Integer broadCastType;

    /**
     * <p>The IDs of the users.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CancelMuteUserList")
    public String cancelMuteUserListShrink;

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
     * 
     * <strong>example:</strong>
     * <p>de1**a0</p>
     */
    @NameInMap("OperatorUserId")
    public String operatorUserId;

    public static CancelMuteGroupUserShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelMuteGroupUserShrinkRequest self = new CancelMuteGroupUserShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CancelMuteGroupUserShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CancelMuteGroupUserShrinkRequest setBroadCastType(Integer broadCastType) {
        this.broadCastType = broadCastType;
        return this;
    }
    public Integer getBroadCastType() {
        return this.broadCastType;
    }

    public CancelMuteGroupUserShrinkRequest setCancelMuteUserListShrink(String cancelMuteUserListShrink) {
        this.cancelMuteUserListShrink = cancelMuteUserListShrink;
        return this;
    }
    public String getCancelMuteUserListShrink() {
        return this.cancelMuteUserListShrink;
    }

    public CancelMuteGroupUserShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CancelMuteGroupUserShrinkRequest setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
        return this;
    }
    public String getOperatorUserId() {
        return this.operatorUserId;
    }

}
