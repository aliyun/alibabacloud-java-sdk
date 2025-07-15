// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CancelMuteAllGroupUserRequest extends TeaModel {
    /**
     * <p>Interactive message application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VKL3***</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>系统消息扩散类型，取值：</p>
     * <ul>
     * <li><p>0：不扩散。</p>
     * </li>
     * <li><p>1：扩散到指定人。</p>
     * </li>
     * <li><p>2：扩散到群组。</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BroadCastType")
    public Integer broadCastType;

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
     * <p>Operator\&quot;s UserId. &gt; This parameter is required and the user must be the creator of the group.</p>
     * 
     * <strong>example:</strong>
     * <p>de1**a0</p>
     */
    @NameInMap("OperatorUserId")
    public String operatorUserId;

    public static CancelMuteAllGroupUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelMuteAllGroupUserRequest self = new CancelMuteAllGroupUserRequest();
        return TeaModel.build(map, self);
    }

    public CancelMuteAllGroupUserRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CancelMuteAllGroupUserRequest setBroadCastType(Integer broadCastType) {
        this.broadCastType = broadCastType;
        return this;
    }
    public Integer getBroadCastType() {
        return this.broadCastType;
    }

    public CancelMuteAllGroupUserRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CancelMuteAllGroupUserRequest setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
        return this;
    }
    public String getOperatorUserId() {
        return this.operatorUserId;
    }

}
