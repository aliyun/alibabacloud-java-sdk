// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateSmsQualificationRequest extends TeaModel {
    /**
     * <p>经办人身份证有效期，格式示例2023-01-01~2033-01-01</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01~2033-01-01</p>
     */
    @NameInMap("AdminIDCardExpDate")
    public String adminIDCardExpDate;

    /**
     * <p>经办人身份证照片国徽面</p>
     * 
     * <strong>example:</strong>
     * <p>123456/111.png</p>
     */
    @NameInMap("AdminIDCardFrontFace")
    public String adminIDCardFrontFace;

    /**
     * <p>经办人身份证号码</p>
     * 
     * <strong>example:</strong>
     * <p>511391********5123</p>
     */
    @NameInMap("AdminIDCardNo")
    public String adminIDCardNo;

    /**
     * <p>经办人身份证照片人像面</p>
     * 
     * <strong>example:</strong>
     * <p>123456/111.png</p>
     */
    @NameInMap("AdminIDCardPic")
    public String adminIDCardPic;

    /**
     * <p>管理员身份证类型。identityCard:中国居民身份证;passport:护照;homeReturnPermit:港澳居民来往内地通行证;TaiwanCompatriotPermit:台湾居民来往大陆通行证;residencePermit:港澳台居民居住证&quot;;other:其他</p>
     * 
     * <strong>example:</strong>
     * <p>identityCard</p>
     */
    @NameInMap("AdminIDCardType")
    public String adminIDCardType;

    /**
     * <p>经办人姓名</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("AdminName")
    public String adminName;

    /**
     * <p>经办人手机号码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>137********</p>
     */
    @NameInMap("AdminPhoneNo")
    public String adminPhoneNo;

    /**
     * <p>企业证件信息</p>
     */
    @NameInMap("BusinessLicensePics")
    public java.util.List<UpdateSmsQualificationRequestBusinessLicensePics> businessLicensePics;

    /**
     * <p>企业营业时间开始和结束字符串，格式示例2023-01-01~2033-01-01</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01~2033-01-01</p>
     */
    @NameInMap("BussinessLicenseExpDate")
    public String bussinessLicenseExpDate;

    /**
     * <p>手机号验证码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("CertifyCode")
    public String certifyCode;

    /**
     * <p>公司名称</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("CompanyName")
    public String companyName;

    /**
     * <p>法人身份证号码</p>
     * 
     * <strong>example:</strong>
     * <p>511391********5123</p>
     */
    @NameInMap("LegalPersonIDCardNo")
    public String legalPersonIDCardNo;

    /**
     * <p>法人身份证类型。identityCard:中国居民身份证;passport:护照;homeReturnPermit:港澳居民来往内地通行证;TaiwanCompatriotPermit:台湾居民来往大陆通行证;residencePermit:港澳台居民居住证&quot;;other:其他</p>
     * 
     * <strong>example:</strong>
     * <p>identityCard</p>
     */
    @NameInMap("LegalPersonIDCardType")
    public String legalPersonIDCardType;

    /**
     * <p>法人身份证照片人像面</p>
     * 
     * <strong>example:</strong>
     * <p>123456/111.png</p>
     */
    @NameInMap("LegalPersonIdCardBackSide")
    public String legalPersonIdCardBackSide;

    /**
     * <p>法人身份证有效期，格式示例2023-01-01~2033-01-01</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01~2033-01-01</p>
     */
    @NameInMap("LegalPersonIdCardEffTime")
    public String legalPersonIdCardEffTime;

    /**
     * <p>法人身份照片证国徽面</p>
     * 
     * <strong>example:</strong>
     * <p>123456/111.png</p>
     */
    @NameInMap("LegalPersonIdCardFrontSide")
    public String legalPersonIdCardFrontSide;

    /**
     * <p>法人姓名</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("LegalPersonName")
    public String legalPersonName;

    /**
     * <p>工单ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2001*****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>更多资料</p>
     */
    @NameInMap("OtherFiles")
    public java.util.List<UpdateSmsQualificationRequestOtherFiles> otherFiles;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>资质组ID</p>
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

    public static UpdateSmsQualificationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmsQualificationRequest self = new UpdateSmsQualificationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmsQualificationRequest setAdminIDCardExpDate(String adminIDCardExpDate) {
        this.adminIDCardExpDate = adminIDCardExpDate;
        return this;
    }
    public String getAdminIDCardExpDate() {
        return this.adminIDCardExpDate;
    }

    public UpdateSmsQualificationRequest setAdminIDCardFrontFace(String adminIDCardFrontFace) {
        this.adminIDCardFrontFace = adminIDCardFrontFace;
        return this;
    }
    public String getAdminIDCardFrontFace() {
        return this.adminIDCardFrontFace;
    }

    public UpdateSmsQualificationRequest setAdminIDCardNo(String adminIDCardNo) {
        this.adminIDCardNo = adminIDCardNo;
        return this;
    }
    public String getAdminIDCardNo() {
        return this.adminIDCardNo;
    }

    public UpdateSmsQualificationRequest setAdminIDCardPic(String adminIDCardPic) {
        this.adminIDCardPic = adminIDCardPic;
        return this;
    }
    public String getAdminIDCardPic() {
        return this.adminIDCardPic;
    }

    public UpdateSmsQualificationRequest setAdminIDCardType(String adminIDCardType) {
        this.adminIDCardType = adminIDCardType;
        return this;
    }
    public String getAdminIDCardType() {
        return this.adminIDCardType;
    }

    public UpdateSmsQualificationRequest setAdminName(String adminName) {
        this.adminName = adminName;
        return this;
    }
    public String getAdminName() {
        return this.adminName;
    }

    public UpdateSmsQualificationRequest setAdminPhoneNo(String adminPhoneNo) {
        this.adminPhoneNo = adminPhoneNo;
        return this;
    }
    public String getAdminPhoneNo() {
        return this.adminPhoneNo;
    }

    public UpdateSmsQualificationRequest setBusinessLicensePics(java.util.List<UpdateSmsQualificationRequestBusinessLicensePics> businessLicensePics) {
        this.businessLicensePics = businessLicensePics;
        return this;
    }
    public java.util.List<UpdateSmsQualificationRequestBusinessLicensePics> getBusinessLicensePics() {
        return this.businessLicensePics;
    }

    public UpdateSmsQualificationRequest setBussinessLicenseExpDate(String bussinessLicenseExpDate) {
        this.bussinessLicenseExpDate = bussinessLicenseExpDate;
        return this;
    }
    public String getBussinessLicenseExpDate() {
        return this.bussinessLicenseExpDate;
    }

    public UpdateSmsQualificationRequest setCertifyCode(String certifyCode) {
        this.certifyCode = certifyCode;
        return this;
    }
    public String getCertifyCode() {
        return this.certifyCode;
    }

    public UpdateSmsQualificationRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public UpdateSmsQualificationRequest setLegalPersonIDCardNo(String legalPersonIDCardNo) {
        this.legalPersonIDCardNo = legalPersonIDCardNo;
        return this;
    }
    public String getLegalPersonIDCardNo() {
        return this.legalPersonIDCardNo;
    }

    public UpdateSmsQualificationRequest setLegalPersonIDCardType(String legalPersonIDCardType) {
        this.legalPersonIDCardType = legalPersonIDCardType;
        return this;
    }
    public String getLegalPersonIDCardType() {
        return this.legalPersonIDCardType;
    }

    public UpdateSmsQualificationRequest setLegalPersonIdCardBackSide(String legalPersonIdCardBackSide) {
        this.legalPersonIdCardBackSide = legalPersonIdCardBackSide;
        return this;
    }
    public String getLegalPersonIdCardBackSide() {
        return this.legalPersonIdCardBackSide;
    }

    public UpdateSmsQualificationRequest setLegalPersonIdCardEffTime(String legalPersonIdCardEffTime) {
        this.legalPersonIdCardEffTime = legalPersonIdCardEffTime;
        return this;
    }
    public String getLegalPersonIdCardEffTime() {
        return this.legalPersonIdCardEffTime;
    }

    public UpdateSmsQualificationRequest setLegalPersonIdCardFrontSide(String legalPersonIdCardFrontSide) {
        this.legalPersonIdCardFrontSide = legalPersonIdCardFrontSide;
        return this;
    }
    public String getLegalPersonIdCardFrontSide() {
        return this.legalPersonIdCardFrontSide;
    }

    public UpdateSmsQualificationRequest setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public UpdateSmsQualificationRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public UpdateSmsQualificationRequest setOtherFiles(java.util.List<UpdateSmsQualificationRequestOtherFiles> otherFiles) {
        this.otherFiles = otherFiles;
        return this;
    }
    public java.util.List<UpdateSmsQualificationRequestOtherFiles> getOtherFiles() {
        return this.otherFiles;
    }

    public UpdateSmsQualificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateSmsQualificationRequest setQualificationGroupId(Long qualificationGroupId) {
        this.qualificationGroupId = qualificationGroupId;
        return this;
    }
    public Long getQualificationGroupId() {
        return this.qualificationGroupId;
    }

    public UpdateSmsQualificationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateSmsQualificationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class UpdateSmsQualificationRequestBusinessLicensePics extends TeaModel {
        /**
         * <p>证件图片标识的osskey</p>
         * 
         * <strong>example:</strong>
         * <p>123456/111.png</p>
         */
        @NameInMap("LicensePic")
        public String licensePic;

        /**
         * <p>企业证件类型，businessLicense:营业执照;organizationCodeLicense:组织机构代码证;taxRegistrationLicense:税务登记证;socialCreditLicense:社会信用代码证书;newStyleBusinessLicense:三证合一;signLegalLicense:签名归属方的事业单位法人证书;otherLicense:其他类型执照证书</p>
         * 
         * <strong>example:</strong>
         * <p>businessLicense</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateSmsQualificationRequestBusinessLicensePics build(java.util.Map<String, ?> map) throws Exception {
            UpdateSmsQualificationRequestBusinessLicensePics self = new UpdateSmsQualificationRequestBusinessLicensePics();
            return TeaModel.build(map, self);
        }

        public UpdateSmsQualificationRequestBusinessLicensePics setLicensePic(String licensePic) {
            this.licensePic = licensePic;
            return this;
        }
        public String getLicensePic() {
            return this.licensePic;
        }

        public UpdateSmsQualificationRequestBusinessLicensePics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateSmsQualificationRequestOtherFiles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123456/111.png</p>
         */
        @NameInMap("LicensePic")
        public String licensePic;

        public static UpdateSmsQualificationRequestOtherFiles build(java.util.Map<String, ?> map) throws Exception {
            UpdateSmsQualificationRequestOtherFiles self = new UpdateSmsQualificationRequestOtherFiles();
            return TeaModel.build(map, self);
        }

        public UpdateSmsQualificationRequestOtherFiles setLicensePic(String licensePic) {
            this.licensePic = licensePic;
            return this;
        }
        public String getLicensePic() {
            return this.licensePic;
        }

    }

}
