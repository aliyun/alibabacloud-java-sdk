// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CancelMuteGroupUserRequest extends TeaModel {
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
    public java.util.List<String> cancelMuteUserList;

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

    public static CancelMuteGroupUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelMuteGroupUserRequest self = new CancelMuteGroupUserRequest();
        return TeaModel.build(map, self);
    }

    public CancelMuteGroupUserRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CancelMuteGroupUserRequest setBroadCastType(Integer broadCastType) {
        this.broadCastType = broadCastType;
        return this;
    }
    public Integer getBroadCastType() {
        return this.broadCastType;
    }

    public CancelMuteGroupUserRequest setCancelMuteUserList(java.util.List<String> cancelMuteUserList) {
        this.cancelMuteUserList = cancelMuteUserList;
        return this;
    }
    public java.util.List<String> getCancelMuteUserList() {
        return this.cancelMuteUserList;
    }

    public CancelMuteGroupUserRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CancelMuteGroupUserRequest setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
        return this;
    }
    public String getOperatorUserId() {
        return this.operatorUserId;
    }

}
