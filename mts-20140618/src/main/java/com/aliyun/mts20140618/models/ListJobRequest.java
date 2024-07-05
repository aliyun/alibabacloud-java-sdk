// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListJobRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2014-01-11T12:00:00Z</p>
     */
    @NameInMap("EndOfJobCreatedTimeRange")
    public String endOfJobCreatedTimeRange;

    /**
     * <p>The number of entries per page.</p>
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
     * <p>The token that is used to retrieve the next page of the query results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextPageToken.</p>
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
     * <p>The ID of the MPS queue to which the job is submitted. To obtain the ID of an MPS queue, you can log on to the <a href="https://mps.console.aliyun.com/overview">MPS console</a> and choose <strong>Global Settings</strong> &gt; <strong>MPS Queue and Callback</strong> in the left-side navigation pane.</p>
     * 
     * <strong>example:</strong>
     * <p>88c6ca184c0e424d5w5b665e2a12****</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2014-01-10T12:00:00Z</p>
     */
    @NameInMap("StartOfJobCreatedTimeRange")
    public String startOfJobCreatedTimeRange;

    /**
     * <p>The state of the transcoding job. Default value: <strong>All</strong>. Valid values:</p>
     * <ul>
     * <li><strong>All</strong></li>
     * <li><strong>Submitted</strong></li>
     * <li><strong>Transcoding</strong></li>
     * <li><strong>TranscodeSuccess</strong></li>
     * <li><strong>TranscodeFail</strong></li>
     * <li><strong>TranscodeCancelled</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("State")
    public String state;

    public static ListJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobRequest self = new ListJobRequest();
        return TeaModel.build(map, self);
    }

    public ListJobRequest setEndOfJobCreatedTimeRange(String endOfJobCreatedTimeRange) {
        this.endOfJobCreatedTimeRange = endOfJobCreatedTimeRange;
        return this;
    }
    public String getEndOfJobCreatedTimeRange() {
        return this.endOfJobCreatedTimeRange;
    }

    public ListJobRequest setMaximumPageSize(Long maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
        return this;
    }
    public Long getMaximumPageSize() {
        return this.maximumPageSize;
    }

    public ListJobRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public ListJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListJobRequest setStartOfJobCreatedTimeRange(String startOfJobCreatedTimeRange) {
        this.startOfJobCreatedTimeRange = startOfJobCreatedTimeRange;
        return this;
    }
    public String getStartOfJobCreatedTimeRange() {
        return this.startOfJobCreatedTimeRange;
    }

    public ListJobRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
