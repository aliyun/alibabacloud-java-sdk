// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateContextRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Users prefer to first view the SLS error logs, index configuration, and the most recent Agent execution trace.</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;taskType&quot;: &quot;troubleshooting&quot;,
     *     &quot;complexity&quot;: &quot;medium&quot;,
     *     &quot;confidence&quot;: 0.95
     * }</p>
     */
    @NameInMap("experience")
    public java.util.Map<String, ?> experience;

    /**
     * <strong>example:</strong>
     * <p>{&quot;sessionId&quot;:&quot;test_session_001&quot;}</p>
     */
    @NameInMap("metadata")
    public java.util.Map<String, ?> metadata;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;userId&quot;: &quot;u-10001&quot;,
     *     &quot;agentId&quot;: &quot;sls-agent&quot;,
     *     &quot;appId&quot;: &quot;console&quot;,
     *     &quot;categories&quot;: [
     *       &quot;preference&quot;
     *     ],
     *     &quot;source&quot;: &quot;user_confirmed&quot;,
     *     &quot;topic&quot;: &quot;debugging_preference&quot;,
     *     &quot;immutable&quot;: false,
     *     &quot;createdAt&quot;: 1776319200,
     *     &quot;updatedAt&quot;: 1776319200
     *   }</p>
     */
    @NameInMap("payload")
    public java.util.Map<String, ?> payload;

    /**
     * <strong>example:</strong>
     * <p>Identify and troubleshoot SLs issues</p>
     */
    @NameInMap("triggerCondition")
    public String triggerCondition;

    public static UpdateContextRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextRequest self = new UpdateContextRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContextRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateContextRequest setExperience(java.util.Map<String, ?> experience) {
        this.experience = experience;
        return this;
    }
    public java.util.Map<String, ?> getExperience() {
        return this.experience;
    }

    public UpdateContextRequest setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public UpdateContextRequest setPayload(java.util.Map<String, ?> payload) {
        this.payload = payload;
        return this;
    }
    public java.util.Map<String, ?> getPayload() {
        return this.payload;
    }

    public UpdateContextRequest setTriggerCondition(String triggerCondition) {
        this.triggerCondition = triggerCondition;
        return this;
    }
    public String getTriggerCondition() {
        return this.triggerCondition;
    }

}
