// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SubmitSmsQualificationShrinkRequest extends TeaModel {
    /**
     * <p>经办人身份证有效期，格式示例2023-01-01~2033-01-01</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01~2033-01-01</p>
     */
    @NameInMap("AdminIDCardExpDate")
    public String adminIDCardExpDate;

    /**
     * <p>经办人身份证照片国徽面</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456/111.png</p>
     */
    @NameInMap("AdminIDCardFrontFace")
    public String adminIDCardFrontFace;

    /**
     * <p>经办人身份证号码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>511391********5123</p>
     */
    @NameInMap("AdminIDCardNo")
    public String adminIDCardNo;

    /**
     * <p>经办人身份证照片人像面</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456/111.png</p>
     */
    @NameInMap("AdminIDCardPic")
    public String adminIDCardPic;

    /**
     * <p>管理员身份证类型。identityCard:中国居民身份证;passport:护照;homeReturnPermit:港澳居民来往内地通行证;TaiwanCompatriotPermit:台湾居民来往大陆通行证;residencePermit:港澳台居民居住证&quot;;other:其他</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>identityCard</p>
     */
    @NameInMap("AdminIDCardType")
    public String adminIDCardType;

    /**
     * <p>经办人姓名</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("AdminName")
    public String adminName;

    /**
     * <p>经办人手机号码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>137****1234</p>
     */
    @NameInMap("AdminPhoneNo")
    public String adminPhoneNo;

    /**
     * <p>企业营业证件信息，非大客户必填</p>
     */
    @NameInMap("BusinessLicensePics")
    public String businessLicensePicsShrink;

    /**
     * <p>企业营业时间开始和结束字符串，格式示例2023-01-01~2033-01-01</p>
     * <p>This parameter is required.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("CompanyName")
    public String companyName;

    /**
     * <p>企业类型, COMPANY:公司;NON_PROFIT_ORGANIZATION:政府或者事业单位</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>COMPANY</p>
     */
    @NameInMap("CompanyType")
    public String companyType;

    /**
     * <p>法人身份证号码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>511391********5123</p>
     */
    @NameInMap("LegalPersonIDCardNo")
    public String legalPersonIDCardNo;

    /**
     * <p>法人身份证类型。identityCard:中国居民身份证;passport:护照;homeReturnPermit:港澳居民来往内地通行证;TaiwanCompatriotPermit:台湾居民来往大陆通行证;residencePermit:港澳台居民居住证&quot;;other:其他</p>
     * <p>This parameter is required.</p>
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
     * <p>法人身份证有效期</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01~2033-01-01</p>
     */
    @NameInMap("LegalPersonIdCardEffTime")
    public String legalPersonIdCardEffTime;

    /**
     * <p>法人身份证照片国徽面</p>
     * 
     * <strong>example:</strong>
     * <p>123456/111.png</p>
     */
    @NameInMap("LegalPersonIdCardFrontSide")
    public String legalPersonIdCardFrontSide;

    /**
     * <p>法人姓名</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("LegalPersonName")
    public String legalPersonName;

    /**
     * <p>社会统一信用代码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>910X********0012</p>
     */
    @NameInMap("OrganizationCode")
    public String organizationCode;

    /**
     * <p>更多资料</p>
     */
    @NameInMap("OtherFiles")
    public String otherFilesShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>资质名称,名称不能重复</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("QualificationName")
    public String qualificationName;

    /**
     * <p>备注</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>资质是自用还是他用，true：自用，false：他用</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseBySelf")
    public Boolean useBySelf;

    /**
     * <p>是否同意与其他业务线共享</p>
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
