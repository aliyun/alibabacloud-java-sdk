// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyJVSInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to apply the configuration to all instances.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ApplyToAll")
    public Boolean applyToAll;

    /**
     * <p>The credit limit configuration. Subsequent configurations overwrite previous ones.</p>
     */
    @NameInMap("CreditConfig")
    public java.util.List<ModifyJVSInstanceRequestCreditConfig> creditConfig;

    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The list of instance IDs.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The instance name.</p>
     * 
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

    public ModifyJVSInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
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
         * <p>The credit limit.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CreditLimit")
        public Long creditLimit;

        /**
         * <p>The dimension of the current credit. Valid values:</p>
         * <ul>
         * <li>total: total usage limit.</li>
         * <li>month: monthly. The limit resets based on the resource activation time cycle.</li>
         * <li>day: daily. The limit resets at 00:00.</li>
         * </ul>
         * 
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
