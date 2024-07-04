// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class QueryMediaListRequest extends TeaModel {
    @NameInMap("IncludeMediaInfo")
    public Boolean includeMediaInfo;

    @NameInMap("IncludePlayList")
    public Boolean includePlayList;

    @NameInMap("IncludeSnapshotList")
    public Boolean includeSnapshotList;

    @NameInMap("IncludeSummaryList")
    public Boolean includeSummaryList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryMediaListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaListRequest self = new QueryMediaListRequest();
        return TeaModel.build(map, self);
    }

    public QueryMediaListRequest setIncludeMediaInfo(Boolean includeMediaInfo) {
        this.includeMediaInfo = includeMediaInfo;
        return this;
    }
    public Boolean getIncludeMediaInfo() {
        return this.includeMediaInfo;
    }

    public QueryMediaListRequest setIncludePlayList(Boolean includePlayList) {
        this.includePlayList = includePlayList;
        return this;
    }
    public Boolean getIncludePlayList() {
        return this.includePlayList;
    }

    public QueryMediaListRequest setIncludeSnapshotList(Boolean includeSnapshotList) {
        this.includeSnapshotList = includeSnapshotList;
        return this;
    }
    public Boolean getIncludeSnapshotList() {
        return this.includeSnapshotList;
    }

    public QueryMediaListRequest setIncludeSummaryList(Boolean includeSummaryList) {
        this.includeSummaryList = includeSummaryList;
        return this;
    }
    public Boolean getIncludeSummaryList() {
        return this.includeSummaryList;
    }

    public QueryMediaListRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

    public QueryMediaListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QueryMediaListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryMediaListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryMediaListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
