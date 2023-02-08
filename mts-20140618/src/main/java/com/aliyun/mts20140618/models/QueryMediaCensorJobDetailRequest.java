// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaCensorJobDetailRequest extends TeaModel {
    /**
     * <p>The ID of the content moderation job. You can obtain the job ID from the response parameters of the [SubmitMediaCensorJob](~~91774~~) operation.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <br>
     * <p>*   Default value: **30**.</p>
     * <p>*   Valid values: **1 to 300**.</p>
     */
    @NameInMap("MaximumPageSize")
    public Long maximumPageSize;

    /**
     * <p>The token that is used to retrieve the next page of the query results. You can leave this parameter empty when you call this operation to query the results of a content moderation job for the first time. The token of the next page is returned after you call this operation to query the results of a content moderation job for the first time.</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryMediaCensorJobDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaCensorJobDetailRequest self = new QueryMediaCensorJobDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryMediaCensorJobDetailRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryMediaCensorJobDetailRequest setMaximumPageSize(Long maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
        return this;
    }
    public Long getMaximumPageSize() {
        return this.maximumPageSize;
    }

    public QueryMediaCensorJobDetailRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QueryMediaCensorJobDetailRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QueryMediaCensorJobDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryMediaCensorJobDetailRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryMediaCensorJobDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
