// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QuerySnapshotJobListRequest extends TeaModel {
    /**
     * <p>The snapshot configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>2014-01-12T12:00:00Z</p>
     */
    @NameInMap("EndOfJobCreatedTimeRange")
    public String endOfJobCreatedTimeRange;

    /**
     * <p>The ID of the MPS queue to which the snapshot jobs that you want to query are submitted. To obtain the ID, you can log on to the <strong>MPS console</strong> and choose <strong>Global Settings</strong> &gt; <strong>Pipelines</strong> in the left-side navigation pane.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaximumPageSize")
    public Long maximumPageSize;

    /**
     * <p>The end of the time range within which the creation time of snapshot jobs to be queried is.</p>
     * <ul>
     * <li>Specify the time in the ISO 8601 standard in the</li>
     * <li>YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cc6cbef8e8d5481ca536f5d2a466****</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The start time for taking snapshots. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>b11c171cced04565b1f38f1ecc39****</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The beginning of the time range within which the creation time of snapshot jobs to be queried is.</p>
     * <ul>
     * <li>Specify the time in the ISO 8601 standard in the</li>
     * <li>YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>72dfa5e679ab4be9a3ed9974c736****</p>
     */
    @NameInMap("SnapshotJobIds")
    public String snapshotJobIds;

    /**
     * <p>The time when the job was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2014-01-10T12:00:00Z</p>
     */
    @NameInMap("StartOfJobCreatedTimeRange")
    public String startOfJobCreatedTimeRange;

    /**
     * <p>The information about the snapshot jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>Snapshoting</p>
     */
    @NameInMap("State")
    public String state;

    public static QuerySnapshotJobListRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySnapshotJobListRequest self = new QuerySnapshotJobListRequest();
        return TeaModel.build(map, self);
    }

    public QuerySnapshotJobListRequest setEndOfJobCreatedTimeRange(String endOfJobCreatedTimeRange) {
        this.endOfJobCreatedTimeRange = endOfJobCreatedTimeRange;
        return this;
    }
    public String getEndOfJobCreatedTimeRange() {
        return this.endOfJobCreatedTimeRange;
    }

    public QuerySnapshotJobListRequest setMaximumPageSize(Long maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
        return this;
    }
    public Long getMaximumPageSize() {
        return this.maximumPageSize;
    }

    public QuerySnapshotJobListRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QuerySnapshotJobListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QuerySnapshotJobListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySnapshotJobListRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public QuerySnapshotJobListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySnapshotJobListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySnapshotJobListRequest setSnapshotJobIds(String snapshotJobIds) {
        this.snapshotJobIds = snapshotJobIds;
        return this;
    }
    public String getSnapshotJobIds() {
        return this.snapshotJobIds;
    }

    public QuerySnapshotJobListRequest setStartOfJobCreatedTimeRange(String startOfJobCreatedTimeRange) {
        this.startOfJobCreatedTimeRange = startOfJobCreatedTimeRange;
        return this;
    }
    public String getStartOfJobCreatedTimeRange() {
        return this.startOfJobCreatedTimeRange;
    }

    public QuerySnapshotJobListRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
