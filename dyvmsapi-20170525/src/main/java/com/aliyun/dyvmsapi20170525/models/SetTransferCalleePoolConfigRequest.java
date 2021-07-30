// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SetTransferCalleePoolConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("QualificationId")
    public String qualificationId;

    @NameInMap("CalledRouteMode")
    public String calledRouteMode;

    @NameInMap("Details")
    public java.util.List<SetTransferCalleePoolConfigRequestDetails> details;

    public static SetTransferCalleePoolConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetTransferCalleePoolConfigRequest self = new SetTransferCalleePoolConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetTransferCalleePoolConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public static class SetTransferCalleePoolConfigRequestDetails extends TeaModel {
        @NameInMap("Caller")
        public String caller;

        @NameInMap("Called")
        public String called;

        public static SetTransferCalleePoolConfigRequestDetails build(java.util.Map<String, ?> map) throws Exception {
            SetTransferCalleePoolConfigRequestDetails self = new SetTransferCalleePoolConfigRequestDetails();
            return TeaModel.build(map, self);
        }

        public SetTransferCalleePoolConfigRequestDetails setCaller(String caller) {
            this.caller = caller;
            return this;
        }
        public String getCaller() {
            return this.caller;
        }

        public SetTransferCalleePoolConfigRequestDetails setCalled(String called) {
            this.called = called;
            return this;
        }
        public String getCalled() {
            return this.called;
        }

    }

}
