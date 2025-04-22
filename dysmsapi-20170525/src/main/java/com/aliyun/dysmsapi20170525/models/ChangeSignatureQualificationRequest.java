// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class ChangeSignatureQualificationRequest extends TeaModel {
    /**
     * <p>授权委托书id</p>
     * 
     * <strong>example:</strong>
     * <p>1000********1234</p>
     */
    @NameInMap("AuthorizationLetterId")
    public Long authorizationLetterId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>资质id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1*****2</p>
     */
    @NameInMap("QualificationId")
    public Long qualificationId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>签名</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("SignatureName")
    public String signatureName;

    public static ChangeSignatureQualificationRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeSignatureQualificationRequest self = new ChangeSignatureQualificationRequest();
        return TeaModel.build(map, self);
    }

    public ChangeSignatureQualificationRequest setAuthorizationLetterId(Long authorizationLetterId) {
        this.authorizationLetterId = authorizationLetterId;
        return this;
    }
    public Long getAuthorizationLetterId() {
        return this.authorizationLetterId;
    }

    public ChangeSignatureQualificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ChangeSignatureQualificationRequest setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public Long getQualificationId() {
        return this.qualificationId;
    }

    public ChangeSignatureQualificationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ChangeSignatureQualificationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ChangeSignatureQualificationRequest setSignatureName(String signatureName) {
        this.signatureName = signatureName;
        return this;
    }
    public String getSignatureName() {
        return this.signatureName;
    }

}
