// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CreateTransactionRequest extends TeaModel {
    // 是否接受电子发票
    @NameInMap("AcceptElectronicInvoice")
    public Boolean acceptElectronicInvoice;

    // 经营地址：详细地址
    @NameInMap("Address")
    public String address;

    // 商户别名
    @NameInMap("AliasName")
    public String aliasName;

    // 是否自动开发票 目前已经不开票了（发票相关信息可以不填）
    @NameInMap("AutoInvoice")
    public Boolean autoInvoice;

    // 银行账号
    @NameInMap("BankAccount")
    public String bankAccount;

    // 银行名称
    @NameInMap("BankName")
    public String bankName;

    // 个体工商户名称(商户类型为个体工商户时，此字段必填)
    @NameInMap("CertName")
    public String certName;

    // 商户证件编号
    @NameInMap("CertNo")
    public String certNo;

    // 商户证件类型
    @NameInMap("CertType")
    public String certType;

    // 经营地址：市
    @NameInMap("CityCode")
    public String cityCode;

    // 联系人手机号
    @NameInMap("ContactMobile")
    public String contactMobile;

    // 联系人名字
    @NameInMap("ContactName")
    public String contactName;

    // 商户联系人业务标识
    @NameInMap("ContactTag")
    public String contactTag;

    // 商户联系人类型
    @NameInMap("ContactType")
    public String contactType;

    // 经营地址：市
    @NameInMap("DistrictCode")
    public String districtCode;

    @NameInMap("IdType")
    public String idType;

    // 开票地址
    @NameInMap("InvoiceAddress")
    public String invoiceAddress;

    // 开票电话
    @NameInMap("InvoiceTelephone")
    public String invoiceTelephone;

    // 是否极简入驻
    @NameInMap("IsMiniStyle")
    public String isMiniStyle;

    // 合法证书图片  /**      * 法人证件照片      * 外籍与港澳台法人需要传      */
    @NameInMap("LegalCertImage")
    public String legalCertImage;

    // 法人证件号
    @NameInMap("LegalCertNo")
    public String legalCertNo;

    // 法人证件类型
    @NameInMap("LegalCertType")
    public String legalCertType;

    // 法人姓名
    @NameInMap("LegalName")
    public String legalName;

    // 收件人地址：详细地址
    @NameInMap("MailAddress")
    public String mailAddress;

    // 收件人地址：市
    @NameInMap("MailCityCode")
    public String mailCityCode;

    // 收件人地址：县
    @NameInMap("MailDistrictCode")
    public String mailDistrictCode;

    // 收件人姓名
    @NameInMap("MailName")
    public String mailName;

    // 收件人地址：省
    @NameInMap("MailProvinceCode")
    public String mailProvinceCode;

    // 收件人电话
    @NameInMap("MailTelephone")
    public String mailTelephone;

    // 商户类型
    @NameInMap("MerchantType")
    public String merchantType;

    // 商户名称
    @NameInMap("Name")
    public String name;

    @NameInMap("OnlyInvoiceInfo")
    public Boolean onlyInvoiceInfo;

    // 门头照（已废弃）
    @NameInMap("OutDoorImages")
    public String outDoorImages;

    @NameInMap("OuterMerchantId")
    public String outerMerchantId;

    // 商户支付宝账号
    @NameInMap("PayLoginId")
    public String payLoginId;

    // 经营地址：省
    @NameInMap("ProvinceCode")
    public String provinceCode;

    // 场景码
    @NameInMap("Scene")
    public String scene;

    // sellerId
    @NameInMap("SellerId")
    public String sellerId;

    // 客服电话
    @NameInMap("ServicePhone")
    public String servicePhone;

    @NameInMap("SignTimeWithIsv")
    public String signTimeWithIsv;

    // 纳税人识别号
    @NameInMap("TaxNo")
    public String taxNo;

    // 纳税人资格种类
    @NameInMap("TaxPayerQualification")
    public String taxPayerQualification;

    // 纳税人资格开始时间
    @NameInMap("TaxPayerValidation")
    public String taxPayerValidation;

    // 发票抬头
    @NameInMap("Title")
    public String title;

    @NameInMap("WithInvoice")
    public Boolean withInvoice;

    public static CreateTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransactionRequest self = new CreateTransactionRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransactionRequest setAcceptElectronicInvoice(Boolean acceptElectronicInvoice) {
        this.acceptElectronicInvoice = acceptElectronicInvoice;
        return this;
    }
    public Boolean getAcceptElectronicInvoice() {
        return this.acceptElectronicInvoice;
    }

    public CreateTransactionRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateTransactionRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public CreateTransactionRequest setAutoInvoice(Boolean autoInvoice) {
        this.autoInvoice = autoInvoice;
        return this;
    }
    public Boolean getAutoInvoice() {
        return this.autoInvoice;
    }

    public CreateTransactionRequest setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
        return this;
    }
    public String getBankAccount() {
        return this.bankAccount;
    }

    public CreateTransactionRequest setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public CreateTransactionRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CreateTransactionRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateTransactionRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateTransactionRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public CreateTransactionRequest setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
        return this;
    }
    public String getContactMobile() {
        return this.contactMobile;
    }

    public CreateTransactionRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CreateTransactionRequest setContactTag(String contactTag) {
        this.contactTag = contactTag;
        return this;
    }
    public String getContactTag() {
        return this.contactTag;
    }

    public CreateTransactionRequest setContactType(String contactType) {
        this.contactType = contactType;
        return this;
    }
    public String getContactType() {
        return this.contactType;
    }

    public CreateTransactionRequest setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }
    public String getDistrictCode() {
        return this.districtCode;
    }

    public CreateTransactionRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public CreateTransactionRequest setInvoiceAddress(String invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
        return this;
    }
    public String getInvoiceAddress() {
        return this.invoiceAddress;
    }

    public CreateTransactionRequest setInvoiceTelephone(String invoiceTelephone) {
        this.invoiceTelephone = invoiceTelephone;
        return this;
    }
    public String getInvoiceTelephone() {
        return this.invoiceTelephone;
    }

    public CreateTransactionRequest setIsMiniStyle(String isMiniStyle) {
        this.isMiniStyle = isMiniStyle;
        return this;
    }
    public String getIsMiniStyle() {
        return this.isMiniStyle;
    }

    public CreateTransactionRequest setLegalCertImage(String legalCertImage) {
        this.legalCertImage = legalCertImage;
        return this;
    }
    public String getLegalCertImage() {
        return this.legalCertImage;
    }

    public CreateTransactionRequest setLegalCertNo(String legalCertNo) {
        this.legalCertNo = legalCertNo;
        return this;
    }
    public String getLegalCertNo() {
        return this.legalCertNo;
    }

    public CreateTransactionRequest setLegalCertType(String legalCertType) {
        this.legalCertType = legalCertType;
        return this;
    }
    public String getLegalCertType() {
        return this.legalCertType;
    }

    public CreateTransactionRequest setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public CreateTransactionRequest setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
        return this;
    }
    public String getMailAddress() {
        return this.mailAddress;
    }

    public CreateTransactionRequest setMailCityCode(String mailCityCode) {
        this.mailCityCode = mailCityCode;
        return this;
    }
    public String getMailCityCode() {
        return this.mailCityCode;
    }

    public CreateTransactionRequest setMailDistrictCode(String mailDistrictCode) {
        this.mailDistrictCode = mailDistrictCode;
        return this;
    }
    public String getMailDistrictCode() {
        return this.mailDistrictCode;
    }

    public CreateTransactionRequest setMailName(String mailName) {
        this.mailName = mailName;
        return this;
    }
    public String getMailName() {
        return this.mailName;
    }

    public CreateTransactionRequest setMailProvinceCode(String mailProvinceCode) {
        this.mailProvinceCode = mailProvinceCode;
        return this;
    }
    public String getMailProvinceCode() {
        return this.mailProvinceCode;
    }

    public CreateTransactionRequest setMailTelephone(String mailTelephone) {
        this.mailTelephone = mailTelephone;
        return this;
    }
    public String getMailTelephone() {
        return this.mailTelephone;
    }

    public CreateTransactionRequest setMerchantType(String merchantType) {
        this.merchantType = merchantType;
        return this;
    }
    public String getMerchantType() {
        return this.merchantType;
    }

    public CreateTransactionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTransactionRequest setOnlyInvoiceInfo(Boolean onlyInvoiceInfo) {
        this.onlyInvoiceInfo = onlyInvoiceInfo;
        return this;
    }
    public Boolean getOnlyInvoiceInfo() {
        return this.onlyInvoiceInfo;
    }

    public CreateTransactionRequest setOutDoorImages(String outDoorImages) {
        this.outDoorImages = outDoorImages;
        return this;
    }
    public String getOutDoorImages() {
        return this.outDoorImages;
    }

    public CreateTransactionRequest setOuterMerchantId(String outerMerchantId) {
        this.outerMerchantId = outerMerchantId;
        return this;
    }
    public String getOuterMerchantId() {
        return this.outerMerchantId;
    }

    public CreateTransactionRequest setPayLoginId(String payLoginId) {
        this.payLoginId = payLoginId;
        return this;
    }
    public String getPayLoginId() {
        return this.payLoginId;
    }

    public CreateTransactionRequest setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }
    public String getProvinceCode() {
        return this.provinceCode;
    }

    public CreateTransactionRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateTransactionRequest setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public CreateTransactionRequest setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
        return this;
    }
    public String getServicePhone() {
        return this.servicePhone;
    }

    public CreateTransactionRequest setSignTimeWithIsv(String signTimeWithIsv) {
        this.signTimeWithIsv = signTimeWithIsv;
        return this;
    }
    public String getSignTimeWithIsv() {
        return this.signTimeWithIsv;
    }

    public CreateTransactionRequest setTaxNo(String taxNo) {
        this.taxNo = taxNo;
        return this;
    }
    public String getTaxNo() {
        return this.taxNo;
    }

    public CreateTransactionRequest setTaxPayerQualification(String taxPayerQualification) {
        this.taxPayerQualification = taxPayerQualification;
        return this;
    }
    public String getTaxPayerQualification() {
        return this.taxPayerQualification;
    }

    public CreateTransactionRequest setTaxPayerValidation(String taxPayerValidation) {
        this.taxPayerValidation = taxPayerValidation;
        return this;
    }
    public String getTaxPayerValidation() {
        return this.taxPayerValidation;
    }

    public CreateTransactionRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateTransactionRequest setWithInvoice(Boolean withInvoice) {
        this.withInvoice = withInvoice;
        return this;
    }
    public Boolean getWithInvoice() {
        return this.withInvoice;
    }

}
