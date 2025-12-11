// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsSignShrinkRequest extends TeaModel {
    @NameInMap("AppIcpRecordId")
    public Long appIcpRecordId;

    /**
     * <p>Application scenarios, instructions as follows:</p>
     * <ul>
     * <li><p>For registered websites, enter the domain name with HTTP or HTTPS that has been registered with the MIIT.</p>
     * </li>
     * <li><p>For launched apps, provide a display link from the app store with HTTP or HTTPS, ensuring the app is online.</p>
     * </li>
     * <li><p>For public accounts or mini-programs, input the full name, ensuring they are online.</p>
     * </li>
     * <li><p>For e-commerce platform store names, applicable only to enterprise users, provide a display link with HTTP or HTTPS for the store.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com/">http://www.aliyun.com/</a></p>
     */
    @NameInMap("ApplySceneContent")
    public String applySceneContent;

    @NameInMap("AuthorizationLetterId")
    public Long authorizationLetterId;

    /**
     * <p>Additional information to supplement uploaded business proof documents or screenshots, which helps reviewers understand your business details.</p>
     * <p>This parameter is optional; please fill it out based on your actual needs.</p>
     */
    @NameInMap("MoreData")
    public String moreDataShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Approved or under-review qualification ID.</p>
     * <blockquote>
     * <ul>
     * <li>Before applying for an SMS signature, please first <a href="https://help.aliyun.com/zh/sms/user-guide/new-qualification?spm=a2c4g.11186623.0.0.718d187bbkpMRK">Apply for Qualification</a>.</li>
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
     * <p>Explanation of the SMS signature scenario, with a maximum length of 200 characters.</p>
     * <blockquote>
     * <p>The scenario explanation is one of the reference materials for signature review. Please provide a detailed description of the usage scenarios for your live services, along with links to verify these services such as website URLs with MIIT备案, app store display links, full names of public accounts or mini-programs, etc. For login scenarios, test account credentials are also required. A comprehensive application explanation enhances the efficiency of signature and template reviews. Refer to the <strong>Application Scenario</strong> column in the <a href="https://help.aliyun.com/zh/sms/user-guide/signature-specifications-1?spm=a2c4g.11186623.0.i2#section-xup-k46-yi4">Signature Source</a> table for filling in SMS scenarios.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SMS signature for the login scenario using verification code.</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Signature name. Please adhere to the <a href="https://help.aliyun.com/zh/sms/user-guide/signature-specifications-1?spm=a2c4g.11186623.0.0.4f9710fder2gR7#section-0p8-qn8-mmy">Signature Specifications</a>.</p>
     * <blockquote>
     * <ul>
     * <li>Signature names are case-insensitive; e.g., 【Aliyun Communication】 and 【aliyun communication】 are considered identical.</li>
     * <li>If your verification code signature and general signature names are the same, the system defaults to using the general signature for sending SMS messages.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>Signature source. Values:</p>
     * <ul>
     * <li><strong>0</strong>: Full name or abbreviation of an enterprise or institution.</li>
     * <li><strong>1</strong>: Full name or abbreviation of a MIIT-registered website.</li>
     * <li><strong>2</strong>: Full name or abbreviation of an App.</li>
     * <li><strong>3</strong>: Full name or abbreviation of an official account or mini-program.</li>
     * <li><strong>4</strong>: Full name or abbreviation of an e-commerce platform store.</li>
     * <li><strong>5</strong>: Full name or abbreviation of a trademark.</li>
     * </ul>
     * <p>For detailed information on signature sources, refer to <a href="https://help.aliyun.com/zh/sms/user-guide/signature-specifications-1?spm=a2c4g.11186623.0.0.4f9710fder2gR7#section-xup-k46-yi4">Signature Source</a>.</p>
     * <blockquote>
     * <p>This interface does not support applying for signatures with sources as <strong>Test or Learning</strong> and <strong>Trial Use</strong>. If you need to apply for signatures with these sources, please go to the <a href="https://dysms.console.aliyun.com/domestic/text/sign/add/qualification">SMS Service Console</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SignSource")
    public Integer signSource;

    /**
     * <p>Signature type. Values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Verification Code</p>
     * </li>
     * <li><p><strong>1</strong>: General (Default)</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>It is recommended to use the default value: <strong>General</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SignType")
    public Integer signType;

    /**
     * <p>Choose whether the applied signature is for self-use or third-party use.</p>
     * <ul>
     * <li><p>false: Self-use (default)</p>
     * </li>
     * <li><p>true: Third-party use</p>
     * <blockquote>
     * <p>Notice: Please select self-use qualification ID when the signature is for self-use; choose third-party use qualification ID when it\&quot;s for third-party use.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ThirdParty")
    public Boolean thirdParty;

    @NameInMap("TrademarkId")
    public Long trademarkId;

    public static CreateSmsSignShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsSignShrinkRequest self = new CreateSmsSignShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsSignShrinkRequest setAppIcpRecordId(Long appIcpRecordId) {
        this.appIcpRecordId = appIcpRecordId;
        return this;
    }
    public Long getAppIcpRecordId() {
        return this.appIcpRecordId;
    }

    public CreateSmsSignShrinkRequest setApplySceneContent(String applySceneContent) {
        this.applySceneContent = applySceneContent;
        return this;
    }
    public String getApplySceneContent() {
        return this.applySceneContent;
    }

    public CreateSmsSignShrinkRequest setAuthorizationLetterId(Long authorizationLetterId) {
        this.authorizationLetterId = authorizationLetterId;
        return this;
    }
    public Long getAuthorizationLetterId() {
        return this.authorizationLetterId;
    }

    public CreateSmsSignShrinkRequest setMoreDataShrink(String moreDataShrink) {
        this.moreDataShrink = moreDataShrink;
        return this;
    }
    public String getMoreDataShrink() {
        return this.moreDataShrink;
    }

    public CreateSmsSignShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsSignShrinkRequest setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public Long getQualificationId() {
        return this.qualificationId;
    }

    public CreateSmsSignShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateSmsSignShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsSignShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmsSignShrinkRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public CreateSmsSignShrinkRequest setSignSource(Integer signSource) {
        this.signSource = signSource;
        return this;
    }
    public Integer getSignSource() {
        return this.signSource;
    }

    public CreateSmsSignShrinkRequest setSignType(Integer signType) {
        this.signType = signType;
        return this;
    }
    public Integer getSignType() {
        return this.signType;
    }

    public CreateSmsSignShrinkRequest setThirdParty(Boolean thirdParty) {
        this.thirdParty = thirdParty;
        return this;
    }
    public Boolean getThirdParty() {
        return this.thirdParty;
    }

    public CreateSmsSignShrinkRequest setTrademarkId(Long trademarkId) {
        this.trademarkId = trademarkId;
        return this;
    }
    public Long getTrademarkId() {
        return this.trademarkId;
    }

}
