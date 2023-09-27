// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateRepoTriggerRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the image repository.</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The ID of the trigger.</p>
     */
    @NameInMap("TriggerId")
    public String triggerId;

    /**
     * <p>The name of the trigger.</p>
     * <br>
     * <p>You can specify the TriggerName or TriggerUrl parameter. The TriggerName parameter is optional.</p>
     */
    @NameInMap("TriggerName")
    public String triggerName;

    /**
     * <p>The image tag based on which the trigger is set.</p>
     */
    @NameInMap("TriggerTag")
    public String triggerTag;

    /**
     * <p>The type of the trigger. Valid values:</p>
     * <br>
     * <p>*   `ALL`: a trigger that supports both tags and regular expressions.</p>
     * <p>*   `TAG_LISTTAG`: a tag-based trigger.</p>
     * <p>*   `TAG_REG_EXP`: a regular expression-based trigger.</p>
     */
    @NameInMap("TriggerType")
    public String triggerType;

    /**
     * <p>The URL of the trigger.</p>
     */
    @NameInMap("TriggerUrl")
    public String triggerUrl;

    public static UpdateRepoTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepoTriggerRequest self = new UpdateRepoTriggerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRepoTriggerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateRepoTriggerRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public UpdateRepoTriggerRequest setTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }
    public String getTriggerId() {
        return this.triggerId;
    }

    public UpdateRepoTriggerRequest setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    public String getTriggerName() {
        return this.triggerName;
    }

    public UpdateRepoTriggerRequest setTriggerTag(String triggerTag) {
        this.triggerTag = triggerTag;
        return this;
    }
    public String getTriggerTag() {
        return this.triggerTag;
    }

    public UpdateRepoTriggerRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public UpdateRepoTriggerRequest setTriggerUrl(String triggerUrl) {
        this.triggerUrl = triggerUrl;
        return this;
    }
    public String getTriggerUrl() {
        return this.triggerUrl;
    }

}
