// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartConferenceRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>A JSON-formatted string representing an array of participants. Each array element represents a participant. For internal calls to agents, the participant is the target agent\&quot;s extension number. For external calls to customers, the participant is the customer\&quot;s phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;8045****&quot;,&quot;1317511****&quot;]</p>
     */
    @NameInMap("ParticipantListJson")
    public String participantListJson;

    /**
     * <p>Ingest endpoint data. It cannot exceed 128 bytes and is primarily used for extension requirements. Ordinary customers do not need to concern themselves with it.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>Timeout period. If the call is not answered within the time specified by this parameter, it will be automatically disconnected. This parameter is optional. The default value is 30 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    /**
     * <p>The agent ID initiating the conference call. This parameter is optional. If not specified, the agent mapped to the current RAM account is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
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
