// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SetTransferCalleePoolConfigRequest extends TeaModel {
    /**
     * <p>The call mode. Valid values:</p>
     * <br>
     * <p>*   **roundRobin**</p>
     * <p>*   **random**</p>
     */
    @NameInMap("CalledRouteMode")
    public String calledRouteMode;

    /**
     * <p>The information about the phone numbers for transferring the call.</p>
     */
    @NameInMap("Details")
    public java.util.List<SetTransferCalleePoolConfigRequestDetails> details;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The phone number used for transferring the call.</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>The qualification ID. You can call the [GetHotlineQualificationByOrder](~~393548~~) operation to obtain the qualification ID.</p>
     */
    @NameInMap("QualificationId")
    public String qualificationId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static SetTransferCalleePoolConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetTransferCalleePoolConfigRequest self = new SetTransferCalleePoolConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetTransferCalleePoolConfigRequest setCalledRouteMode(String calledRouteMode) {
        this.calledRouteMode = calledRouteMode;
        return this;
    }
    public String getCalledRouteMode() {
        return this.calledRouteMode;
    }

    public SetTransferCalleePoolConfigRequest setDetails(java.util.List<SetTransferCalleePoolConfigRequestDetails> details) {
        this.details = details;
        return this;
    }
    public java.util.List<SetTransferCalleePoolConfigRequestDetails> getDetails() {
        return this.details;
    }

    public SetTransferCalleePoolConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetTransferCalleePoolConfigRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public SetTransferCalleePoolConfigRequest setQualificationId(String qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public String getQualificationId() {
        return this.qualificationId;
    }

    public SetTransferCalleePoolConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetTransferCalleePoolConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class SetTransferCalleePoolConfigRequestDetails extends TeaModel {
        /**
         * <p>The called number.</p>
         */
        @NameInMap("Called")
        public String called;

        /**
         * <p>The calling number.</p>
         */
        @NameInMap("Caller")
        public String caller;

        public static SetTransferCalleePoolConfigRequestDetails build(java.util.Map<String, ?> map) throws Exception {
            SetTransferCalleePoolConfigRequestDetails self = new SetTransferCalleePoolConfigRequestDetails();
            return TeaModel.build(map, self);
        }

        public SetTransferCalleePoolConfigRequestDetails setCalled(String called) {
            this.called = called;
            return this;
        }
        public String getCalled() {
            return this.called;
        }

        public SetTransferCalleePoolConfigRequestDetails setCaller(String caller) {
            this.caller = caller;
            return this;
        }
        public String getCaller() {
            return this.caller;
        }

    }

}
