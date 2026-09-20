// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateQualityFollowerRequest extends TeaModel {
    /**
     * <p>The notification method. Valid values:</p>
     * <ul>
     * <li>1: email.</li>
     * <li>2: email and text message.</li>
     * <li>4: DingTalk chatbot.</li>
     * <li>5: DingTalk chatbot @ALL.</li>
     * <li>6: Lark.</li>
     * <li>7: WeCom.</li>
     * <li>8: WEBHOOK.</li>
     * <li>9: phone call alert.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AlarmMode")
    public Integer alarmMode;

    /**
     * <p>The ID of the partition expression.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

    /**
     * <p>The account ID of the subscriber.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Follower")
    public String follower;

    /**
     * <p>The ID of the DataWorks workspace. You can obtain the ID from the DataWorks console.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the engine or data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>autotest</p>
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
