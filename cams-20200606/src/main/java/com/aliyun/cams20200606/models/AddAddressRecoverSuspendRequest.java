// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddAddressRecoverSuspendRequest extends TeaModel {
    @NameInMap("AuditRecord")
    public AddAddressRecoverSuspendRequestAuditRecord auditRecord;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("RequestType")
    public String requestType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AddAddressRecoverSuspendRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAddressRecoverSuspendRequest self = new AddAddressRecoverSuspendRequest();
        return TeaModel.build(map, self);
    }

    public AddAddressRecoverSuspendRequest setAuditRecord(AddAddressRecoverSuspendRequestAuditRecord auditRecord) {
        this.auditRecord = auditRecord;
        return this;
    }
    public AddAddressRecoverSuspendRequestAuditRecord getAuditRecord() {
        return this.auditRecord;
    }

    public AddAddressRecoverSuspendRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public AddAddressRecoverSuspendRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddAddressRecoverSuspendRequest setRequestType(String requestType) {
        this.requestType = requestType;
        return this;
    }
    public String getRequestType() {
        return this.requestType;
    }

    public AddAddressRecoverSuspendRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddAddressRecoverSuspendRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class AddAddressRecoverSuspendRequestAuditRecord extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("ApplyReason")
        public String applyReason;

        @NameInMap("MessageDestinationCountry")
        public java.util.List<String> messageDestinationCountry;

        @NameInMap("MessageDestinationInternationalCountry")
        public java.util.List<String> messageDestinationInternationalCountry;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("RecoveryDate")
        public String recoveryDate;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("SuspensionDate")
        public String suspensionDate;

        public static AddAddressRecoverSuspendRequestAuditRecord build(java.util.Map<String, ?> map) throws Exception {
            AddAddressRecoverSuspendRequestAuditRecord self = new AddAddressRecoverSuspendRequestAuditRecord();
            return TeaModel.build(map, self);
        }

        public AddAddressRecoverSuspendRequestAuditRecord setApplyReason(String applyReason) {
            this.applyReason = applyReason;
            return this;
        }
        public String getApplyReason() {
            return this.applyReason;
        }

        public AddAddressRecoverSuspendRequestAuditRecord setMessageDestinationCountry(java.util.List<String> messageDestinationCountry) {
            this.messageDestinationCountry = messageDestinationCountry;
            return this;
        }
        public java.util.List<String> getMessageDestinationCountry() {
            return this.messageDestinationCountry;
        }

        public AddAddressRecoverSuspendRequestAuditRecord setMessageDestinationInternationalCountry(java.util.List<String> messageDestinationInternationalCountry) {
            this.messageDestinationInternationalCountry = messageDestinationInternationalCountry;
            return this;
        }
        public java.util.List<String> getMessageDestinationInternationalCountry() {
            return this.messageDestinationInternationalCountry;
        }

        public AddAddressRecoverSuspendRequestAuditRecord setRecoveryDate(String recoveryDate) {
            this.recoveryDate = recoveryDate;
            return this;
        }
        public String getRecoveryDate() {
            return this.recoveryDate;
        }

        public AddAddressRecoverSuspendRequestAuditRecord setSuspensionDate(String suspensionDate) {
            this.suspensionDate = suspensionDate;
            return this;
        }
        public String getSuspensionDate() {
            return this.suspensionDate;
        }

    }

}
