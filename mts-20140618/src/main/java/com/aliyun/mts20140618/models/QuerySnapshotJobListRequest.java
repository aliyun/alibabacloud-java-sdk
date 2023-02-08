// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QuerySnapshotJobListRequest extends TeaModel {
    /**
     * <p>The end of the time range within which the creation time of snapshot jobs to be queried is.</p>
     * <br>
     * <p>*   Specify the time in the ISO 8601 standard in the</p>
     * <p>*   YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("EndOfJobCreatedTimeRange")
    public String endOfJobCreatedTimeRange;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <br>
     * <p>*   Default value: **30**.</p>
     * <p>*   Valid values: **\[1,300]**.</p>
     */
    @NameInMap("MaximumPageSize")
    public Long maximumPageSize;

    /**
     * <p>The token that is used to retrieve the next page of the query results. The value is a 32-bit UUID. If the returned query results cannot be displayed within one page, this parameter is returned. The value of this parameter is updated for each query.</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the MPS queue to which the snapshot jobs that you want to query are submitted. To obtain the ID, you can log on to the **MPS console** and choose **Global Settings** > **Pipelines** in the left-side navigation pane.</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IDs of the snapshot jobs that you want to query. To obtain the IDs, you can log on to the **ApsaraVideo Media Processing (MPS) console**, click **Tasks** in the left-side navigation pane, and then view the IDs on the **Snapshot** tab. You can query up to **10** snapshot jobs at a time. Separate the IDs with commas (,).</p>
     */
    @NameInMap("SnapshotJobIds")
    public String snapshotJobIds;

    /**
     * <p>The beginning of the time range within which the creation time of snapshot jobs to be queried is.</p>
     * <br>
     * <p>*   Specify the time in the ISO 8601 standard in the</p>
     * <p>*   YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("StartOfJobCreatedTimeRange")
    public String startOfJobCreatedTimeRange;

    /**
     * <p>The status of the snapshot jobs that you want to query.</p>
     * <br>
     * <p>*   **Submitted**: The job was submitted.</p>
     * <p>*   **Snapshoting**: The job is being processed.</p>
     * <p>*   **Success**: The job was successfully processed.</p>
     * <p>*   **Fail**: The job failed.</p>
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
