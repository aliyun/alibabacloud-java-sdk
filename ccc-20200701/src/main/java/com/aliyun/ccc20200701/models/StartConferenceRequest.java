// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartConferenceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ParticipantListJson")
    public String participantListJson;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    @NameInMap("UserId")
    public String userId;

    public static StartConferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartConferenceRequest self = new StartConferenceRequest();
        return TeaModel.build(map, self);
    }

    public StartConferenceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartConferenceRequest setParticipantListJson(String participantListJson) {
        this.participantListJson = participantListJson;
        return this;
    }
    public String getParticipantListJson() {
        return this.participantListJson;
    }

    public StartConferenceRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public StartConferenceRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public StartConferenceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
