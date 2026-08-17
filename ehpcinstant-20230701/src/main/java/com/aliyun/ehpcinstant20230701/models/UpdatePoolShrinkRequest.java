// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class UpdatePoolShrinkRequest extends TeaModel {
    /**
     * <p>The name of the resource pool.</p>
     * <ul>
     * <li><p>The name can be up to 15 characters long.</p>
     * </li>
     * <li><p>The name can contain digits, uppercase letters, lowercase letters, underscores (_), and periods (.).</p>
     * </li>
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
     * <li><p>Valid values: 1 to 99. The default value is 1, which specifies the lowest priority.</p>
     * </li>
     * <li><p>Jobs in a higher-priority resource pool are scheduled before pending jobs in lower-priority pools. A resource pool\&quot;s priority overrides a job\&quot;s priority.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The limits on the resources that a user can use concurrently in the resource pool.</p>
     */
    @NameInMap("ResourceLimits")
    public String resourceLimitsShrink;

    /**
     * <p>The ID of the scheduling policy.</p>
     * 
     * <strong>example:</strong>
     * <p>policy-xxxx</p>
     */
    @NameInMap("SchedulingPolicyId")
    public String schedulingPolicyId;

    public static UpdatePoolShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePoolShrinkRequest self = new UpdatePoolShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePoolShrinkRequest setPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }
    public String getPoolName() {
        return this.poolName;
    }

    public UpdatePoolShrinkRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdatePoolShrinkRequest setResourceLimitsShrink(String resourceLimitsShrink) {
        this.resourceLimitsShrink = resourceLimitsShrink;
        return this;
    }
    public String getResourceLimitsShrink() {
        return this.resourceLimitsShrink;
    }

    public UpdatePoolShrinkRequest setSchedulingPolicyId(String schedulingPolicyId) {
        this.schedulingPolicyId = schedulingPolicyId;
        return this;
    }
    public String getSchedulingPolicyId() {
        return this.schedulingPolicyId;
    }

}
