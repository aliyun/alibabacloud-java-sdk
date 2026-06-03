// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryGateVerifyStatisticRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthenticationType")
    public Integer authenticationType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static QueryGateVerifyStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGateVerifyStatisticRequest self = new QueryGateVerifyStatisticRequest();
        return TeaModel.build(map, self);
    }

    public QueryGateVerifyStatisticRequest setAuthenticationType(Integer authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public Integer getAuthenticationType() {
        return this.authenticationType;
    }

    public QueryGateVerifyStatisticRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryGateVerifyStatisticRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public QueryGateVerifyStatisticRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryGateVerifyStatisticRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryGateVerifyStatisticRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryGateVerifyStatisticRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryGateVerifyStatisticRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryGateVerifyStatisticRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
