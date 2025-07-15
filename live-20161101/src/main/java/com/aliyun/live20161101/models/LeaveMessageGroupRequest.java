// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class LeaveMessageGroupRequest extends TeaModel {
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
     * <p>Specifies whether to broadcast statistical messages. If you set the value to true, statistical messages of the message group are broadcasted after the users join the message group. The client can receive and process these messages. Valid values:</p>
     * <ul>
     * <li>true: broadcasts statistical messages.</li>
     * <li>false: does not broadcast statistical messages.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("BroadCastStatistics")
    public Boolean broadCastStatistics;

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
     * <p>The ID of the message group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AE35-****-T95F</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the user. Each user has a unique ID in the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de1**a0</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static LeaveMessageGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        LeaveMessageGroupRequest self = new LeaveMessageGroupRequest();
        return TeaModel.build(map, self);
    }

    public LeaveMessageGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public LeaveMessageGroupRequest setBroadCastStatistics(Boolean broadCastStatistics) {
        this.broadCastStatistics = broadCastStatistics;
        return this;
    }
    public Boolean getBroadCastStatistics() {
        return this.broadCastStatistics;
    }

    public LeaveMessageGroupRequest setBroadCastType(Integer broadCastType) {
        this.broadCastType = broadCastType;
        return this;
    }
    public Integer getBroadCastType() {
        return this.broadCastType;
    }

    public LeaveMessageGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public LeaveMessageGroupRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
