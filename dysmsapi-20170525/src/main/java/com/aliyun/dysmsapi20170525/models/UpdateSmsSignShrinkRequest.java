// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateSmsSignShrinkRequest extends TeaModel {
    @NameInMap("AppIcpRecordId")
    public Long appIcpRecordId;

    /**
     * <p>Application scenarios, instructions as follows:</p>
     * <ul>
     * <li>For registered websites, please enter the domain name registered with MIIT, including HTTP or HTTPS.</li>
     * <li>For launched apps, provide the display link from the app store with HTTP or HTTPS, ensuring the app is online.</li>
     * <li>For public accounts or mini-programs, fill in the full name, ensuring they are online.</li>
     * <li>For e-commerce platform store names (for enterprise users only), provide the display link with HTTP or HTTPS.</li>
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
     * <p>Additional materials, such as uploading business proof documents or screenshots of business operations, to help reviewers understand your business details.</p>
     */
    @NameInMap("MoreData")
    public String moreDataShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Approved or under-review qualification ID.</p>
     * <blockquote>
     * <ul>
     * <li>Before applying for an SMS signature, please first <a href="https://help.aliyun.com/zh/sms/user-guide/new-qualification?spm=a2c4g.11186623.0.0.718d187bbkpMRK">apply for qualifications</a>.</li>
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
     * <p>The scenario explanation is one of the reference information for signature review. Please provide a detailed description of the usage scenarios of the launched business, along with verifiable information such as website links, registered domain addresses, app store download links, full names of public accounts or mini-programs, etc. For login scenarios, test account credentials are also required. A well-informed application explanation will enhance the efficiency of signature and template reviews. Refer to the <strong>Application Scenarios</strong> column in the <a href="https://help.aliyun.com/zh/sms/user-guide/signature-specifications-1?spm=a2c4g.11186623.0.i2#section-xup-k46-yi4">Signature Source</a> table for filling in SMS scenarios.</p>
     * </blockquote>
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
     * <p>Signature not yet approved.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云验证码</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>Source of the signature. Values:</p>
     * <ul>
     * <li><strong>0</strong>: Full name or abbreviation of enterprises and institutions.</li>
     * <li><strong>1</strong>: Full name or abbreviation of MIIT-registered websites.</li>
     * <li><strong>2</strong>: Full name or abbreviation of app applications.</li>
     * <li><strong>3</strong>: Full name or abbreviation of public accounts or mini-programs.</li>
     * <li><strong>4</strong>: Full name or abbreviation of e-commerce platform store names.</li>
     * <li><strong>5</strong>: Full name or abbreviation of trademarks.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SignSource")
    public Integer signSource;

    /**
     * <p>Signature type. It is recommended to use the default value.</p>
     * <ul>
     * <li><strong>0</strong>: Verification code</li>
     * <li><strong>1</strong>: General (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SignType")
    public Integer signType;

    /**
     * <p>Whether the signature is for self-use or others.</p>
     * <ul>
     * <li>false: Self-use</li>
     * <li>true: Others<blockquote>
     * <p>Notice: When the signature is for self-use, select the self-use qualification ID; when it\&quot;s for others, choose the others\&quot; qualification ID.</p>
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

    public static UpdateSmsSignShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmsSignShrinkRequest self = new UpdateSmsSignShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmsSignShrinkRequest setAppIcpRecordId(Long appIcpRecordId) {
        this.appIcpRecordId = appIcpRecordId;
        return this;
    }
    public Long getAppIcpRecordId() {
        return this.appIcpRecordId;
    }

    public UpdateSmsSignShrinkRequest setApplySceneContent(String applySceneContent) {
        this.applySceneContent = applySceneContent;
        return this;
    }
    public String getApplySceneContent() {
        return this.applySceneContent;
    }

    public UpdateSmsSignShrinkRequest setAuthorizationLetterId(Long authorizationLetterId) {
        this.authorizationLetterId = authorizationLetterId;
        return this;
    }
    public Long getAuthorizationLetterId() {
        return this.authorizationLetterId;
    }

    public UpdateSmsSignShrinkRequest setMoreDataShrink(String moreDataShrink) {
        this.moreDataShrink = moreDataShrink;
        return this;
    }
    public String getMoreDataShrink() {
        return this.moreDataShrink;
    }

    public UpdateSmsSignShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateSmsSignShrinkRequest setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public Long getQualificationId() {
        return this.qualificationId;
    }

    public UpdateSmsSignShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateSmsSignShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateSmsSignShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateSmsSignShrinkRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public UpdateSmsSignShrinkRequest setSignSource(Integer signSource) {
        this.signSource = signSource;
        return this;
    }
    public Integer getSignSource() {
        return this.signSource;
    }

    public UpdateSmsSignShrinkRequest setSignType(Integer signType) {
        this.signType = signType;
        return this;
    }
    public Integer getSignType() {
        return this.signType;
    }

    public UpdateSmsSignShrinkRequest setThirdParty(Boolean thirdParty) {
        this.thirdParty = thirdParty;
        return this;
    }
    public Boolean getThirdParty() {
        return this.thirdParty;
    }

    public UpdateSmsSignShrinkRequest setTrademarkId(Long trademarkId) {
        this.trademarkId = trademarkId;
        return this;
    }
    public Long getTrademarkId() {
        return this.trademarkId;
    }

}
