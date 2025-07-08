// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class BatchCreateSmsSignShrinkRequest extends TeaModel {
    @NameInMap("ColumnIndexMappingRule")
    public String columnIndexMappingRuleShrink;

    @NameInMap("ExtendMessage")
    public String extendMessage;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("MoreData")
    public String moreDataShrink;

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

    public static BatchCreateSmsSignShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateSmsSignShrinkRequest self = new BatchCreateSmsSignShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateSmsSignShrinkRequest setColumnIndexMappingRuleShrink(String columnIndexMappingRuleShrink) {
        this.columnIndexMappingRuleShrink = columnIndexMappingRuleShrink;
        return this;
    }
    public String getColumnIndexMappingRuleShrink() {
        return this.columnIndexMappingRuleShrink;
    }

    public BatchCreateSmsSignShrinkRequest setExtendMessage(String extendMessage) {
        this.extendMessage = extendMessage;
        return this;
    }
    public String getExtendMessage() {
        return this.extendMessage;
    }

    public BatchCreateSmsSignShrinkRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public BatchCreateSmsSignShrinkRequest setMoreDataShrink(String moreDataShrink) {
        this.moreDataShrink = moreDataShrink;
        return this;
    }
    public String getMoreDataShrink() {
        return this.moreDataShrink;
    }

    public BatchCreateSmsSignShrinkRequest setOperationType(Integer operationType) {
        this.operationType = operationType;
        return this;
    }
    public Integer getOperationType() {
        return this.operationType;
    }

    public BatchCreateSmsSignShrinkRequest setOssKeys(String ossKeys) {
        this.ossKeys = ossKeys;
        return this;
    }
    public String getOssKeys() {
        return this.ossKeys;
    }

    public BatchCreateSmsSignShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchCreateSmsSignShrinkRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public BatchCreateSmsSignShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public BatchCreateSmsSignShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BatchCreateSmsSignShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BatchCreateSmsSignShrinkRequest setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public Integer getSceneType() {
        return this.sceneType;
    }

    public BatchCreateSmsSignShrinkRequest setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public Integer getServiceType() {
        return this.serviceType;
    }

    public BatchCreateSmsSignShrinkRequest setSignOssKey(String signOssKey) {
        this.signOssKey = signOssKey;
        return this;
    }
    public String getSignOssKey() {
        return this.signOssKey;
    }

    public BatchCreateSmsSignShrinkRequest setUserViewFileName(String userViewFileName) {
        this.userViewFileName = userViewFileName;
        return this;
    }
    public String getUserViewFileName() {
        return this.userViewFileName;
    }

}
