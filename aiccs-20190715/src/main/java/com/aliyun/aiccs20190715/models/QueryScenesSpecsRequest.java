// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryScenesSpecsRequest extends TeaModel {
    @NameInMap("CorpName")
    public String corpName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SceneType")
    public Integer sceneType;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("UsageId")
    public Long usageId;

    public static QueryScenesSpecsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryScenesSpecsRequest self = new QueryScenesSpecsRequest();
        return TeaModel.build(map, self);
    }

    public QueryScenesSpecsRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public QueryScenesSpecsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryScenesSpecsRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryScenesSpecsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryScenesSpecsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryScenesSpecsRequest setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public Integer getSceneType() {
        return this.sceneType;
    }

    public QueryScenesSpecsRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public QueryScenesSpecsRequest setUsageId(Long usageId) {
        this.usageId = usageId;
        return this;
    }
    public Long getUsageId() {
        return this.usageId;
    }

}
