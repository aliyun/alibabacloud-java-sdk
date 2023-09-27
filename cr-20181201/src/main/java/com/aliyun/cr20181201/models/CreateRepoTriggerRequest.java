// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoTriggerRequest extends TeaModel {
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
     * <p>The name of the trigger.</p>
     */
    @NameInMap("TriggerName")
    public String triggerName;

    /**
     * <p>The image tag based on which the trigger is set.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If `TriggerType` is set to `ALL`, `TriggerTag` can be set to a string or an array, for example, `*`.</p>
     * <br>
     * <p>*   If `TriggerType` is set to `TAG_LIST`, `TriggerTag` must be set to an array, for example, `[1]`.</p>
     * <p>*   If `TriggerType` is set to `TAG_REG_EXP`, `TriggerTag` must be set to a string, for example, `*`.</p>
     */
    @NameInMap("TriggerTag")
    public String triggerTag;

    /**
     * <p>The type of the trigger. Valid values:</p>
     * <br>
     * <p>*   `ALL`: a trigger that supports both tags and regular expressions.</p>
     * <p>*   `TAG_LIST`: a tag-based trigger.</p>
     * <p>*   `TAG_REG_EXP`: a regular expression-based trigger.</p>
     */
    @NameInMap("TriggerType")
    public String triggerType;

    /**
     * <p>The URL of the trigger.</p>
     */
    @NameInMap("TriggerUrl")
    public String triggerUrl;

    public static CreateRepoTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoTriggerRequest self = new CreateRepoTriggerRequest();
        return TeaModel.build(map, self);
    }

    public CreateRepoTriggerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRepoTriggerRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public CreateRepoTriggerRequest setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    public String getTriggerName() {
        return this.triggerName;
    }

    public CreateRepoTriggerRequest setTriggerTag(String triggerTag) {
        this.triggerTag = triggerTag;
        return this;
    }
    public String getTriggerTag() {
        return this.triggerTag;
    }

    public CreateRepoTriggerRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public CreateRepoTriggerRequest setTriggerUrl(String triggerUrl) {
        this.triggerUrl = triggerUrl;
        return this;
    }
    public String getTriggerUrl() {
        return this.triggerUrl;
    }

}
