// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyResubmitConfigRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
        @NameInMap("ExceedMemoryException")
        public Boolean exceedMemoryException;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("PeakMemory")
        public String peakMemory;

        @NameInMap("QueryTime")
        public String queryTime;

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
