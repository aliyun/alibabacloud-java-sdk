// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class QueryKnoxUserPasswordRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ClusterId")
    public String clusterId;

    public static QueryKnoxUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryKnoxUserPasswordRequest self = new QueryKnoxUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public QueryKnoxUserPasswordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryKnoxUserPasswordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryKnoxUserPasswordRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryKnoxUserPasswordRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public QueryKnoxUserPasswordRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
