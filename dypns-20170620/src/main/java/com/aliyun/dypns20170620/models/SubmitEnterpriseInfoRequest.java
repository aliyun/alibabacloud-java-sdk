// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class SubmitEnterpriseInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BusinessLicenseAddress")
    public String businessLicenseAddress;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BusinessLicensePicture")
    public String businessLicensePicture;

    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnterpriseName")
    public String enterpriseName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LegalPersonCertNumber")
    public String legalPersonCertNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LegalPersonCertPicture")
    public String legalPersonCertPicture;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LegalPersonName")
    public String legalPersonName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ManagerCertNumber")
    public String managerCertNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ManagerCertPicture")
    public String managerCertPicture;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ManagerContactNumber")
    public String managerContactNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ManagerName")
    public String managerName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NumberApplicationLetterPicture")
    public String numberApplicationLetterPicture;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationCode")
    public String organizationCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UndertakingPicture")
    public String undertakingPicture;

    public static SubmitEnterpriseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitEnterpriseInfoRequest self = new SubmitEnterpriseInfoRequest();
        return TeaModel.build(map, self);
    }

    public SubmitEnterpriseInfoRequest setBusinessLicenseAddress(String businessLicenseAddress) {
        this.businessLicenseAddress = businessLicenseAddress;
        return this;
    }
    public String getBusinessLicenseAddress() {
        return this.businessLicenseAddress;
    }

    public SubmitEnterpriseInfoRequest setBusinessLicensePicture(String businessLicensePicture) {
        this.businessLicensePicture = businessLicensePicture;
        return this;
    }
    public String getBusinessLicensePicture() {
        return this.businessLicensePicture;
    }

    public SubmitEnterpriseInfoRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public SubmitEnterpriseInfoRequest setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public SubmitEnterpriseInfoRequest setLegalPersonCertNumber(String legalPersonCertNumber) {
        this.legalPersonCertNumber = legalPersonCertNumber;
        return this;
    }
    public String getLegalPersonCertNumber() {
        return this.legalPersonCertNumber;
    }

    public SubmitEnterpriseInfoRequest setLegalPersonCertPicture(String legalPersonCertPicture) {
        this.legalPersonCertPicture = legalPersonCertPicture;
        return this;
    }
    public String getLegalPersonCertPicture() {
        return this.legalPersonCertPicture;
    }

    public SubmitEnterpriseInfoRequest setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public SubmitEnterpriseInfoRequest setManagerCertNumber(String managerCertNumber) {
        this.managerCertNumber = managerCertNumber;
        return this;
    }
    public String getManagerCertNumber() {
        return this.managerCertNumber;
    }

    public SubmitEnterpriseInfoRequest setManagerCertPicture(String managerCertPicture) {
        this.managerCertPicture = managerCertPicture;
        return this;
    }
    public String getManagerCertPicture() {
        return this.managerCertPicture;
    }

    public SubmitEnterpriseInfoRequest setManagerContactNumber(String managerContactNumber) {
        this.managerContactNumber = managerContactNumber;
        return this;
    }
    public String getManagerContactNumber() {
        return this.managerContactNumber;
    }

    public SubmitEnterpriseInfoRequest setManagerName(String managerName) {
        this.managerName = managerName;
        return this;
    }
    public String getManagerName() {
        return this.managerName;
    }

    public SubmitEnterpriseInfoRequest setNumberApplicationLetterPicture(String numberApplicationLetterPicture) {
        this.numberApplicationLetterPicture = numberApplicationLetterPicture;
        return this;
    }
    public String getNumberApplicationLetterPicture() {
        return this.numberApplicationLetterPicture;
    }

    public SubmitEnterpriseInfoRequest setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
        return this;
    }
    public String getOrganizationCode() {
        return this.organizationCode;
    }

    public SubmitEnterpriseInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitEnterpriseInfoRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public SubmitEnterpriseInfoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitEnterpriseInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitEnterpriseInfoRequest setUndertakingPicture(String undertakingPicture) {
        this.undertakingPicture = undertakingPicture;
        return this;
    }
    public String getUndertakingPicture() {
        return this.undertakingPicture;
    }

}
