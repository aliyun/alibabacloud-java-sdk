// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaCensorJobListRequest extends TeaModel {
    /**
     * <p>The end of the time range within which the jobs to be queried were created.</p>
     * <ul>
     * <li>Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format.</li>
     * <li>The time must be in UTC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2022-02-14T02:16:07Z</p>
     */
    @NameInMap("EndOfJobCreatedTimeRange")
    public String endOfJobCreatedTimeRange;

    /**
     * <p>The ID of the content moderation job. You can call the <a href="https://help.aliyun.com/document_detail/91779.html">SubmitMediaCensorJob</a> operation to query the ID of the content moderation job. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>fa9c34be3bcf42919ac4d1775239****,78dc866518b843259669df58ed30****</p>
     */
    @NameInMap("JobIds")
    public String jobIds;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <ul>
     * <li>Default value: <strong>30</strong>.</li>
     * <li>Valid values: <strong>1 to 300</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaximumPageSize")
    public Long maximumPageSize;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. The returned value of NextPageToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>79aff3eee82242e092899db5f669****</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the ApsaraVideo Media Processing (MPS) queue that is used to run the job. To obtain the ID of the MPS queue, perform the following steps: Log on to the <a href="https://mps.console.aliyun.com/overview"><strong>MPS console</strong></a>. In the left-side navigation pane, choose <strong>Global Settings</strong> &gt; <strong>Pipelines</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>c5b30b7c0d0e4a0abde1d5f9e751****</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The beginning of the time range within which the jobs to be queried were created.</p>
     * <ul>
     * <li>Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format.</li>
     * <li>The time must be in UTC.</li>
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

    public static QueryMediaCensorJobListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaCensorJobListRequest self = new QueryMediaCensorJobListRequest();
        return TeaModel.build(map, self);
    }

    public QueryMediaCensorJobListRequest setEndOfJobCreatedTimeRange(String endOfJobCreatedTimeRange) {
        this.endOfJobCreatedTimeRange = endOfJobCreatedTimeRange;
        return this;
    }
    public String getEndOfJobCreatedTimeRange() {
        return this.endOfJobCreatedTimeRange;
    }

    public QueryMediaCensorJobListRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

    public QueryMediaCensorJobListRequest setMaximumPageSize(Long maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
        return this;
    }
    public Long getMaximumPageSize() {
        return this.maximumPageSize;
    }

    public QueryMediaCensorJobListRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QueryMediaCensorJobListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QueryMediaCensorJobListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryMediaCensorJobListRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public QueryMediaCensorJobListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryMediaCensorJobListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryMediaCensorJobListRequest setStartOfJobCreatedTimeRange(String startOfJobCreatedTimeRange) {
        this.startOfJobCreatedTimeRange = startOfJobCreatedTimeRange;
        return this;
    }
    public String getStartOfJobCreatedTimeRange() {
        return this.startOfJobCreatedTimeRange;
    }

    public QueryMediaCensorJobListRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
