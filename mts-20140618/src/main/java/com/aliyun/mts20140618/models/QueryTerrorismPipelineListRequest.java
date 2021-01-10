// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryTerrorismPipelineListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PipelineIds")
    public String pipelineIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static QueryTerrorismPipelineListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTerrorismPipelineListRequest self = new QueryTerrorismPipelineListRequest();
        return TeaModel.build(map, self);
    }

    public QueryTerrorismPipelineListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryTerrorismPipelineListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryTerrorismPipelineListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryTerrorismPipelineListRequest setPipelineIds(String pipelineIds) {
        this.pipelineIds = pipelineIds;
        return this;
    }
    public String getPipelineIds() {
        return this.pipelineIds;
    }

    public QueryTerrorismPipelineListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
