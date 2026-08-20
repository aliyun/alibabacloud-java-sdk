// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class CreatePoolShrinkRequest extends TeaModel {
    /**
     * <p>The name of the resource pool.</p>
     * <ul>
     * <li>The name can be up to 15 characters in length.</li>
     * <li>The name can contain digits, uppercase letters, lowercase letters, underscores (_), and periods (.).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PoolTest</p>
     */
    @NameInMap("PoolName")
    public String poolName;

    /**
     * <p>The priority of the resource pool.</p>
     * <ul>
     * <li>Valid values: 1 to 99. Default value: 1, which indicates the lowest priority.</li>
     * <li>Jobs submitted to a resource pool with a higher priority value are scheduled before pending jobs in resource pools with lower priority values. The priority of a resource pool takes precedence over the priority of a job.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The resource quota limits for concurrent usage allowed for a user within a resource pool.</p>
     */
    @NameInMap("ResourceLimits")
    public String resourceLimitsShrink;

    /**
     * <p>The scheduling policy.</p>
     * 
     * <strong>example:</strong>
     * <p>policy-xxx</p>
     */
    @NameInMap("SchedulingPolicyId")
    public String schedulingPolicyId;

    /**
     * <p>The tag information.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static CreatePoolShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePoolShrinkRequest self = new CreatePoolShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePoolShrinkRequest setPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }
    public String getPoolName() {
        return this.poolName;
    }

    public CreatePoolShrinkRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreatePoolShrinkRequest setResourceLimitsShrink(String resourceLimitsShrink) {
        this.resourceLimitsShrink = resourceLimitsShrink;
        return this;
    }
    public String getResourceLimitsShrink() {
        return this.resourceLimitsShrink;
    }

    public CreatePoolShrinkRequest setSchedulingPolicyId(String schedulingPolicyId) {
        this.schedulingPolicyId = schedulingPolicyId;
        return this;
    }
    public String getSchedulingPolicyId() {
        return this.schedulingPolicyId;
    }

    public CreatePoolShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
