// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class LeaveMessageGroupRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BroadCastStatistics")
    public Boolean broadCastStatistics;

    @NameInMap("BroadCastType")
    public Integer broadCastType;

    @NameInMap("GroupId")
    public String groupId;

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
