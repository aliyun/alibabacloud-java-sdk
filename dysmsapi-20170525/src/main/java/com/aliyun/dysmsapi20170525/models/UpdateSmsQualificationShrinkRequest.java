// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateSmsQualificationShrinkRequest extends TeaModel {
    /**
     * <p>Validity period of the administrator ID card. Format: YYYY-MM-DD~YYYY-MM-DD.</p>
     * <blockquote>
     * <p>When the certificate validity period is long-term, the end date can be set to 2099-12-31.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01~2033-01-01</p>
     */
    @NameInMap("AdminIDCardExpDate")
    public String adminIDCardExpDate;

    /**
     * <p>Photo of the front of the administrator\&quot;s ID card (national emblem side). Only jpg, png, gif, and jpeg image formats are supported, and the image must not exceed 5 MB. Please provide the path of the file uploaded to OSS. The file name to be uploaded must not contain Chinese characters or special characters. For upload operations, see <a href="https://help.aliyun.com/document_detail/2833114.html">Upload Files via OSS</a>.</p>
     * <blockquote>
     * <p>Notice: 
     * No stamp is required for color originals of the certificate. If you upload a photocopy or black-and-white photo, you must affix the enterprise red seal to the photocopy and take a photo to upload.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123456/111.png</p>
     */
    @NameInMap("AdminIDCardFrontFace")
    public String adminIDCardFrontFace;

    /**
     * <p>Administrator\&quot;s ID number.</p>
     * 
     * <strong>example:</strong>
     * <p>511391********5123</p>
     */
    @NameInMap("AdminIDCardNo")
    public String adminIDCardNo;

    /**
     * <p>Photo of the back of the administrator\&quot;s ID card (portrait side). Only jpg, png, gif, and jpeg image formats are supported, and the image must not exceed 5 MB. Please provide the path of the file uploaded to OSS. The file name to be uploaded must not contain Chinese characters or special characters. For upload operations, see <a href="https://help.aliyun.com/document_detail/2833114.html">Upload Files via OSS</a>.</p>
     * <blockquote>
     * <p>Notice: 
     *  No stamp is required for color originals of the certificate. If you upload a photocopy or black-and-white photo, you must affix the enterprise red seal to the photocopy and take a photo to upload.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123456/111.png</p>
     */
    @NameInMap("AdminIDCardPic")
    public String adminIDCardPic;

    /**
     * <p>Administrator ID card type. Valid values:</p>
     * <ul>
     * <li>identityCard: ID card.</li>
     * <li>passport: Passport.</li>
     * <li>homeReturnPermit: Mainland Travel Permit for Hong Kong and Macao Residents.</li>
     * <li>TaiwanCompatriotPermit: Mainland Travel Permit for Taiwan Residents.</li>
     * <li>residencePermit: Residence Permit for Hong Kong, Macao, and Taiwan Residents.</li>
     * <li>other: Other.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>identityCard</p>
     */
    @NameInMap("AdminIDCardType")
    public String adminIDCardType;

    /**
     * <p>Administrator name.</p>
     * <blockquote>
     * <p>The administrator (also known as the operator) refers to the person who logs in to the Alibaba Cloud account and manages the SMS service. Generally, this is the operations personnel who manages qualifications, signatures, and templates and sends SMS messages under this Alibaba Cloud account, and whose phone number can receive verification codes. The administrator is not necessarily the administrator of this Alibaba Cloud account. The administrator can be the same person as the enterprise\&quot;s legal representative.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>李华</p>
     */
    @NameInMap("AdminName")
    public String adminName;

    /**
     * <p>Administrator\&quot;s mobile phone number. Format: +/+86/0086/86 prefix or a phone number without any prefix, for example, 1390000****.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>137********</p>
     */
    @NameInMap("AdminPhoneNo")
    public String adminPhoneNo;

    /**
     * <p>Enterprise business license information. This parameter is required when the purpose of the qualification to be modified is for use by others.</p>
     */
    @NameInMap("BusinessLicensePics")
    public String businessLicensePicsShrink;

    /**
     * <p>Validity period of the business license. Format: YYYY-MM-DD~YYYY-MM-DD.</p>
     * <blockquote>
     * <p>When the certificate validity period is long-term, the end date can be set to 2099-12-31.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01~2033-01-01</p>
     */
    @NameInMap("BussinessLicenseExpDate")
    public String bussinessLicenseExpDate;

    /**
     * <p>Phone verification code. Please call the <a href="~~RequiredPhoneCode~~">RequiredPhoneCode</a> API and pass in the <strong>administrator\&quot;s phone number</strong>, then enter the SMS verification code you receive here.</p>
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
     * <p>Enterprise name. Supported symbols are only the middle dot <code>·</code>, the Chinese symbols <code>【】（）</code>, the English symbols <code>()</code>, and the <code>space</code>. Other symbols or pure numbers are not allowed. The length must not exceed 150 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云云通信有限公司</p>
     */
    @NameInMap("CompanyName")
    public String companyName;

    /**
     * <p>Legal person\&quot;s ID number.</p>
     * 
     * <strong>example:</strong>
     * <p>511391********5123</p>
     */
    @NameInMap("LegalPersonIDCardNo")
    public String legalPersonIDCardNo;

    /**
     * <p>Legal person ID card type. Valid values:</p>
     * <ul>
     * <li>identityCard: ID card.</li>
     * <li>passport: Passport.</li>
     * <li>homeReturnPermit: Mainland Travel Permit for Hong Kong and Macao Residents.</li>
     * <li>TaiwanCompatriotPermit: Mainland Travel Permit for Taiwan Residents.</li>
     * <li>residencePermit: Residence Permit for Hong Kong, Macao, and Taiwan Residents.</li>
     * <li>other: Other.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>identityCard</p>
     */
    @NameInMap("LegalPersonIDCardType")
    public String legalPersonIDCardType;

    /**
     * <p>Photo of the back of the legal representative\&quot;s ID card (portrait side). Only jpg, png, gif, and jpeg image formats are supported, and the image must not exceed 5 MB. Please provide the path of the file uploaded to OSS. The file name to be uploaded must not contain Chinese characters or special characters. For upload operations, see <a href="https://help.aliyun.com/document_detail/2833114.html">Upload Files via OSS</a>.</p>
     * <blockquote>
     * <p>The system will use the legal person name and ID number you provide for verification. If the verification fails, you need to upload a photo of the legal representative\&quot;s ID card.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123456/111.png</p>
     */
    @NameInMap("LegalPersonIdCardBackSide")
    public String legalPersonIdCardBackSide;

    /**
     * <p>Validity period of the legal person ID card. Format: YYYY-MM-DD~YYYY-MM-DD.</p>
     * <blockquote>
     * <p>When the certificate validity period is long-term, the end date can be set to 2099-12-31.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01~2033-01-01</p>
     */
    @NameInMap("LegalPersonIdCardEffTime")
    public String legalPersonIdCardEffTime;

    /**
     * <p>Photo of the front of the legal representative\&quot;s ID card (national emblem side). Only jpg, png, gif, and jpeg image formats are supported, and the image must not exceed 5 MB. Please provide the path of the file uploaded to OSS. The file name to be uploaded must not contain Chinese characters or special characters. For upload operations, see <a href="https://help.aliyun.com/document_detail/2833114.html">Upload Files via OSS</a>.</p>
     * <blockquote>
     * <p>The system will use the legal person name and ID number you provide for verification. If the verification fails, you need to upload a photo of the legal representative\&quot;s ID card.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123456/111.png</p>
     */
    @NameInMap("LegalPersonIdCardFrontSide")
    public String legalPersonIdCardFrontSide;

    /**
     * <p>Name of the legal representative.</p>
     * <blockquote>
     * <ul>
     * <li>If there is no legal representative information on the organization\&quot;s certificate, but there is information about a person in charge / chief representative or similar, please prepare the ID card photo of the corresponding person in charge or chief representative listed on the certificate.</li>
     * <li>If there is no legal representative information on the organization\&quot;s certificate, and there is no information about any person in charge, please prepare the name and ID card photo of the main business contact person.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>李华</p>
     */
    @NameInMap("LegalPersonName")
    public String legalPersonName;

    /**
     * <p>The review order ID. You can obtain the qualifications and their corresponding review order IDs under the current account by calling <a href="~~QuerySmsQualificationRecord~~">Query Qualification List</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2001*****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>Additional materials. If you have other supporting or supplementary materials, photos, etc., you can upload them here.</p>
     */
    @NameInMap("OtherFiles")
    public String otherFilesShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The qualification ID, that is, the ID returned when you <a href="~~SubmitSmsQualification~~">apply for SMS qualification</a>. You can obtain the qualification IDs under the current account by calling <a href="~~QuerySmsQualificationRecord~~">Query Qualification List</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000****</p>
     */
    @NameInMap("QualificationGroupId")
    public Long qualificationGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateSmsQualificationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmsQualificationShrinkRequest self = new UpdateSmsQualificationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmsQualificationShrinkRequest setAdminIDCardExpDate(String adminIDCardExpDate) {
        this.adminIDCardExpDate = adminIDCardExpDate;
        return this;
    }
    public String getAdminIDCardExpDate() {
        return this.adminIDCardExpDate;
    }

    public UpdateSmsQualificationShrinkRequest setAdminIDCardFrontFace(String adminIDCardFrontFace) {
        this.adminIDCardFrontFace = adminIDCardFrontFace;
        return this;
    }
    public String getAdminIDCardFrontFace() {
        return this.adminIDCardFrontFace;
    }

    public UpdateSmsQualificationShrinkRequest setAdminIDCardNo(String adminIDCardNo) {
        this.adminIDCardNo = adminIDCardNo;
        return this;
    }
    public String getAdminIDCardNo() {
        return this.adminIDCardNo;
    }

    public UpdateSmsQualificationShrinkRequest setAdminIDCardPic(String adminIDCardPic) {
        this.adminIDCardPic = adminIDCardPic;
        return this;
    }
    public String getAdminIDCardPic() {
        return this.adminIDCardPic;
    }

    public UpdateSmsQualificationShrinkRequest setAdminIDCardType(String adminIDCardType) {
        this.adminIDCardType = adminIDCardType;
        return this;
    }
    public String getAdminIDCardType() {
        return this.adminIDCardType;
    }

    public UpdateSmsQualificationShrinkRequest setAdminName(String adminName) {
        this.adminName = adminName;
        return this;
    }
    public String getAdminName() {
        return this.adminName;
    }

    public UpdateSmsQualificationShrinkRequest setAdminPhoneNo(String adminPhoneNo) {
        this.adminPhoneNo = adminPhoneNo;
        return this;
    }
    public String getAdminPhoneNo() {
        return this.adminPhoneNo;
    }

    public UpdateSmsQualificationShrinkRequest setBusinessLicensePicsShrink(String businessLicensePicsShrink) {
        this.businessLicensePicsShrink = businessLicensePicsShrink;
        return this;
    }
    public String getBusinessLicensePicsShrink() {
        return this.businessLicensePicsShrink;
    }

    public UpdateSmsQualificationShrinkRequest setBussinessLicenseExpDate(String bussinessLicenseExpDate) {
        this.bussinessLicenseExpDate = bussinessLicenseExpDate;
        return this;
    }
    public String getBussinessLicenseExpDate() {
        return this.bussinessLicenseExpDate;
    }

    public UpdateSmsQualificationShrinkRequest setCertifyCode(String certifyCode) {
        this.certifyCode = certifyCode;
        return this;
    }
    public String getCertifyCode() {
        return this.certifyCode;
    }

    public UpdateSmsQualificationShrinkRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public UpdateSmsQualificationShrinkRequest setLegalPersonIDCardNo(String legalPersonIDCardNo) {
        this.legalPersonIDCardNo = legalPersonIDCardNo;
        return this;
    }
    public String getLegalPersonIDCardNo() {
        return this.legalPersonIDCardNo;
    }

    public UpdateSmsQualificationShrinkRequest setLegalPersonIDCardType(String legalPersonIDCardType) {
        this.legalPersonIDCardType = legalPersonIDCardType;
        return this;
    }
    public String getLegalPersonIDCardType() {
        return this.legalPersonIDCardType;
    }

    public UpdateSmsQualificationShrinkRequest setLegalPersonIdCardBackSide(String legalPersonIdCardBackSide) {
        this.legalPersonIdCardBackSide = legalPersonIdCardBackSide;
        return this;
    }
    public String getLegalPersonIdCardBackSide() {
        return this.legalPersonIdCardBackSide;
    }

    public UpdateSmsQualificationShrinkRequest setLegalPersonIdCardEffTime(String legalPersonIdCardEffTime) {
        this.legalPersonIdCardEffTime = legalPersonIdCardEffTime;
        return this;
    }
    public String getLegalPersonIdCardEffTime() {
        return this.legalPersonIdCardEffTime;
    }

    public UpdateSmsQualificationShrinkRequest setLegalPersonIdCardFrontSide(String legalPersonIdCardFrontSide) {
        this.legalPersonIdCardFrontSide = legalPersonIdCardFrontSide;
        return this;
    }
    public String getLegalPersonIdCardFrontSide() {
        return this.legalPersonIdCardFrontSide;
    }

    public UpdateSmsQualificationShrinkRequest setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public UpdateSmsQualificationShrinkRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public UpdateSmsQualificationShrinkRequest setOtherFilesShrink(String otherFilesShrink) {
        this.otherFilesShrink = otherFilesShrink;
        return this;
    }
    public String getOtherFilesShrink() {
        return this.otherFilesShrink;
    }

    public UpdateSmsQualificationShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateSmsQualificationShrinkRequest setQualificationGroupId(Long qualificationGroupId) {
        this.qualificationGroupId = qualificationGroupId;
        return this;
    }
    public Long getQualificationGroupId() {
        return this.qualificationGroupId;
    }

    public UpdateSmsQualificationShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateSmsQualificationShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
