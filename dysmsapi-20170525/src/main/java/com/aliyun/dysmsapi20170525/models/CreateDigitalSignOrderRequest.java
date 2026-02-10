// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateDigitalSignOrderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("ExtendMessage")
    public String extendMessage;

    @NameInMap("OrderContext")
    public java.util.Map<String, ?> orderContext;

    /**
     * <strong>example:</strong>
     * <p>CREATE_DIGITALSMS_SIGN</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>41</p>
     */
    @NameInMap("QualificationId")
    public Long qualificationId;

    /**
     * <strong>example:</strong>
     * <p>49</p>
     */
    @NameInMap("QualificationVersion")
    public Long qualificationVersion;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("SignId")
    public Long signId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SignIndustry")
    public Long signIndustry;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SignSource")
    public Long signSource;

    /**
     * <strong>example:</strong>
     * <p>110000001750080</p>
     */
    @NameInMap("Submitter")
    public String submitter;

    public static CreateDigitalSignOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalSignOrderRequest self = new CreateDigitalSignOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateDigitalSignOrderRequest setExtendMessage(String extendMessage) {
        this.extendMessage = extendMessage;
        return this;
    }
    public String getExtendMessage() {
        return this.extendMessage;
    }

    public CreateDigitalSignOrderRequest setOrderContext(java.util.Map<String, ?> orderContext) {
        this.orderContext = orderContext;
        return this;
    }
    public java.util.Map<String, ?> getOrderContext() {
        return this.orderContext;
    }

    public CreateDigitalSignOrderRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public CreateDigitalSignOrderRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDigitalSignOrderRequest setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public Long getQualificationId() {
        return this.qualificationId;
    }

    public CreateDigitalSignOrderRequest setQualificationVersion(Long qualificationVersion) {
        this.qualificationVersion = qualificationVersion;
        return this;
    }
    public Long getQualificationVersion() {
        return this.qualificationVersion;
    }

    public CreateDigitalSignOrderRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDigitalSignOrderRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDigitalSignOrderRequest setSignId(Long signId) {
        this.signId = signId;
        return this;
    }
    public Long getSignId() {
        return this.signId;
    }

    public CreateDigitalSignOrderRequest setSignIndustry(Long signIndustry) {
        this.signIndustry = signIndustry;
        return this;
    }
    public Long getSignIndustry() {
        return this.signIndustry;
    }

    public CreateDigitalSignOrderRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public CreateDigitalSignOrderRequest setSignSource(Long signSource) {
        this.signSource = signSource;
        return this;
    }
    public Long getSignSource() {
        return this.signSource;
    }

    public CreateDigitalSignOrderRequest setSubmitter(String submitter) {
        this.submitter = submitter;
        return this;
    }
    public String getSubmitter() {
        return this.submitter;
    }

}
