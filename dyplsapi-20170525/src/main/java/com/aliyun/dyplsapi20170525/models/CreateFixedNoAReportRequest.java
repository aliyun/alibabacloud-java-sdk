// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreateFixedNoAReportRequest extends TeaModel {
    /**
     * <p>所属a号码组id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
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
     * <p>法人/经办人手机号</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>130*****8888</p>
     */
    @NameInMap("CustPhoneNo")
    public String custPhoneNo;

    /**
     * <p>固话客户类型 1:法人,2:经办人</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CustType")
    public Long custType;

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
     * <p>固话申请时服务大厅工单号</p>
     * 
     * <strong>example:</strong>
     * <p>45***12</p>
     */
    @NameInMap("FixedLineWorkId")
    public String fixedLineWorkId;

    /**
     * <p>a号码(固话)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>89*****1234</p>
     */
    @NameInMap("FixedNoA")
    public String fixedNoA;

    /**
     * <p>正面人像照片 OSS 路径地址</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456/test1719383196033.jpg</p>
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

    public static CreateFixedNoAReportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFixedNoAReportRequest self = new CreateFixedNoAReportRequest();
        return TeaModel.build(map, self);
    }

    public CreateFixedNoAReportRequest setANoWhiteGroupId(Long ANoWhiteGroupId) {
        this.ANoWhiteGroupId = ANoWhiteGroupId;
        return this;
    }
    public Long getANoWhiteGroupId() {
        return this.ANoWhiteGroupId;
    }

    public CreateFixedNoAReportRequest setCustName(String custName) {
        this.custName = custName;
        return this;
    }
    public String getCustName() {
        return this.custName;
    }

    public CreateFixedNoAReportRequest setCustPhoneNo(String custPhoneNo) {
        this.custPhoneNo = custPhoneNo;
        return this;
    }
    public String getCustPhoneNo() {
        return this.custPhoneNo;
    }

    public CreateFixedNoAReportRequest setCustType(Long custType) {
        this.custType = custType;
        return this;
    }
    public Long getCustType() {
        return this.custType;
    }

    public CreateFixedNoAReportRequest setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }
    public String getDocumentNumber() {
        return this.documentNumber;
    }

    public CreateFixedNoAReportRequest setDocumentType(Long documentType) {
        this.documentType = documentType;
        return this;
    }
    public Long getDocumentType() {
        return this.documentType;
    }

    public CreateFixedNoAReportRequest setFixedLineWorkId(String fixedLineWorkId) {
        this.fixedLineWorkId = fixedLineWorkId;
        return this;
    }
    public String getFixedLineWorkId() {
        return this.fixedLineWorkId;
    }

    public CreateFixedNoAReportRequest setFixedNoA(String fixedNoA) {
        this.fixedNoA = fixedNoA;
        return this;
    }
    public String getFixedNoA() {
        return this.fixedNoA;
    }

    public CreateFixedNoAReportRequest setIdCardAlivePhoto(String idCardAlivePhoto) {
        this.idCardAlivePhoto = idCardAlivePhoto;
        return this;
    }
    public String getIdCardAlivePhoto() {
        return this.idCardAlivePhoto;
    }

    public CreateFixedNoAReportRequest setIdCardBackPhoto(String idCardBackPhoto) {
        this.idCardBackPhoto = idCardBackPhoto;
        return this;
    }
    public String getIdCardBackPhoto() {
        return this.idCardBackPhoto;
    }

    public CreateFixedNoAReportRequest setIdCardFrontPhoto(String idCardFrontPhoto) {
        this.idCardFrontPhoto = idCardFrontPhoto;
        return this;
    }
    public String getIdCardFrontPhoto() {
        return this.idCardFrontPhoto;
    }

    public CreateFixedNoAReportRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateFixedNoAReportRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateFixedNoAReportRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateFixedNoAReportRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
