// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyJVSInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ApplyToAll")
    public Boolean applyToAll;

    @NameInMap("CreditConfig")
    public java.util.List<ModifyJVSInstanceRequestCreditConfig> creditConfig;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <strong>example:</strong>
     * <p>defaultInstanceName</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    public static ModifyJVSInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyJVSInstanceRequest self = new ModifyJVSInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyJVSInstanceRequest setApplyToAll(Boolean applyToAll) {
        this.applyToAll = applyToAll;
        return this;
    }
    public Boolean getApplyToAll() {
        return this.applyToAll;
    }

    public ModifyJVSInstanceRequest setCreditConfig(java.util.List<ModifyJVSInstanceRequestCreditConfig> creditConfig) {
        this.creditConfig = creditConfig;
        return this;
    }
    public java.util.List<ModifyJVSInstanceRequestCreditConfig> getCreditConfig() {
        return this.creditConfig;
    }

    public ModifyJVSInstanceRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ModifyJVSInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public static class ModifyJVSInstanceRequestCreditConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CreditLimit")
        public Long creditLimit;

        /**
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("LimitPeriod")
        public String limitPeriod;

        public static ModifyJVSInstanceRequestCreditConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyJVSInstanceRequestCreditConfig self = new ModifyJVSInstanceRequestCreditConfig();
            return TeaModel.build(map, self);
        }

        public ModifyJVSInstanceRequestCreditConfig setCreditLimit(Long creditLimit) {
            this.creditLimit = creditLimit;
            return this;
        }
        public Long getCreditLimit() {
            return this.creditLimit;
        }

        public ModifyJVSInstanceRequestCreditConfig setLimitPeriod(String limitPeriod) {
            this.limitPeriod = limitPeriod;
            return this;
        }
        public String getLimitPeriod() {
            return this.limitPeriod;
        }

    }

}
