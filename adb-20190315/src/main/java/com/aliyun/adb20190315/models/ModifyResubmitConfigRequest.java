// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyResubmitConfigRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>>  You can call the [DescribeDBClusters](~~129857~~) operation to query the information about all AnalyticDB for MySQL clusters within a region, including cluster IDs.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The job resubmission rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<ModifyResubmitConfigRequestRules> rules;

    public static ModifyResubmitConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyResubmitConfigRequest self = new ModifyResubmitConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyResubmitConfigRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyResubmitConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyResubmitConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyResubmitConfigRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyResubmitConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyResubmitConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyResubmitConfigRequest setRules(java.util.List<ModifyResubmitConfigRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<ModifyResubmitConfigRequestRules> getRules() {
        return this.rules;
    }

    public static class ModifyResubmitConfigRequestRules extends TeaModel {
        /**
         * <p>Specifies whether to configure out-of-memory (OOM) check.</p>
         */
        @NameInMap("ExceedMemoryException")
        public Boolean exceedMemoryException;

        /**
         * <p>The name of the source resource group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The peak memory usage.</p>
         */
        @NameInMap("PeakMemory")
        public String peakMemory;

        /**
         * <p>The duration of the SQL statement. Unit: milliseconds.</p>
         */
        @NameInMap("QueryTime")
        public String queryTime;

        /**
         * <p>The name of the destination resource group.</p>
         */
        @NameInMap("TargetGroupName")
        public String targetGroupName;

        public static ModifyResubmitConfigRequestRules build(java.util.Map<String, ?> map) throws Exception {
            ModifyResubmitConfigRequestRules self = new ModifyResubmitConfigRequestRules();
            return TeaModel.build(map, self);
        }

        public ModifyResubmitConfigRequestRules setExceedMemoryException(Boolean exceedMemoryException) {
            this.exceedMemoryException = exceedMemoryException;
            return this;
        }
        public Boolean getExceedMemoryException() {
            return this.exceedMemoryException;
        }

        public ModifyResubmitConfigRequestRules setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ModifyResubmitConfigRequestRules setPeakMemory(String peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public String getPeakMemory() {
            return this.peakMemory;
        }

        public ModifyResubmitConfigRequestRules setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

        public ModifyResubmitConfigRequestRules setTargetGroupName(String targetGroupName) {
            this.targetGroupName = targetGroupName;
            return this;
        }
        public String getTargetGroupName() {
            return this.targetGroupName;
        }

    }

}
