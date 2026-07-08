// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CertNoThreeElementVerificationRequest extends TeaModel {
    /**
     * <p>The authorization code. Sources:</p>
     * <ul>
     * <li>In the Cell Phone Number Service console, go to the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, select the <strong>ID Card Three Elements</strong> tag, and submit a usage application. After the application is approved, you will obtain the authorization code.</li>
     * <li>On the <a href="https://dytns.console.aliyun.com/analysis/apply">My Applications</a> page of the Cell Phone Number Service console, view the approved <strong>ID Card Three Elements</strong> authorization ID.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>QASDW@#**</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The name to be verified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The ID card number to be verified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3***************0</p>
     */
    @NameInMap("CertNo")
    public String certNo;

    /**
     * <p>The BASE64 encoding of the portrait photo to be verified. <strong>Remove the encoded URI information (such as <code>data:image/png;base64,</code>) before submission</strong>. The photo size and the BASE64-encoded size must not exceed 50 KB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iVBOFMKODOFNDFP123DFSMOO...</p>
     */
    @NameInMap("CertPicture")
    public String certPicture;

    /**
     * <p>Specifies whether to encrypt. Currently only unencrypted is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>不加密</p>
     */
    @NameInMap("Mask")
    public String mask;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CertNoThreeElementVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        CertNoThreeElementVerificationRequest self = new CertNoThreeElementVerificationRequest();
        return TeaModel.build(map, self);
    }

    public CertNoThreeElementVerificationRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public CertNoThreeElementVerificationRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CertNoThreeElementVerificationRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CertNoThreeElementVerificationRequest setCertPicture(String certPicture) {
        this.certPicture = certPicture;
        return this;
    }
    public String getCertPicture() {
        return this.certPicture;
    }

    public CertNoThreeElementVerificationRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public CertNoThreeElementVerificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CertNoThreeElementVerificationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CertNoThreeElementVerificationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
