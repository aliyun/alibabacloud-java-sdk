// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class UpdatePoolRequest extends TeaModel {
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
    public UpdatePoolRequestResourceLimits resourceLimits;

    public static UpdatePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePoolRequest self = new UpdatePoolRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePoolRequest setPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }
    public String getPoolName() {
        return this.poolName;
    }

    public UpdatePoolRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdatePoolRequest setResourceLimits(UpdatePoolRequestResourceLimits resourceLimits) {
        this.resourceLimits = resourceLimits;
        return this;
    }
    public UpdatePoolRequestResourceLimits getResourceLimits() {
        return this.resourceLimits;
    }

    public static class UpdatePoolRequestResourceLimits extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("MaxExectorNum")
        public Integer maxExectorNum;

        public static UpdatePoolRequestResourceLimits build(java.util.Map<String, ?> map) throws Exception {
            UpdatePoolRequestResourceLimits self = new UpdatePoolRequestResourceLimits();
            return TeaModel.build(map, self);
        }

        public UpdatePoolRequestResourceLimits setMaxExectorNum(Integer maxExectorNum) {
            this.maxExectorNum = maxExectorNum;
            return this;
        }
        public Integer getMaxExectorNum() {
            return this.maxExectorNum;
        }

    }

}
