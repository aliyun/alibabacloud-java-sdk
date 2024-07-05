// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaListRequest extends TeaModel {
    /**
     * <p>Specifies whether to include media information in the returned result.</p>
     * <ul>
     * <li>Valid values: true and false.</li>
     * <li>Default value: <strong>false</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeMediaInfo")
    public Boolean includeMediaInfo;

    /**
     * <p>Specifies whether to include playback information in the returned result.</p>
     * <ul>
     * <li>Valid values: true and false.</li>
     * <li>Default value: <strong>false</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludePlayList")
    public Boolean includePlayList;

    /**
     * <p>Specifies whether to include snapshot information in the returned result.</p>
     * <ul>
     * <li>Valid values: true and false.</li>
     * <li>Default value: <strong>false</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeSnapshotList")
    public Boolean includeSnapshotList;

    /**
     * <p>Specifies whether to include summaries in the returned result.</p>
     * <ul>
     * <li>Valid values: true and false.</li>
     * <li>Default value: <strong>false</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeSummaryList")
    public Boolean includeSummaryList;

    /**
     * <p>The IDs of the media files. To obtain the ID of a media file, you can perform the following operations in the ApsaraVideo Media Processing (MPS) console: In the left-side navigation pane, choose <strong>Media Management</strong> &gt; <strong>Media List</strong>. Find the required video and click Manage. The ID of the video is displayed on the Basics tab. Separate multiple IDs with commas (,). You can query up to 10 media files at a time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3e1cd21131a94525be55acf65888****,e26cfa29e784402388463f61dbec****</p>
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
