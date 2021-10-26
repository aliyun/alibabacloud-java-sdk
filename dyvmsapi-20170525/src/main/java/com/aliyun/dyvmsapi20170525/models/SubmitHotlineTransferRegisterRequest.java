// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SubmitHotlineTransferRegisterRequest extends TeaModel {
    @NameInMap("Agreement")
    public String agreement;

    @NameInMap("HotlineNumber")
    public String hotlineNumber;

    @NameInMap("OperatorIdentityCard")
    public String operatorIdentityCard;

    @NameInMap("OperatorMail")
    public String operatorMail;

    @NameInMap("OperatorMailVerifyCode")
    public String operatorMailVerifyCode;

    @NameInMap("OperatorMobile")
    public String operatorMobile;

    @NameInMap("OperatorMobileVerifyCode")
    public String operatorMobileVerifyCode;

    @NameInMap("OperatorName")
    public String operatorName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("QualificationId")
    public String qualificationId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TransferPhoneNumberInfos")
    public java.util.List<SubmitHotlineTransferRegisterRequestTransferPhoneNumberInfos> transferPhoneNumberInfos;

    public static SubmitHotlineTransferRegisterRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitHotlineTransferRegisterRequest self = new SubmitHotlineTransferRegisterRequest();
        return TeaModel.build(map, self);
    }

    public SubmitHotlineTransferRegisterRequest setAgreement(String agreement) {
        this.agreement = agreement;
        return this;
    }
    public String getAgreement() {
        return this.agreement;
    }

    public SubmitHotlineTransferRegisterRequest setHotlineNumber(String hotlineNumber) {
        this.hotlineNumber = hotlineNumber;
        return this;
    }
    public String getHotlineNumber() {
        return this.hotlineNumber;
    }

    public SubmitHotlineTransferRegisterRequest setOperatorIdentityCard(String operatorIdentityCard) {
        this.operatorIdentityCard = operatorIdentityCard;
        return this;
    }
    public String getOperatorIdentityCard() {
        return this.operatorIdentityCard;
    }

    public SubmitHotlineTransferRegisterRequest setOperatorMail(String operatorMail) {
        this.operatorMail = operatorMail;
        return this;
    }
    public String getOperatorMail() {
        return this.operatorMail;
    }

    public SubmitHotlineTransferRegisterRequest setOperatorMailVerifyCode(String operatorMailVerifyCode) {
        this.operatorMailVerifyCode = operatorMailVerifyCode;
        return this;
    }
    public String getOperatorMailVerifyCode() {
        return this.operatorMailVerifyCode;
    }

    public SubmitHotlineTransferRegisterRequest setOperatorMobile(String operatorMobile) {
        this.operatorMobile = operatorMobile;
        return this;
    }
    public String getOperatorMobile() {
        return this.operatorMobile;
    }

    public SubmitHotlineTransferRegisterRequest setOperatorMobileVerifyCode(String operatorMobileVerifyCode) {
        this.operatorMobileVerifyCode = operatorMobileVerifyCode;
        return this;
    }
    public String getOperatorMobileVerifyCode() {
        return this.operatorMobileVerifyCode;
    }

    public SubmitHotlineTransferRegisterRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public SubmitHotlineTransferRegisterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitHotlineTransferRegisterRequest setQualificationId(String qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public String getQualificationId() {
        return this.qualificationId;
    }

    public SubmitHotlineTransferRegisterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitHotlineTransferRegisterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitHotlineTransferRegisterRequest setTransferPhoneNumberInfos(java.util.List<SubmitHotlineTransferRegisterRequestTransferPhoneNumberInfos> transferPhoneNumberInfos) {
        this.transferPhoneNumberInfos = transferPhoneNumberInfos;
        return this;
    }
    public java.util.List<SubmitHotlineTransferRegisterRequestTransferPhoneNumberInfos> getTransferPhoneNumberInfos() {
        return this.transferPhoneNumberInfos;
    }

    public static class SubmitHotlineTransferRegisterRequestTransferPhoneNumberInfos extends TeaModel {
        @NameInMap("IdentityCard")
        public String identityCard;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("PhoneNumberOwnerName")
        public String phoneNumberOwnerName;

        public static SubmitHotlineTransferRegisterRequestTransferPhoneNumberInfos build(java.util.Map<String, ?> map) throws Exception {
            SubmitHotlineTransferRegisterRequestTransferPhoneNumberInfos self = new SubmitHotlineTransferRegisterRequestTransferPhoneNumberInfos();
            return TeaModel.build(map, self);
        }

        public SubmitHotlineTransferRegisterRequestTransferPhoneNumberInfos setIdentityCard(String identityCard) {
            this.identityCard = identityCard;
            return this;
        }
        public String getIdentityCard() {
            return this.identityCard;
        }

        public SubmitHotlineTransferRegisterRequestTransferPhoneNumberInfos setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public SubmitHotlineTransferRegisterRequestTransferPhoneNumberInfos setPhoneNumberOwnerName(String phoneNumberOwnerName) {
            this.phoneNumberOwnerName = phoneNumberOwnerName;
            return this;
        }
        public String getPhoneNumberOwnerName() {
            return this.phoneNumberOwnerName;
        }

    }

}
