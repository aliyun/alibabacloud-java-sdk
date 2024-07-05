// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListAllMediaBucketRequest extends TeaModel {
    /**
     * <p>The maximum number of media buckets to return. Valid values: 1 to 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaximumPageSize")
    public Integer maximumPageSize;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. The response to the first request contains this parameter, which is added to the next request.</p>
     * 
     * <strong>example:</strong>
     * <p>P2Zqo1PLGhZdygo-ajSsjUX5zrBHCgXy6j4hEvv****</p>
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

    public static ListAllMediaBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllMediaBucketRequest self = new ListAllMediaBucketRequest();
        return TeaModel.build(map, self);
    }

    public ListAllMediaBucketRequest setMaximumPageSize(Integer maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
        return this;
    }
    public Integer getMaximumPageSize() {
        return this.maximumPageSize;
    }

    public ListAllMediaBucketRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListAllMediaBucketRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListAllMediaBucketRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListAllMediaBucketRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListAllMediaBucketRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
