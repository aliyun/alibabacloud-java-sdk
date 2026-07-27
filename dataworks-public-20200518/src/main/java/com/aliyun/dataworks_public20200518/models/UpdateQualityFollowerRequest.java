// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateQualityFollowerRequest extends TeaModel {
    /**
     * <p>The notification method. Valid values: 1 (email), 2 (email and SMS), 4 (DingTalk group chatbot), 5 (DingTalk group chatbot with an @all reminder), 6 (Lark), 7 (WeCom), 8 (webhook), and 9 (phone call).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AlarmMode")
    public Integer alarmMode;

    /**
     * <p>The subscriber.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1912232****</p>
     */
    @NameInMap("Follower")
    public String follower;

    /**
     * <p>The ID of the subscription.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("FollowerId")
    public Long followerId;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the DataWorks console to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the compute engine or data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>autotest</p>
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
