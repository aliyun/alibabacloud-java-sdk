// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryMediaCensorJobDetailRequest extends TeaModel {
    /**
     * <p>The ID of the content moderation job. You can obtain the ID from the response parameters of <a href="https://help.aliyun.com/document_detail/444848.html">Submit a content moderation job</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2288c6ca184c0e47098a5b665e2a12****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The maximum number of entries to return per page.</p>
     * <ul>
     * <li><p>Default value: <strong>30</strong>.</p>
     * </li>
     * <li><p>Valid values: <strong>1</strong> to <strong>300</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaximumPageSize")
    public Long maximumPageSize;

    /**
     * <p>The token for the next page. Leave this parameter empty for the first request. The token is returned after the first query.</p>
     * 
     * <strong>example:</strong>
     * <p>ae0fd49c0840e14daf0d66a75b83****</p>
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
