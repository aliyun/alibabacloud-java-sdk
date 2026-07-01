// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsSignRequest extends TeaModel {
    /**
     * <p>The APP-ICP filing entity ID.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required when SignSource is set to 2.</li>
     * <li>You can obtain the filing entity ID by calling the <a href="~~CreateSmsAppIcpRecord~~">CreateSmsAppIcpRecord</a> operation.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10000****029</p>
     */
    @NameInMap("AppIcpRecordId")
    public Long appIcpRecordId;

    /**
     * <blockquote>
     * <p>Notice:  The signature source of launched apps is no longer supported.
     * The app store link. If the signature source is a launched app, that is, SignSource is set to 2, specify a link that starts with http:// or https:// and make sure the app is already launched.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com/">http://www.aliyun.com/</a></p>
     */
    @NameInMap("ApplySceneContent")
    public String applySceneContent;

    /**
     * <p>The ID of the power of attorney. When the signature is for third-party use, this parameter is required. Otherwise, the signature review will not pass. The unified social credit code in the power of attorney must match the unified social credit code in the qualification information bound to the signature. Otherwise, the signature creation fails.</p>
     * 
     * <strong>example:</strong>
     * <p>1000********1234</p>
     */
    @NameInMap("AuthorizationLetterId")
    public Long authorizationLetterId;

    /**
     * <p>The supplementary materials. Upload business proof files or business screenshots to help reviewers understand your business details. See <a href="~~108076#section-xup-k46-yi4~~">Signature application materials</a> and upload the relevant materials.</p>
     */
    @NameInMap("MoreData")
    public java.util.List<String> moreData;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the approved qualification.</p>
     * <blockquote>
     * <ul>
     * <li>Before applying for an SMS signature, <a href="https://help.aliyun.com/document_detail/2539801.html">apply for a qualification</a>.</li>
     * <li>You can view the qualification ID on the <a href="https://dysms.console.aliyun.com/domestic/text/qualification">Qualification Management</a> page.</li>
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
     * <p>The description of the SMS signature scenario. This is one of the reference materials for signature review. The description can be up to 200 characters in length.</p>
     * <blockquote>
     * <ul>
     * <li>You can describe the scenarios of your online service and provide links to the actual business website or marketplace download page.</li>
     * <li>You can provide a complete SMS example that reflects your business scenario.</li>
     * <li>You can provide the pass parameter content of variables and describe in detail the business scenario and the reason for selecting the variable property.</li>
     * <li>If the signature involves a government or public institution, specify the landline phone number of the institution.</li>
     * </ul>
     * </blockquote>
     * <p>A well-documented application description improves the review efficiency for signatures and templates. Failure to follow the specifications or leaving this field empty may affect the approval of your signature.</p>
     * 
     * <strong>example:</strong>
     * <p>登录场景使用验证码</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The signature name. The signature name must comply with the <a href="~~108076#section-0p8-qn8-mmy~~">signature specifications</a>:</p>
     * <ul>
     * <li><p>The name must be 2 to 12 characters in length and cannot contain words such as &quot;test&quot;.</p>
     * </li>
     * <li><p>The name cannot contain symbols such as 【】, (), or []. Special characters such as commas, periods, and spaces are not supported.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Signature names are case-sensitive. For example, 【Aliyun通信】 and 【aliyun通信】 are treated as two different signatures.</li>
     * <li>If your verification code signature and general-purpose signature have the same name, the system uses the general-purpose signature to send SMS messages by default.</li>
     * </ul>
     * </blockquote>
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
     * <li><strong>0</strong>: full name or abbreviation of an enterprise or public institution. <strong>(Recommended)</strong></li>
     * <li><strong>5</strong>: full name or abbreviation of a trademark.</li>
     * <li><strong>2</strong>: full name or abbreviation of an app. <strong>(Not recommended)</strong></li>
     * </ul>
     * <p>For more information about signature sources, see <a href="~~108076#section-fow-bfu-wo9~~">Signature sources</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SignSource")
    public Integer signSource;

    /**
     * <p>The signature type. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: verification code.</p>
     * </li>
     * <li><p><strong>1</strong>: general-purpose (default).</p>
     * </li>
     * </ul>
     * <p>We recommend that you use the default value: <strong>general-purpose</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SignType")
    public Integer signType;

    /**
     * <p>The signature purpose. Valid values:</p>
     * <ul>
     * <li><p>false: for personal use (default). The signature is the enterprise name, website, or product name verified under this account.</p>
     * </li>
     * <li><p>true: for third-party use. The signature is the enterprise name, website, or product name not verified under this account.</p>
     * <blockquote>
     * <p>Notice: If the signature is for personal use, select a qualification ID for personal use. If the signature is for third-party use, select a qualification ID for third-party use..</p>
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
     * <li><ol>
     * <li>This parameter is required when SignSource is set to 5.</li>
     * </ol>
     * </li>
     * <li><ol start="2">
     * <li>You can obtain the trademark entity ID by calling the <a href="~~CreateSmsTrademark~~">CreateSmsTrademark</a> operation.</li>
     * </ol>
     * </li>
     * <li><ol start="3">
     * <li>Based on carrier real-name registration requirements, provide the relevant field information. Otherwise, the probability of review rejection or carrier registration failure increases significantly.</li>
     * </ol>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000009081***</p>
     */
    @NameInMap("TrademarkId")
    public Long trademarkId;

    public static CreateSmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsSignRequest self = new CreateSmsSignRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsSignRequest setAppIcpRecordId(Long appIcpRecordId) {
        this.appIcpRecordId = appIcpRecordId;
        return this;
    }
    public Long getAppIcpRecordId() {
        return this.appIcpRecordId;
    }

    public CreateSmsSignRequest setApplySceneContent(String applySceneContent) {
        this.applySceneContent = applySceneContent;
        return this;
    }
    public String getApplySceneContent() {
        return this.applySceneContent;
    }

    public CreateSmsSignRequest setAuthorizationLetterId(Long authorizationLetterId) {
        this.authorizationLetterId = authorizationLetterId;
        return this;
    }
    public Long getAuthorizationLetterId() {
        return this.authorizationLetterId;
    }

    public CreateSmsSignRequest setMoreData(java.util.List<String> moreData) {
        this.moreData = moreData;
        return this;
    }
    public java.util.List<String> getMoreData() {
        return this.moreData;
    }

    public CreateSmsSignRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsSignRequest setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public Long getQualificationId() {
        return this.qualificationId;
    }

    public CreateSmsSignRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateSmsSignRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsSignRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmsSignRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public CreateSmsSignRequest setSignSource(Integer signSource) {
        this.signSource = signSource;
        return this;
    }
    public Integer getSignSource() {
        return this.signSource;
    }

    public CreateSmsSignRequest setSignType(Integer signType) {
        this.signType = signType;
        return this;
    }
    public Integer getSignType() {
        return this.signType;
    }

    public CreateSmsSignRequest setThirdParty(Boolean thirdParty) {
        this.thirdParty = thirdParty;
        return this;
    }
    public Boolean getThirdParty() {
        return this.thirdParty;
    }

    public CreateSmsSignRequest setTrademarkId(Long trademarkId) {
        this.trademarkId = trademarkId;
        return this;
    }
    public Long getTrademarkId() {
        return this.trademarkId;
    }

}
