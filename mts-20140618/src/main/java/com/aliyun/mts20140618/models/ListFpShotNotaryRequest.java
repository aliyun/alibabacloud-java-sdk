// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListFpShotNotaryRequest extends TeaModel {
    @NameInMap("EndOfCreatedTimeRange")
    public String endOfCreatedTimeRange;

    @NameInMap("FpDBId")
    public String fpDBId;

    @NameInMap("MaximumPageSize")
    public Long maximumPageSize;

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

    @NameInMap("StartOfCreatedTimeRange")
    public String startOfCreatedTimeRange;

    public static ListFpShotNotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFpShotNotaryRequest self = new ListFpShotNotaryRequest();
        return TeaModel.build(map, self);
    }

    public ListFpShotNotaryRequest setEndOfCreatedTimeRange(String endOfCreatedTimeRange) {
        this.endOfCreatedTimeRange = endOfCreatedTimeRange;
        return this;
    }
    public String getEndOfCreatedTimeRange() {
        return this.endOfCreatedTimeRange;
    }

    public ListFpShotNotaryRequest setFpDBId(String fpDBId) {
        this.fpDBId = fpDBId;
        return this;
    }
    public String getFpDBId() {
        return this.fpDBId;
    }

    public ListFpShotNotaryRequest setMaximumPageSize(Long maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
        return this;
    }
    public Long getMaximumPageSize() {
        return this.maximumPageSize;
    }

    public ListFpShotNotaryRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListFpShotNotaryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListFpShotNotaryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListFpShotNotaryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListFpShotNotaryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListFpShotNotaryRequest setStartOfCreatedTimeRange(String startOfCreatedTimeRange) {
        this.startOfCreatedTimeRange = startOfCreatedTimeRange;
        return this;
    }
    public String getStartOfCreatedTimeRange() {
        return this.startOfCreatedTimeRange;
    }

}
