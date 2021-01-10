// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMCJobListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("JobIds")
    public String jobIds;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("MaximumPageSize")
    public Long maximumPageSize;

    @NameInMap("State")
    public String state;

    @NameInMap("StartOfJobCreatedTimeRange")
    public String startOfJobCreatedTimeRange;

    @NameInMap("EndOfJobCreatedTimeRange")
    public String endOfJobCreatedTimeRange;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static QueryMCJobListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMCJobListRequest self = new QueryMCJobListRequest();
        return TeaModel.build(map, self);
    }

    public QueryMCJobListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryMCJobListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryMCJobListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryMCJobListRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

    public QueryMCJobListRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QueryMCJobListRequest setMaximumPageSize(Long maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
        return this;
    }
    public Long getMaximumPageSize() {
        return this.maximumPageSize;
    }

    public QueryMCJobListRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public QueryMCJobListRequest setStartOfJobCreatedTimeRange(String startOfJobCreatedTimeRange) {
        this.startOfJobCreatedTimeRange = startOfJobCreatedTimeRange;
        return this;
    }
    public String getStartOfJobCreatedTimeRange() {
        return this.startOfJobCreatedTimeRange;
    }

    public QueryMCJobListRequest setEndOfJobCreatedTimeRange(String endOfJobCreatedTimeRange) {
        this.endOfJobCreatedTimeRange = endOfJobCreatedTimeRange;
        return this;
    }
    public String getEndOfJobCreatedTimeRange() {
        return this.endOfJobCreatedTimeRange;
    }

    public QueryMCJobListRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public QueryMCJobListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
