// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateQualityFollowerRequest extends TeaModel {
    /**
     * <p>The notification method. Valid values: 1, 2, 4, and 5. 1 indicates that the notification is sent by email. 2 indicates that the notification is sent by email and text message. 4 indicates that the notification is sent by a DingTalk chatbot. 5 indicates that the notification is sent by a DingTalk chatbot to all members in a DingTalk group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlarmMode")
    public Integer alarmMode;

    /**
     * <p>The ID of the partition filter expression.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

    /**
     * <p>The user ID of the subscriber.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Follower")
    public String follower;

    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the computing engine instance or data source.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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

    public CreateQualityFollowerRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateQualityFollowerRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
