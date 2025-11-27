// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class CreatePoolRequest extends TeaModel {
    /**
     * <p>The name of the resource pool.</p>
     * <ul>
     * <li>The name can be up to 15 characters in length.</li>
     * <li>It can contain digits, uppercase letters, lowercase letters, underscores (_), and dots (.).</li>
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
     * <li>You can set a priority in the range of 1 to 99. The default value is 1, which is the lowest priority.</li>
     * <li>Jobs submitted to a resource pool with a higher priority level value will be scheduled before pending jobs in a resource pool with a lower priority level value, and the priority level of the resource pool takes precedence over the priority of the job.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The quota of resources that users are allowed to concurrently use in a resource pool.</p>
     */
    @NameInMap("ResourceLimits")
    public CreatePoolRequestResourceLimits resourceLimits;

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

    public static class CreatePoolRequestResourceLimits extends TeaModel {
        /**
         * <p>The maximum number of concurrent execution nodes in a resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("MaxExectorNum")
        public Integer maxExectorNum;

        public static CreatePoolRequestResourceLimits build(java.util.Map<String, ?> map) throws Exception {
            CreatePoolRequestResourceLimits self = new CreatePoolRequestResourceLimits();
            return TeaModel.build(map, self);
        }

        public CreatePoolRequestResourceLimits setMaxExectorNum(Integer maxExectorNum) {
            this.maxExectorNum = maxExectorNum;
            return this;
        }
        public Integer getMaxExectorNum() {
            return this.maxExectorNum;
        }

    }

}
