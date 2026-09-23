// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateDataAssetsGovernObjectStatusRequest extends TeaModel {
    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The update command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateDataAssetsGovernObjectStatusRequestUpdateCommand updateCommand;

    public static UpdateDataAssetsGovernObjectStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataAssetsGovernObjectStatusRequest self = new UpdateDataAssetsGovernObjectStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataAssetsGovernObjectStatusRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateDataAssetsGovernObjectStatusRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public UpdateDataAssetsGovernObjectStatusRequest setUpdateCommand(UpdateDataAssetsGovernObjectStatusRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateDataAssetsGovernObjectStatusRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateDataAssetsGovernObjectStatusRequestUpdateCommand extends TeaModel {
        /**
         * <p>Specifies whether to notify the owner. This parameter takes effect only when the status is reverted to NEW.</p>
         */
        @NameInMap("AlertOwners")
        public Boolean alertOwners;

        /**
         * <p>The list of governance object IDs.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("GovernObjectIds")
        public java.util.List<Long> governObjectIds;

        /**
         * <p>The operation description.</p>
         * 
         * <strong>example:</strong>
         * <p>Issue fixed</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The target status. Valid values: FINISHED / NEW / IGNORE / CANCEL_IGNORE.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("TargetStatus")
        public String targetStatus;

        public static UpdateDataAssetsGovernObjectStatusRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataAssetsGovernObjectStatusRequestUpdateCommand self = new UpdateDataAssetsGovernObjectStatusRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateDataAssetsGovernObjectStatusRequestUpdateCommand setAlertOwners(Boolean alertOwners) {
            this.alertOwners = alertOwners;
            return this;
        }
        public Boolean getAlertOwners() {
            return this.alertOwners;
        }

        public UpdateDataAssetsGovernObjectStatusRequestUpdateCommand setGovernObjectIds(java.util.List<Long> governObjectIds) {
            this.governObjectIds = governObjectIds;
            return this;
        }
        public java.util.List<Long> getGovernObjectIds() {
            return this.governObjectIds;
        }

        public UpdateDataAssetsGovernObjectStatusRequestUpdateCommand setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public UpdateDataAssetsGovernObjectStatusRequestUpdateCommand setTargetStatus(String targetStatus) {
            this.targetStatus = targetStatus;
            return this;
        }
        public String getTargetStatus() {
            return this.targetStatus;
        }

    }

}
