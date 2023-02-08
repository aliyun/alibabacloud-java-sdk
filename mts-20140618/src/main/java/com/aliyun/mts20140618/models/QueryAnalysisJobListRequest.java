// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryAnalysisJobListRequest extends TeaModel {
    /**
     * <p>The IDs of the template analysis jobs.</p>
     * <br>
     * <p>*   You can query up to 10 jobs at a time.</p>
     * <p>*   Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("AnalysisJobIds")
    public String analysisJobIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryAnalysisJobListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAnalysisJobListRequest self = new QueryAnalysisJobListRequest();
        return TeaModel.build(map, self);
    }

    public QueryAnalysisJobListRequest setAnalysisJobIds(String analysisJobIds) {
        this.analysisJobIds = analysisJobIds;
        return this;
    }
    public String getAnalysisJobIds() {
        return this.analysisJobIds;
    }

    public QueryAnalysisJobListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QueryAnalysisJobListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryAnalysisJobListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryAnalysisJobListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
