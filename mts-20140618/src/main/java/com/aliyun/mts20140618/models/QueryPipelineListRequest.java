// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryPipelineListRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The IDs of the MPS queues that you want to query. To view the IDs, you can log on to the <strong>MPS console</strong> and choose <strong>Global Settings</strong> &gt; <strong>Pipelines</strong> in the left-side navigation pane. You can query up to 10 MPS queues at a time. Separate multiple IDs of MPS queues with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d1ce4d3efcb549419193f50f1fcd****,72dfa5e679ab4be9a3ed9974c736****</p>
     */
    @NameInMap("PipelineIds")
    public String pipelineIds;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryPipelineListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPipelineListRequest self = new QueryPipelineListRequest();
        return TeaModel.build(map, self);
    }

    public QueryPipelineListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QueryPipelineListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryPipelineListRequest setPipelineIds(String pipelineIds) {
        this.pipelineIds = pipelineIds;
        return this;
    }
    public String getPipelineIds() {
        return this.pipelineIds;
    }

    public QueryPipelineListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryPipelineListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
