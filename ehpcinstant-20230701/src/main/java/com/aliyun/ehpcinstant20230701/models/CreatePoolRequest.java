// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class CreatePoolRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PoolTest</p>
     */
    @NameInMap("PoolName")
    public String poolName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

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
