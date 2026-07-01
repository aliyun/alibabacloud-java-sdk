// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateSmsSignRequest extends TeaModel {
    /**
     * <p>The ID of the app\&quot;s ICP filing entity.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is required if <code>SignSource</code> is set to 2.</p>
     * </li>
     * <li><p>You can obtain the filing entity ID by calling the <a href="~~CreateSmsAppIcpRecord~~">Create ICP Filing Entity</a> operation.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100001***1234</p>
     */
    @NameInMap("AppIcpRecordId")
    public Long appIcpRecordId;

    /**
     * <p>The app store link. This parameter is required if the signature source (<code>SignSource</code>) is an app (the value is 2). The link must start with <code>http://</code> or <code>https://</code>, and the app must be published in the app store.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com/">http://www.aliyun.com/</a></p>
     */
    @NameInMap("ApplySceneContent")
    public String applySceneContent;

    /**
     * <p>The authorization letter ID. This parameter is required if the signature is for third-party use (<code>ThirdParty</code> is set to <code>true</code>). The Unified Social Credit Code on the authorization letter must match the code in the selected qualification\&quot;s information.</p>
     * 
     * <strong>example:</strong>
     * <p>1000********1234</p>
     */
    @NameInMap("AuthorizationLetterId")
    public Long authorizationLetterId;

    /**
     * <p>Additional supporting materials. You can upload supporting business documents or business screenshots to help with the review. For details on what to upload, see <a href="~~108076#section-xup-k46-yi4~~">Signature application materials</a>.</p>
     */
    @NameInMap("MoreData")
    public java.util.List<String> moreData;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the approved qualification.</p>
     * <blockquote>
     * <ul>
     * <li><p>You must <a href="https://help.aliyun.com/zh/sms/user-guide/new-qualification?spm=a2c4g.11186623.0.0.718d187bbkpMRK">apply for a qualification</a> before applying for an SMS signature.</p>
     * </li>
     * <li><p>You can find the qualification ID on the <a href="https://dysms.console.aliyun.com/domestic/text/qualification">qualification management</a> page.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8563**</p>
     */
    @NameInMap("QualificationId")
    public Long qualificationId;

    /**
     * <p>A description of the SMS signature\&quot;s use case. This information is used during the review and must be 200 characters or less.</p>
     * <blockquote>
     * <ul>
     * <li><p>Describe the use case for your live service. Include relevant links, such as a website link or an app store link.</p>
     * </li>
     * <li><p>Provide a complete example of an SMS message that reflects your use case.</p>
     * </li>
     * <li><p>Provide the values for any variables. Describe the use case in detail and explain why the variables are necessary.</p>
     * </li>
     * <li><p>If the signature involves a government agency or public institution, provide its official landline number.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>Providing complete and accurate information accelerates the review process. If you do not provide the required information, your signature application may be rejected.</p>
     * 
     * <strong>example:</strong>
     * <p>登录场景申请验证码</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the rejected SMS signature. You can find rejected SMS signatures on the <a href="https://dysms.console.aliyun.com/domestic/text/sign">Domestic Messages &gt; Signature Management</a> page in the console, or by calling the <a href="~~QuerySmsSignList~~">QuerySmsSignList</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云验证码</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>The signature source. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: The full or abbreviated name of an enterprise or public institution. <strong>(Recommended)</strong></p>
     * </li>
     * <li><p><strong>5</strong>: The full or abbreviated trademark name.</p>
     * </li>
     * <li><p><strong>2</strong>: The full or abbreviated name of an app. <strong>(Not recommended)</strong></p>
     * </li>
     * </ul>
     * <p>For more information, see <a href="~~108076#section-fow-bfu-wo9~~">signature source</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SignSource")
    public Integer signSource;

    /**
     * <p>The signature type. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: verification code.</p>
     * </li>
     * <li><p><strong>1</strong>: general (default).</p>
     * </li>
     * </ul>
     * <p>We recommend that you use the default value, <strong>general</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SignType")
    public Integer signType;

    /**
     * <p>The signature purpose. Valid values:</p>
     * <ul>
     * <li><p>false: for own use (default). The signature is for a business, website, or product owned by your account\&quot;s verified entity.</p>
     * </li>
     * <li><p>true: for third-party use. The signature is for a business, website, or product not owned by your account\&quot;s verified entity.</p>
     * <blockquote>
     * <p>Notice: Ensure the selected qualification ID matches the signature purpose (for own use or for third-party use).</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ThirdParty")
    public Boolean thirdParty;

    /**
     * <p>The trademark entity ID.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is required if <code>SignSource</code> is set to 5.</p>
     * </li>
     * <li><p>You can obtain the trademark entity ID by calling the <a href="~~CreateSmsTrademark~~">Create Trademark Entity</a> operation.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000009081***</p>
     */
    @NameInMap("TrademarkId")
    public Long trademarkId;

    public static UpdateSmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmsSignRequest self = new UpdateSmsSignRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmsSignRequest setAppIcpRecordId(Long appIcpRecordId) {
        this.appIcpRecordId = appIcpRecordId;
        return this;
    }
    public Long getAppIcpRecordId() {
        return this.appIcpRecordId;
    }

    public UpdateSmsSignRequest setApplySceneContent(String applySceneContent) {
        this.applySceneContent = applySceneContent;
        return this;
    }
    public String getApplySceneContent() {
        return this.applySceneContent;
    }

    public UpdateSmsSignRequest setAuthorizationLetterId(Long authorizationLetterId) {
        this.authorizationLetterId = authorizationLetterId;
        return this;
    }
    public Long getAuthorizationLetterId() {
        return this.authorizationLetterId;
    }

    public UpdateSmsSignRequest setMoreData(java.util.List<String> moreData) {
        this.moreData = moreData;
        return this;
    }
    public java.util.List<String> getMoreData() {
        return this.moreData;
    }

    public UpdateSmsSignRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateSmsSignRequest setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public Long getQualificationId() {
        return this.qualificationId;
    }

    public UpdateSmsSignRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateSmsSignRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateSmsSignRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateSmsSignRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public UpdateSmsSignRequest setSignSource(Integer signSource) {
        this.signSource = signSource;
        return this;
    }
    public Integer getSignSource() {
        return this.signSource;
    }

    public UpdateSmsSignRequest setSignType(Integer signType) {
        this.signType = signType;
        return this;
    }
    public Integer getSignType() {
        return this.signType;
    }

    public UpdateSmsSignRequest setThirdParty(Boolean thirdParty) {
        this.thirdParty = thirdParty;
        return this;
    }
    public Boolean getThirdParty() {
        return this.thirdParty;
    }

    public UpdateSmsSignRequest setTrademarkId(Long trademarkId) {
        this.trademarkId = trademarkId;
        return this;
    }
    public Long getTrademarkId() {
        return this.trademarkId;
    }

}
