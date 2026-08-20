// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class CreatePoolRequest extends TeaModel {
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
    public CreatePoolRequestResourceLimits resourceLimits;

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
    public java.util.List<CreatePoolRequestTags> tags;

    public static CreatePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePoolRequest self = new CreatePoolRequest();
        return TeaModel.build(map, self);
    }

    public CreatePoolRequest setPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }
    public String getPoolName() {
        return this.poolName;
    }

    public CreatePoolRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreatePoolRequest setResourceLimits(CreatePoolRequestResourceLimits resourceLimits) {
        this.resourceLimits = resourceLimits;
        return this;
    }
    public CreatePoolRequestResourceLimits getResourceLimits() {
        return this.resourceLimits;
    }

    public CreatePoolRequest setSchedulingPolicyId(String schedulingPolicyId) {
        this.schedulingPolicyId = schedulingPolicyId;
        return this;
    }
    public String getSchedulingPolicyId() {
        return this.schedulingPolicyId;
    }

    public CreatePoolRequest setTags(java.util.List<CreatePoolRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreatePoolRequestTags> getTags() {
        return this.tags;
    }

    public static class CreatePoolRequestResourceLimits extends TeaModel {
        /**
         * <p>The maximum number of executor nodes that a user can concurrently run within a resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxExecutorNum")
        public Integer maxExecutorNum;

        public static CreatePoolRequestResourceLimits build(java.util.Map<String, ?> map) throws Exception {
            CreatePoolRequestResourceLimits self = new CreatePoolRequestResourceLimits();
            return TeaModel.build(map, self);
        }

        public CreatePoolRequestResourceLimits setMaxExecutorNum(Integer maxExecutorNum) {
            this.maxExecutorNum = maxExecutorNum;
            return this;
        }
        public Integer getMaxExecutorNum() {
            return this.maxExecutorNum;
        }

    }

    public static class CreatePoolRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreatePoolRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreatePoolRequestTags self = new CreatePoolRequestTags();
            return TeaModel.build(map, self);
        }

        public CreatePoolRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePoolRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
