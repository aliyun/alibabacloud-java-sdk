// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class BatchCreateSmsSignRequest extends TeaModel {
    @NameInMap("ColumnIndexMappingRule")
    public BatchCreateSmsSignRequestColumnIndexMappingRule columnIndexMappingRule;

    @NameInMap("ExtendMessage")
    public String extendMessage;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("MoreData")
    public java.util.List<String> moreData;

    @NameInMap("OperationType")
    public Integer operationType;

    @NameInMap("OssKeys")
    public String ossKeys;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SceneType")
    public Integer sceneType;

    @NameInMap("ServiceType")
    public Integer serviceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SignOssKey")
    public String signOssKey;

    @NameInMap("UserViewFileName")
    public String userViewFileName;

    public static BatchCreateSmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateSmsSignRequest self = new BatchCreateSmsSignRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateSmsSignRequest setColumnIndexMappingRule(BatchCreateSmsSignRequestColumnIndexMappingRule columnIndexMappingRule) {
        this.columnIndexMappingRule = columnIndexMappingRule;
        return this;
    }
    public BatchCreateSmsSignRequestColumnIndexMappingRule getColumnIndexMappingRule() {
        return this.columnIndexMappingRule;
    }

    public BatchCreateSmsSignRequest setExtendMessage(String extendMessage) {
        this.extendMessage = extendMessage;
        return this;
    }
    public String getExtendMessage() {
        return this.extendMessage;
    }

    public BatchCreateSmsSignRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public BatchCreateSmsSignRequest setMoreData(java.util.List<String> moreData) {
        this.moreData = moreData;
        return this;
    }
    public java.util.List<String> getMoreData() {
        return this.moreData;
    }

    public BatchCreateSmsSignRequest setOperationType(Integer operationType) {
        this.operationType = operationType;
        return this;
    }
    public Integer getOperationType() {
        return this.operationType;
    }

    public BatchCreateSmsSignRequest setOssKeys(String ossKeys) {
        this.ossKeys = ossKeys;
        return this;
    }
    public String getOssKeys() {
        return this.ossKeys;
    }

    public BatchCreateSmsSignRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchCreateSmsSignRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public BatchCreateSmsSignRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public BatchCreateSmsSignRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BatchCreateSmsSignRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BatchCreateSmsSignRequest setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public Integer getSceneType() {
        return this.sceneType;
    }

    public BatchCreateSmsSignRequest setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public Integer getServiceType() {
        return this.serviceType;
    }

    public BatchCreateSmsSignRequest setSignOssKey(String signOssKey) {
        this.signOssKey = signOssKey;
        return this;
    }
    public String getSignOssKey() {
        return this.signOssKey;
    }

    public BatchCreateSmsSignRequest setUserViewFileName(String userViewFileName) {
        this.userViewFileName = userViewFileName;
        return this;
    }
    public String getUserViewFileName() {
        return this.userViewFileName;
    }

    public static class BatchCreateSmsSignRequestColumnIndexMappingRule extends TeaModel {
        @NameInMap("AdminIdentifiedNumber")
        public Integer adminIdentifiedNumber;

        @NameInMap("AdminName")
        public Integer adminName;

        @NameInMap("CompanyName")
        public Integer companyName;

        @NameInMap("LegalPersonIdentifiedNumber")
        public Integer legalPersonIdentifiedNumber;

        @NameInMap("LegalPersonName")
        public Integer legalPersonName;

        @NameInMap("OrganizationCode")
        public Integer organizationCode;

        @NameInMap("Remark")
        public Integer remark;

        @NameInMap("SceneDescription")
        public Integer sceneDescription;

        @NameInMap("SignatureName")
        public Integer signatureName;

        @NameInMap("SignatureSource")
        public Integer signatureSource;

        @NameInMap("TemplateContent")
        public Integer templateContent;

        public static BatchCreateSmsSignRequestColumnIndexMappingRule build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateSmsSignRequestColumnIndexMappingRule self = new BatchCreateSmsSignRequestColumnIndexMappingRule();
            return TeaModel.build(map, self);
        }

        public BatchCreateSmsSignRequestColumnIndexMappingRule setAdminIdentifiedNumber(Integer adminIdentifiedNumber) {
            this.adminIdentifiedNumber = adminIdentifiedNumber;
            return this;
        }
        public Integer getAdminIdentifiedNumber() {
            return this.adminIdentifiedNumber;
        }

        public BatchCreateSmsSignRequestColumnIndexMappingRule setAdminName(Integer adminName) {
            this.adminName = adminName;
            return this;
        }
        public Integer getAdminName() {
            return this.adminName;
        }

        public BatchCreateSmsSignRequestColumnIndexMappingRule setCompanyName(Integer companyName) {
            this.companyName = companyName;
            return this;
        }
        public Integer getCompanyName() {
            return this.companyName;
        }

        public BatchCreateSmsSignRequestColumnIndexMappingRule setLegalPersonIdentifiedNumber(Integer legalPersonIdentifiedNumber) {
            this.legalPersonIdentifiedNumber = legalPersonIdentifiedNumber;
            return this;
        }
        public Integer getLegalPersonIdentifiedNumber() {
            return this.legalPersonIdentifiedNumber;
        }

        public BatchCreateSmsSignRequestColumnIndexMappingRule setLegalPersonName(Integer legalPersonName) {
            this.legalPersonName = legalPersonName;
            return this;
        }
        public Integer getLegalPersonName() {
            return this.legalPersonName;
        }

        public BatchCreateSmsSignRequestColumnIndexMappingRule setOrganizationCode(Integer organizationCode) {
            this.organizationCode = organizationCode;
            return this;
        }
        public Integer getOrganizationCode() {
            return this.organizationCode;
        }

        public BatchCreateSmsSignRequestColumnIndexMappingRule setRemark(Integer remark) {
            this.remark = remark;
            return this;
        }
        public Integer getRemark() {
            return this.remark;
        }

        public BatchCreateSmsSignRequestColumnIndexMappingRule setSceneDescription(Integer sceneDescription) {
            this.sceneDescription = sceneDescription;
            return this;
        }
        public Integer getSceneDescription() {
            return this.sceneDescription;
        }

        public BatchCreateSmsSignRequestColumnIndexMappingRule setSignatureName(Integer signatureName) {
            this.signatureName = signatureName;
            return this;
        }
        public Integer getSignatureName() {
            return this.signatureName;
        }

        public BatchCreateSmsSignRequestColumnIndexMappingRule setSignatureSource(Integer signatureSource) {
            this.signatureSource = signatureSource;
            return this;
        }
        public Integer getSignatureSource() {
            return this.signatureSource;
        }

        public BatchCreateSmsSignRequestColumnIndexMappingRule setTemplateContent(Integer templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public Integer getTemplateContent() {
            return this.templateContent;
        }

    }

}
