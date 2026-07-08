// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class UAIDVerificationRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <blockquote>
     * <p>In <strong>Cell Phone Number Service</strong> -&gt; <a href="https://dytns.console.aliyun.com/analysis/square"><strong>Tag Marketplace</strong></a>, select a tag and submit a usage application. After the application is approved, you will obtain this authorization code.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HwD97InG</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The carrier of the user. Valid values:</p>
     * <ul>
     * <li><strong>CM</strong>: China Mobile.</li>
     * <li><strong>CU</strong>: China Unicom.</li>
     * <li><strong>CT</strong>: China Telecom.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CM</p>
     */
    @NameInMap("Carrier")
    public String carrier;

    /**
     * <p>The public IP address. This parameter is required when the carrier is China Unicom (CU). Both IPv4 and IPv6 addresses are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>2408:8440:308:29dc:ed00:c4ec:475c:25a4</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The external serial number.</p>
     * 
     * <strong>example:</strong>
     * <p>b8b5b3a*******0b9893484fdf412c99</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The province ID. This parameter is optional when the carrier is China Unicom (CU). The value must be the same as the value of the province field in the response returned when the token is obtained.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Province")
    public String province;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The carrier authorization token.  </p>
     * <blockquote>
     * <p>For information about how to obtain the authorization token and its signature, see the GetUAIDApplyTokenSign API documentation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MIGfMA0********3DQEBAQUAA4GNADCB</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The user authorization code, which indicates that the user has granted authorization. The value must be a unique random number that does not exceed 128 characters in length.  </p>
     * <p><warning>When you integrate the service, we recommend that you include UAID-related content in the privacy policy of your product.</warning></p>
     * 
     * <strong>example:</strong>
     * <p>Md****a3Em</p>
     */
    @NameInMap("UserGrantId")
    public String userGrantId;

    public static UAIDVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        UAIDVerificationRequest self = new UAIDVerificationRequest();
        return TeaModel.build(map, self);
    }

    public UAIDVerificationRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public UAIDVerificationRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public UAIDVerificationRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public UAIDVerificationRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public UAIDVerificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UAIDVerificationRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public UAIDVerificationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UAIDVerificationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UAIDVerificationRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public UAIDVerificationRequest setUserGrantId(String userGrantId) {
        this.userGrantId = userGrantId;
        return this;
    }
    public String getUserGrantId() {
        return this.userGrantId;
    }

}
