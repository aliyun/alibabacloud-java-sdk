// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class JoinMessageGroupRequest extends TeaModel {
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

    public static JoinMessageGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinMessageGroupRequest self = new JoinMessageGroupRequest();
        return TeaModel.build(map, self);
    }

    public JoinMessageGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public JoinMessageGroupRequest setBroadCastStatistics(Boolean broadCastStatistics) {
        this.broadCastStatistics = broadCastStatistics;
        return this;
    }
    public Boolean getBroadCastStatistics() {
        return this.broadCastStatistics;
    }

    public JoinMessageGroupRequest setBroadCastType(Integer broadCastType) {
        this.broadCastType = broadCastType;
        return this;
    }
    public Integer getBroadCastType() {
        return this.broadCastType;
    }

    public JoinMessageGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public JoinMessageGroupRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
