// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class QueryMediaListByURLRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileURLs")
    public String fileURLs;

    @NameInMap("IncludeMediaInfo")
    public Boolean includeMediaInfo;

    @NameInMap("IncludePlayList")
    public Boolean includePlayList;

    @NameInMap("IncludeSnapshotList")
    public Boolean includeSnapshotList;

    @NameInMap("IncludeSummaryList")
    public Boolean includeSummaryList;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryMediaListByURLRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaListByURLRequest self = new QueryMediaListByURLRequest();
        return TeaModel.build(map, self);
    }

    public QueryMediaListByURLRequest setFileURLs(String fileURLs) {
        this.fileURLs = fileURLs;
        return this;
    }
    public String getFileURLs() {
        return this.fileURLs;
    }

    public QueryMediaListByURLRequest setIncludeMediaInfo(Boolean includeMediaInfo) {
        this.includeMediaInfo = includeMediaInfo;
        return this;
    }
    public Boolean getIncludeMediaInfo() {
        return this.includeMediaInfo;
    }

    public QueryMediaListByURLRequest setIncludePlayList(Boolean includePlayList) {
        this.includePlayList = includePlayList;
        return this;
    }
    public Boolean getIncludePlayList() {
        return this.includePlayList;
    }

    public QueryMediaListByURLRequest setIncludeSnapshotList(Boolean includeSnapshotList) {
        this.includeSnapshotList = includeSnapshotList;
        return this;
    }
    public Boolean getIncludeSnapshotList() {
        return this.includeSnapshotList;
    }

    public QueryMediaListByURLRequest setIncludeSummaryList(Boolean includeSummaryList) {
        this.includeSummaryList = includeSummaryList;
        return this;
    }
    public Boolean getIncludeSummaryList() {
        return this.includeSummaryList;
    }

    public QueryMediaListByURLRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QueryMediaListByURLRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryMediaListByURLRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryMediaListByURLRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
