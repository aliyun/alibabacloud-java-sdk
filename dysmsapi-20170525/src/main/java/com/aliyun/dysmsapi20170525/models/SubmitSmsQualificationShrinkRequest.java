// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SubmitSmsQualificationShrinkRequest extends TeaModel {
    /**
     * <p>The administrator\&quot;s ID card validity period. Format: YYYY-MM-DD~YYYY-MM-DD.</p>
     * <blockquote>
     * <p>If the ID card has a long-term validity period, set the end date to 2099-12-31.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01~2033-01-01</p>
     */
    @NameInMap("AdminIDCardExpDate")
    public String adminIDCardExpDate;

    /**
     * <p>The front photo of the administrator\&quot;s ID card (national emblem side). Only jpg, png, gif, and jpeg formats are supported. The image must not exceed 5 MB. Specify the file path uploaded to OSS. The file name must not contain Chinese characters or special characters. For upload instructions, see <a href="https://help.aliyun.com/document_detail/2833114.html">Upload files through OSS</a>.</p>
     * <blockquote>
     * <p>Notice: 
     * Color originals do not require a stamp. If you upload a photocopy or black-and-white photo, stamp the photocopy with the company seal and take a photo to upload.</p>
     * </blockquote>
     * <p>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456/111.png</p>
     */
    @NameInMap("AdminIDCardFrontFace")
    public String adminIDCardFrontFace;

    /**
     * <p>The administrator\&quot;s ID card number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>511391********5123</p>
     */
    @NameInMap("AdminIDCardNo")
    public String adminIDCardNo;

    /**
     * <p>The back photo of the administrator\&quot;s ID card (portrait side). Only jpg, png, gif, and jpeg formats are supported. The image must not exceed 5 MB. Specify the file path uploaded to OSS. The file name must not contain Chinese characters or special characters. For upload instructions, see <a href="https://help.aliyun.com/document_detail/2833114.html">Upload files through OSS</a>.</p>
     * <blockquote>
     * <p>Notice: 
     * Color originals do not require a stamp. If you upload a photocopy or black-and-white photo, stamp the photocopy with the company seal and take a photo to upload.</p>
     * </blockquote>
     * <p>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456/111.png</p>
     */
    @NameInMap("AdminIDCardPic")
    public String adminIDCardPic;

    /**
     * <p>The administrator\&quot;s ID card type. Valid values:</p>
     * <ul>
     * <li>identityCard: ID card.</li>
     * <li>passport: passport.</li>
     * <li>homeReturnPermit: Hong Kong/Macao resident travel permit to mainland.</li>
     * <li>TaiwanCompatriotPermit: Taiwan resident travel permit to mainland.</li>
     * <li>residencePermit: Hong Kong/Macao/Taiwan resident residence permit.</li>
     * <li>other: other.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>identityCard</p>
     */
    @NameInMap("AdminIDCardType")
    public String adminIDCardType;

    /**
     * <p>The administrator\&quot;s name. Maximum length: 50 characters. <strong>Under the current <a href="https://help.aliyun.com/document_detail/2873145.html">SMS signature real-name requirements</a>, if the same administrator applies for qualifications for multiple different enterprises, carrier registration will fail. Ensure one administrator per enterprise to improve the registration success rate.</strong></p>
     * <blockquote>
     * <p>The administrator (also called the handler) is the person who logs on to the Alibaba Cloud account and manages SMS services. This person typically manages qualifications, signatures, and templates under this Alibaba Cloud account and performs SMS sending operations. This person\&quot;s phone number must be able to receive verification codes. The administrator does not have to be the Alibaba Cloud account administrator and can be the same person as the legal representative.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>李华</p>
     */
    @NameInMap("AdminName")
    public String adminName;

    /**
     * <p>The administrator\&quot;s phone number. Format: +/+86/0086/86 or a phone number without any prefix, such as 1390000****.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>137****1234</p>
     */
    @NameInMap("AdminPhoneNo")
    public String adminPhoneNo;

    /**
     * <p>The business license information. This parameter is required when the qualification purpose <code>UseBySelf</code> is set to <code>false</code> (third-party use).</p>
     * <blockquote>
     * <ul>
     * <li>Based on carrier real-name registration regulatory requirements, we strongly recommend that you provide the relevant field information. Otherwise, the probability of &quot;review rejection or carrier registration failure&quot; increases significantly.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("BusinessLicensePics")
    public String businessLicensePicsShrink;

    /**
     * <p>The business license validity period. Format: YYYY-MM-DD~YYYY-MM-DD.</p>
     * <blockquote>
     * <p>If the certificate has a long-term validity period, set the end date to 2099-12-31.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01~2033-01-01</p>
     */
    @NameInMap("BussinessLicenseExpDate")
    public String bussinessLicenseExpDate;

    /**
     * <p>The phone verification code. Call the <a href="~~RequiredPhoneCode~~">RequiredPhoneCode</a> operation with the <strong>administrator\&quot;s phone number</strong>, and then enter the SMS verification code received.</p>
     * <blockquote>
     * <p>You can use <a href="~~ValidPhoneCode~~">ValidPhoneCode</a> to verify whether the SMS verification code is correct before passing it in.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("CertifyCode")
    public String certifyCode;

    /**
     * <p>The enterprise name. Only the middle dot <code>·</code>, Chinese brackets <code>【】（）</code>, English parentheses <code>()</code>, and <code>spaces</code> are supported as symbols. Other symbols or pure digits are not allowed. Maximum length: 150 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云云通信有限公司</p>
     */
    @NameInMap("CompanyName")
    public String companyName;

    /**
     * <p>The enterprise type. Valid values:</p>
     * <ul>
     * <li><p>COMPANY: enterprise.</p>
     * </li>
     * <li><p>NON_PROFIT_ORGANIZATION: government agency or public institution.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>COMPANY</p>
     */
    @NameInMap("CompanyType")
    public String companyType;

    /**
     * <p>The legal representative\&quot;s ID card number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>511391********5123</p>
     */
    @NameInMap("LegalPersonIDCardNo")
    public String legalPersonIDCardNo;

    /**
     * <p>The legal representative\&quot;s ID card type. Valid values:</p>
     * <ul>
     * <li>identityCard: ID card.</li>
     * <li>passport: passport.</li>
     * <li>homeReturnPermit: Hong Kong/Macao resident travel permit to mainland.</li>
     * <li>TaiwanCompatriotPermit: Taiwan resident travel permit to mainland.</li>
     * <li>residencePermit: Hong Kong/Macao/Taiwan resident residence permit.</li>
     * <li>other: other.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>identityCard</p>
     */
    @NameInMap("LegalPersonIDCardType")
    public String legalPersonIDCardType;

    /**
     * <p>The back photo of the legal representative\&quot;s ID card (portrait side). Only jpg, png, gif, and jpeg formats are supported. The image must not exceed 5 MB. Specify the file path uploaded to OSS. The file name must not contain Chinese characters or special characters. For upload instructions, see <a href="https://help.aliyun.com/document_detail/2833114.html">Upload files through OSS</a>.</p>
     * <blockquote>
     * <p>The system verifies the legal representative\&quot;s name and ID number you provide. If verification fails, you must upload photos of the legal representative\&quot;s ID card.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123456/111.png</p>
     */
    @NameInMap("LegalPersonIdCardBackSide")
    public String legalPersonIdCardBackSide;

    /**
     * <p>The legal representative\&quot;s ID card validity period. Format: YYYY-MM-DD~YYYY-MM-DD.</p>
     * <blockquote>
     * <p>If the ID card has a long-term validity period, set the end date to 2099-12-31.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01~2033-01-01</p>
     */
    @NameInMap("LegalPersonIdCardEffTime")
    public String legalPersonIdCardEffTime;

    /**
     * <p>The front photo of the legal representative\&quot;s ID card (national emblem side). Only jpg, png, gif, and jpeg formats are supported. The image must not exceed 5 MB. Specify the file path uploaded to OSS. The file name must not contain Chinese characters or special characters. For upload instructions, see <a href="https://help.aliyun.com/document_detail/2833114.html">Upload files through OSS</a>.</p>
     * <blockquote>
     * <p>The system verifies the legal representative\&quot;s name and ID number you provide. If verification fails, you must upload photos of the legal representative\&quot;s ID card.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123456/111.png</p>
     */
    @NameInMap("LegalPersonIdCardFrontSide")
    public String legalPersonIdCardFrontSide;

    /**
     * <p>The legal representative\&quot;s name. Maximum length: 50 characters.</p>
     * <blockquote>
     * <ul>
     * <li>If the organization certificate does not contain legal representative information but includes a person in charge or chief representative, prepare the ID card photos of the corresponding person in charge or chief representative listed on the certificate.</li>
     * <li>If the organization certificate contains neither legal representative information nor any person in charge, prepare the name and ID card photos of the primary business contact.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>李华</p>
     */
    @NameInMap("LegalPersonName")
    public String legalPersonName;

    /**
     * <p>The unified social credit code. Maximum length: 150 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>910X********0012</p>
     */
    @NameInMap("OrganizationCode")
    public String organizationCode;

    /**
     * <p>Additional materials. If you have other supporting documents, notes, or photos, upload them here.</p>
     */
    @NameInMap("OtherFiles")
    public String otherFilesShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The qualification name, used to manage and distinguish multiple qualifications you apply for. It does not appear in SMS content. The name must be unique among your existing qualifications. Only Chinese characters, English letters, or combinations with digits are supported. Symbols or pure digits are not supported. Maximum length: 100 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云云通信有限公司资质李华</p>
     */
    @NameInMap("QualificationName")
    public String qualificationName;

    /**
     * <p>Remarks. If you have additional information to provide or notes for the qualification verification reviewer, add a description here.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The purpose of the qualification application. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: <strong>Self-use</strong>. The entity that owns the signature is the same as the entity verified for this account.</li>
     * <li><strong>false</strong>: <strong>Third-party use</strong>. The entity that owns the signature is different from the entity verified for this account.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseBySelf")
    public Boolean useBySelf;

    /**
     * <p>Qualification authorization. Specifies whether to share the qualification with other cloud communication products (such as domestic voice services and domestic number privacy protection). Sharing is available only when you apply for a <strong>self-use qualification</strong> and the qualification information <strong>matches the enterprise information verified for the current Alibaba Cloud account</strong>. Otherwise, this setting has no effect. Valid values:</p>
     * <ul>
     * <li>true: Agree. Your qualification information can be referenced during the qualification verification process of other cloud communication products, eliminating redundant verification.</li>
     * <li>false: Disagree.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WhetherShare")
    public Boolean whetherShare;

    public static SubmitSmsQualificationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmsQualificationShrinkRequest self = new SubmitSmsQualificationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSmsQualificationShrinkRequest setAdminIDCardExpDate(String adminIDCardExpDate) {
        this.adminIDCardExpDate = adminIDCardExpDate;
        return this;
    }
    public String getAdminIDCardExpDate() {
        return this.adminIDCardExpDate;
    }

    public SubmitSmsQualificationShrinkRequest setAdminIDCardFrontFace(String adminIDCardFrontFace) {
        this.adminIDCardFrontFace = adminIDCardFrontFace;
        return this;
    }
    public String getAdminIDCardFrontFace() {
        return this.adminIDCardFrontFace;
    }

    public SubmitSmsQualificationShrinkRequest setAdminIDCardNo(String adminIDCardNo) {
        this.adminIDCardNo = adminIDCardNo;
        return this;
    }
    public String getAdminIDCardNo() {
        return this.adminIDCardNo;
    }

    public SubmitSmsQualificationShrinkRequest setAdminIDCardPic(String adminIDCardPic) {
        this.adminIDCardPic = adminIDCardPic;
        return this;
    }
    public String getAdminIDCardPic() {
        return this.adminIDCardPic;
    }

    public SubmitSmsQualificationShrinkRequest setAdminIDCardType(String adminIDCardType) {
        this.adminIDCardType = adminIDCardType;
        return this;
    }
    public String getAdminIDCardType() {
        return this.adminIDCardType;
    }

    public SubmitSmsQualificationShrinkRequest setAdminName(String adminName) {
        this.adminName = adminName;
        return this;
    }
    public String getAdminName() {
        return this.adminName;
    }

    public SubmitSmsQualificationShrinkRequest setAdminPhoneNo(String adminPhoneNo) {
        this.adminPhoneNo = adminPhoneNo;
        return this;
    }
    public String getAdminPhoneNo() {
        return this.adminPhoneNo;
    }

    public SubmitSmsQualificationShrinkRequest setBusinessLicensePicsShrink(String businessLicensePicsShrink) {
        this.businessLicensePicsShrink = businessLicensePicsShrink;
        return this;
    }
    public String getBusinessLicensePicsShrink() {
        return this.businessLicensePicsShrink;
    }

    public SubmitSmsQualificationShrinkRequest setBussinessLicenseExpDate(String bussinessLicenseExpDate) {
        this.bussinessLicenseExpDate = bussinessLicenseExpDate;
        return this;
    }
    public String getBussinessLicenseExpDate() {
        return this.bussinessLicenseExpDate;
    }

    public SubmitSmsQualificationShrinkRequest setCertifyCode(String certifyCode) {
        this.certifyCode = certifyCode;
        return this;
    }
    public String getCertifyCode() {
        return this.certifyCode;
    }

    public SubmitSmsQualificationShrinkRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public SubmitSmsQualificationShrinkRequest setCompanyType(String companyType) {
        this.companyType = companyType;
        return this;
    }
    public String getCompanyType() {
        return this.companyType;
    }

    public SubmitSmsQualificationShrinkRequest setLegalPersonIDCardNo(String legalPersonIDCardNo) {
        this.legalPersonIDCardNo = legalPersonIDCardNo;
        return this;
    }
    public String getLegalPersonIDCardNo() {
        return this.legalPersonIDCardNo;
    }

    public SubmitSmsQualificationShrinkRequest setLegalPersonIDCardType(String legalPersonIDCardType) {
        this.legalPersonIDCardType = legalPersonIDCardType;
        return this;
    }
    public String getLegalPersonIDCardType() {
        return this.legalPersonIDCardType;
    }

    public SubmitSmsQualificationShrinkRequest setLegalPersonIdCardBackSide(String legalPersonIdCardBackSide) {
        this.legalPersonIdCardBackSide = legalPersonIdCardBackSide;
        return this;
    }
    public String getLegalPersonIdCardBackSide() {
        return this.legalPersonIdCardBackSide;
    }

    public SubmitSmsQualificationShrinkRequest setLegalPersonIdCardEffTime(String legalPersonIdCardEffTime) {
        this.legalPersonIdCardEffTime = legalPersonIdCardEffTime;
        return this;
    }
    public String getLegalPersonIdCardEffTime() {
        return this.legalPersonIdCardEffTime;
    }

    public SubmitSmsQualificationShrinkRequest setLegalPersonIdCardFrontSide(String legalPersonIdCardFrontSide) {
        this.legalPersonIdCardFrontSide = legalPersonIdCardFrontSide;
        return this;
    }
    public String getLegalPersonIdCardFrontSide() {
        return this.legalPersonIdCardFrontSide;
    }

    public SubmitSmsQualificationShrinkRequest setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public SubmitSmsQualificationShrinkRequest setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
        return this;
    }
    public String getOrganizationCode() {
        return this.organizationCode;
    }

    public SubmitSmsQualificationShrinkRequest setOtherFilesShrink(String otherFilesShrink) {
        this.otherFilesShrink = otherFilesShrink;
        return this;
    }
    public String getOtherFilesShrink() {
        return this.otherFilesShrink;
    }

    public SubmitSmsQualificationShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitSmsQualificationShrinkRequest setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName;
        return this;
    }
    public String getQualificationName() {
        return this.qualificationName;
    }

    public SubmitSmsQualificationShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public SubmitSmsQualificationShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitSmsQualificationShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitSmsQualificationShrinkRequest setUseBySelf(Boolean useBySelf) {
        this.useBySelf = useBySelf;
        return this;
    }
    public Boolean getUseBySelf() {
        return this.useBySelf;
    }

    public SubmitSmsQualificationShrinkRequest setWhetherShare(Boolean whetherShare) {
        this.whetherShare = whetherShare;
        return this;
    }
    public Boolean getWhetherShare() {
        return this.whetherShare;
    }

}
