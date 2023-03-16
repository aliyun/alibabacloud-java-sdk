// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateQualityFollowerRequest extends TeaModel {
    /**
     * <p>The notification method. Valid values: 1, 2, 4, and 5. 1 indicates that the notification is sent by email. 2 indicates that the notification is sent by email and text message. 4 indicates that the notification is sent by a DingTalk chatbot. 5 indicates that the notification is sent by a DingTalk chatbot to all members in a DingTalk group.</p>
     */
    @NameInMap("AlarmMode")
    public Integer alarmMode;

    /**
     * <p>The name of the subscriber.</p>
     */
    @NameInMap("Follower")
    public String follower;

    /**
     * <p>The ID of the subscription relationship.</p>
     */
    @NameInMap("FollowerId")
    public Long followerId;

    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the computing engine instance or data source.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static UpdateQualityFollowerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityFollowerRequest self = new UpdateQualityFollowerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQualityFollowerRequest setAlarmMode(Integer alarmMode) {
        this.alarmMode = alarmMode;
        return this;
    }
    public Integer getAlarmMode() {
        return this.alarmMode;
    }

    public UpdateQualityFollowerRequest setFollower(String follower) {
        this.follower = follower;
        return this;
    }
    public String getFollower() {
        return this.follower;
    }

    public UpdateQualityFollowerRequest setFollowerId(Long followerId) {
        this.followerId = followerId;
        return this;
    }
    public Long getFollowerId() {
        return this.followerId;
    }

    public UpdateQualityFollowerRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateQualityFollowerRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
