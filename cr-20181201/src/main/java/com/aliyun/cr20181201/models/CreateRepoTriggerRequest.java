// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoTriggerRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xkx6vujuhay0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the image repository.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-xwvi3osiy4ff****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The name of the trigger.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>trigger1</p>
     */
    @NameInMap("TriggerName")
    public String triggerName;

    /**
     * <p>The image tag based on which the trigger is set.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If <code>TriggerType</code> is set to <code>ALL</code>, <code>TriggerTag</code> can be set to a string or an array, for example, <code>*</code>.</p>
     * </li>
     * <li><p>If <code>TriggerType</code> is set to <code>TAG_LIST</code>, <code>TriggerTag</code> must be set to an array, for example, <code>[1]</code>.</p>
     * </li>
     * <li><p>If <code>TriggerType</code> is set to <code>TAG_REG_EXP</code>, <code>TriggerTag</code> must be set to a string, for example, <code>*</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[1]</p>
     */
    @NameInMap("TriggerTag")
    public String triggerTag;

    /**
     * <p>The type of the trigger. Valid values:</p>
     * <ul>
     * <li><code>ALL</code>: a trigger that supports both tags and regular expressions.</li>
     * <li><code>TAG_LIST</code>: a tag-based trigger.</li>
     * <li><code>TAG_REG_EXP</code>: a regular expression-based trigger.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("TriggerType")
    public String triggerType;

    /**
     * <p>The URL of the trigger.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.mysite.com">http://www.mysite.com</a></p>
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
