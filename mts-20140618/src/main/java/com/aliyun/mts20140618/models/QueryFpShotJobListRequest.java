// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFpShotJobListRequest extends TeaModel {
    /**
     * <p>The end of the time range within which the jobs to be queried were created. </p>
     * <ul>
     * <li>Specify the time in the ISO 8601 standard in the</li>
     * <li>YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2022-02-14T02:16:07Z</p>
     */
    @NameInMap("EndOfJobCreatedTimeRange")
    public String endOfJobCreatedTimeRange;

    /**
     * <p>The ID of the media fingerprint analysis job that you want to query. To view the job ID, log on to the <a href="https://mps.console.aliyun.com/overview">ApsaraVideo Media Processing (MPS) console</a>, click <strong>Tasks</strong> in the left-side navigation pane, and then click the <strong>Video DNA</strong> tab on the Tasks page. You can query up to 10 media fingerprint analysis jobs at a time. Separate multiple job IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>88c6ca184c0e47098a5b665e2a12****</p>
     */
    @NameInMap("JobIds")
    public String jobIds;

    /**
     * <p>The maximum number of entries to return on each page. </p>
     * <ul>
     * <li>Default value: <strong>10</strong>.</li>
     * <li>Valid values: <strong>1 to 100</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaximumPageSize")
    public Long maximumPageSize;

    /**
     * <p>The token that is used to retrieve the next page of the query results. You do not need to specify this parameter in the first request. The response to the first request contains this parameter, which you add to the next request.</p>
     * 
     * <strong>example:</strong>
     * <p>16f01ad6175e4230ac42bb5182cd****</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the MPS queue. To view the ID of the MPS queue, log on to the <a href="https://mps.console.aliyun.com/overview">MPS console</a> and choose <strong>Global Settings</strong> &gt; <strong>Pipelines</strong> in the left-side navigation pane.</p>
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
     * <p>The beginning of the time range within which the jobs to be queried were created. </p>
     * <ul>
     * <li>Specify the time in the ISO 8601 standard in the</li>
     * <li>YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2021-12-22T03:48:05Z</p>
     */
    @NameInMap("StartOfJobCreatedTimeRange")
    public String startOfJobCreatedTimeRange;

    /**
     * <p>The status of the jobs to be queried. Valid values:</p>
     * <ul>
     * <li><strong>All</strong>: all jobs.</li>
     * <li><strong>Queuing</strong>: the jobs that are being queued.</li>
     * <li><strong>Analysing</strong>: the jobs that are in progress.</li>
     * <li><strong>Fail</strong>: failed jobs.</li>
     * <li><strong>Success</strong>: successful jobs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("State")
    public String state;

    public static QueryFpShotJobListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFpShotJobListRequest self = new QueryFpShotJobListRequest();
        return TeaModel.build(map, self);
    }

    public QueryFpShotJobListRequest setEndOfJobCreatedTimeRange(String endOfJobCreatedTimeRange) {
        this.endOfJobCreatedTimeRange = endOfJobCreatedTimeRange;
        return this;
    }
    public String getEndOfJobCreatedTimeRange() {
        return this.endOfJobCreatedTimeRange;
    }

    public QueryFpShotJobListRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

    public QueryFpShotJobListRequest setMaximumPageSize(Long maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
        return this;
    }
    public Long getMaximumPageSize() {
        return this.maximumPageSize;
    }

    public QueryFpShotJobListRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QueryFpShotJobListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QueryFpShotJobListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryFpShotJobListRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public QueryFpShotJobListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryFpShotJobListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryFpShotJobListRequest setStartOfJobCreatedTimeRange(String startOfJobCreatedTimeRange) {
        this.startOfJobCreatedTimeRange = startOfJobCreatedTimeRange;
        return this;
    }
    public String getStartOfJobCreatedTimeRange() {
        return this.startOfJobCreatedTimeRange;
    }

    public QueryFpShotJobListRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
