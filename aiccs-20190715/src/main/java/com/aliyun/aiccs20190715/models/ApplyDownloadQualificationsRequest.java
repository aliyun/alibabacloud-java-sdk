// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class ApplyDownloadQualificationsRequest extends TeaModel {
    @NameInMap("CorpName")
    public String corpName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("QualificationType")
    public Integer qualificationType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("specId")
    public Long specId;

    public static ApplyDownloadQualificationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDownloadQualificationsRequest self = new ApplyDownloadQualificationsRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDownloadQualificationsRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public ApplyDownloadQualificationsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ApplyDownloadQualificationsRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ApplyDownloadQualificationsRequest setQualificationType(Integer qualificationType) {
        this.qualificationType = qualificationType;
        return this;
    }
    public Integer getQualificationType() {
        return this.qualificationType;
    }

    public ApplyDownloadQualificationsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ApplyDownloadQualificationsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ApplyDownloadQualificationsRequest setSpecId(Long specId) {
        this.specId = specId;
        return this;
    }
    public Long getSpecId() {
        return this.specId;
    }

}
