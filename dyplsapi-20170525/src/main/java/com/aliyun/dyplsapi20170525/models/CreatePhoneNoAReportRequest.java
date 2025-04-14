// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreatePhoneNoAReportRequest extends TeaModel {
    /**
     * <p>所属a号码组id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>19</p>
     */
    @NameInMap("ANoWhiteGroupId")
    public Long ANoWhiteGroupId;

    /**
     * <p>姓名</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>赵**</p>
     */
    @NameInMap("CustName")
    public String custName;

    /**
     * <p>证件号码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>370*********</p>
     */
    @NameInMap("DocumentNumber")
    public String documentNumber;

    /**
     * <p>证件类型 填写1表示身份证</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DocumentType")
    public Long documentType;

    /**
     * <p>半身照oss路径地址</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456/test1719383196033.jpg示例值</p>
     */
    @NameInMap("IdCardAlivePhoto")
    public String idCardAlivePhoto;

    /**
     * <p>身份证反面照片oss路径地址</p>
     * 
     * <strong>example:</strong>
     * <p>123456/test1719383196032.jpg</p>
     */
    @NameInMap("IdCardBackPhoto")
    public String idCardBackPhoto;

    /**
     * <p>身份证正面照片oss路径地址</p>
     * 
     * <strong>example:</strong>
     * <p>123456/test1719383196031.jpg</p>
     */
    @NameInMap("IdCardFrontPhoto")
    public String idCardFrontPhoto;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>手机号</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>130*****1234</p>
     */
    @NameInMap("PhoneNoA")
    public String phoneNoA;

    /**
     * <p>备注（客户自己的业务备注，可编辑）</p>
     * 
     * <strong>example:</strong>
     * <p>***报备</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreatePhoneNoAReportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePhoneNoAReportRequest self = new CreatePhoneNoAReportRequest();
        return TeaModel.build(map, self);
    }

    public CreatePhoneNoAReportRequest setANoWhiteGroupId(Long ANoWhiteGroupId) {
        this.ANoWhiteGroupId = ANoWhiteGroupId;
        return this;
    }
    public Long getANoWhiteGroupId() {
        return this.ANoWhiteGroupId;
    }

    public CreatePhoneNoAReportRequest setCustName(String custName) {
        this.custName = custName;
        return this;
    }
    public String getCustName() {
        return this.custName;
    }

    public CreatePhoneNoAReportRequest setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }
    public String getDocumentNumber() {
        return this.documentNumber;
    }

    public CreatePhoneNoAReportRequest setDocumentType(Long documentType) {
        this.documentType = documentType;
        return this;
    }
    public Long getDocumentType() {
        return this.documentType;
    }

    public CreatePhoneNoAReportRequest setIdCardAlivePhoto(String idCardAlivePhoto) {
        this.idCardAlivePhoto = idCardAlivePhoto;
        return this;
    }
    public String getIdCardAlivePhoto() {
        return this.idCardAlivePhoto;
    }

    public CreatePhoneNoAReportRequest setIdCardBackPhoto(String idCardBackPhoto) {
        this.idCardBackPhoto = idCardBackPhoto;
        return this;
    }
    public String getIdCardBackPhoto() {
        return this.idCardBackPhoto;
    }

    public CreatePhoneNoAReportRequest setIdCardFrontPhoto(String idCardFrontPhoto) {
        this.idCardFrontPhoto = idCardFrontPhoto;
        return this;
    }
    public String getIdCardFrontPhoto() {
        return this.idCardFrontPhoto;
    }

    public CreatePhoneNoAReportRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreatePhoneNoAReportRequest setPhoneNoA(String phoneNoA) {
        this.phoneNoA = phoneNoA;
        return this;
    }
    public String getPhoneNoA() {
        return this.phoneNoA;
    }

    public CreatePhoneNoAReportRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreatePhoneNoAReportRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreatePhoneNoAReportRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
