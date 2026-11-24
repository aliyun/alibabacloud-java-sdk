// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateRepoTriggerRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-kmsiwlxxdcva****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The image repository ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-tquyps22md8p****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The trigger ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crw-k7bdx4kt52ty****</p>
     */
    @NameInMap("TriggerId")
    public String triggerId;

    /**
     * <p>The trigger name. This parameter is optional. You must specify either TriggerName or TriggerUrl.</p>
     * 
     * <strong>example:</strong>
     * <p>test_trigger</p>
     */
    @NameInMap("TriggerName")
    public String triggerName;

    /**
     * <p>The image version that triggers the trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>master</p>
     */
    @NameInMap("TriggerTag")
    public String triggerTag;

    /**
     * <p>The trigger type. Valid values:</p>
     * <ul>
     * <li><p><code>ALL</code>: all.</p>
     * </li>
     * <li><p><code>TAG_LISTTAG</code>: tag list.</p>
     * </li>
     * <li><p><code>TAG_REG_EXP</code>: regular expression.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("TriggerType")
    public String triggerType;

    /**
     * <p>The trigger URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.test.com">https://www.test.com</a></p>
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
