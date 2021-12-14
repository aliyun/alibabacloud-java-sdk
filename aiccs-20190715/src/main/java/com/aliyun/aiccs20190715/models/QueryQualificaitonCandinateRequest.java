// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryQualificaitonCandinateRequest extends TeaModel {
    @NameInMap("CallType")
    public Integer callType;

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

    @NameInMap("SceneId")
    public Long sceneId;

    public static QueryQualificaitonCandinateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryQualificaitonCandinateRequest self = new QueryQualificaitonCandinateRequest();
        return TeaModel.build(map, self);
    }

    public QueryQualificaitonCandinateRequest setCallType(Integer callType) {
        this.callType = callType;
        return this;
    }
    public Integer getCallType() {
        return this.callType;
    }

    public QueryQualificaitonCandinateRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public QueryQualificaitonCandinateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryQualificaitonCandinateRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryQualificaitonCandinateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryQualificaitonCandinateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryQualificaitonCandinateRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
