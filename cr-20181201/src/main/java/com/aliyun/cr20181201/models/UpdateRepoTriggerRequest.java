// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateRepoTriggerRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("TriggerName")
    public String triggerName;

    @NameInMap("TriggerUrl")
    public String triggerUrl;

    @NameInMap("TriggerType")
    public String triggerType;

    @NameInMap("TriggerTag")
    public String triggerTag;

    @NameInMap("TriggerId")
    public String triggerId;

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

    public UpdateRepoTriggerRequest setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    public String getTriggerName() {
        return this.triggerName;
    }

    public UpdateRepoTriggerRequest setTriggerUrl(String triggerUrl) {
        this.triggerUrl = triggerUrl;
        return this;
    }
    public String getTriggerUrl() {
        return this.triggerUrl;
    }

    public UpdateRepoTriggerRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public UpdateRepoTriggerRequest setTriggerTag(String triggerTag) {
        this.triggerTag = triggerTag;
        return this;
    }
    public String getTriggerTag() {
        return this.triggerTag;
    }

    public UpdateRepoTriggerRequest setTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }
    public String getTriggerId() {
        return this.triggerId;
    }

}
