// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class MuteGroupUserShrinkRequest extends TeaModel {
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
     * <p>The system message broadcast type. Valid values:</p>
     * <ul>
     * <li><p>0: no broadcast.</p>
     * </li>
     * <li><p>1: broadcast to specified users.</p>
     * </li>
     * <li><p>2: broadcast to the group.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BroadCastType")
    public Integer broadCastType;

    /**
     * <p>The message group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AE35-****-T95F</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The mute duration. Unit: seconds.</p>
     * <blockquote>
     * <p>If this parameter is not specified or is set to 0, the default mute duration (86400 seconds) is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("MuteTime")
    public Integer muteTime;

    /**
     * <p>The mute details.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MuteUserList")
    public String muteUserListShrink;

    /**
     * <p>The user ID of the operator.</p>
     * <blockquote>
     * <p>This parameter is required, and the user must be the creator of the group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>de1**a0</p>
     */
    @NameInMap("OperatorUserId")
    public String operatorUserId;

    public static MuteGroupUserShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MuteGroupUserShrinkRequest self = new MuteGroupUserShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MuteGroupUserShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public MuteGroupUserShrinkRequest setBroadCastType(Integer broadCastType) {
        this.broadCastType = broadCastType;
        return this;
    }
    public Integer getBroadCastType() {
        return this.broadCastType;
    }

    public MuteGroupUserShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public MuteGroupUserShrinkRequest setMuteTime(Integer muteTime) {
        this.muteTime = muteTime;
        return this;
    }
    public Integer getMuteTime() {
        return this.muteTime;
    }

    public MuteGroupUserShrinkRequest setMuteUserListShrink(String muteUserListShrink) {
        this.muteUserListShrink = muteUserListShrink;
        return this;
    }
    public String getMuteUserListShrink() {
        return this.muteUserListShrink;
    }

    public MuteGroupUserShrinkRequest setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
        return this;
    }
    public String getOperatorUserId() {
        return this.operatorUserId;
    }

}
