// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateQualityFollowerRequest extends TeaModel {
    @NameInMap("AlarmMode")
    public Integer alarmMode;

    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("Follower")
    public String follower;

    @NameInMap("ProjectName")
    public String projectName;

    public static CreateQualityFollowerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityFollowerRequest self = new CreateQualityFollowerRequest();
        return TeaModel.build(map, self);
    }

    public CreateQualityFollowerRequest setAlarmMode(Integer alarmMode) {
        this.alarmMode = alarmMode;
        return this;
    }
    public Integer getAlarmMode() {
        return this.alarmMode;
    }

    public CreateQualityFollowerRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public CreateQualityFollowerRequest setFollower(String follower) {
        this.follower = follower;
        return this;
    }
    public String getFollower() {
        return this.follower;
    }

    public CreateQualityFollowerRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
