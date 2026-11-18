// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListInventorySynchronizationJobsRequest extends TeaModel {
    /**
     * <p>The end time. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the IDaaS EIAM instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IDs of the synchronization targets.</p>
     */
    @NameInMap("InventorySourceIds")
    public java.util.List<String> inventorySourceIds;

    /**
     * <p>The number of entries to return per page during paging in a paged query. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query token. Set the value to the NextToken value returned from the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The start time. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The synchronization status.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListInventorySynchronizationJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInventorySynchronizationJobsRequest self = new ListInventorySynchronizationJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListInventorySynchronizationJobsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListInventorySynchronizationJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInventorySynchronizationJobsRequest setInventorySourceIds(java.util.List<String> inventorySourceIds) {
        this.inventorySourceIds = inventorySourceIds;
        return this;
    }
    public java.util.List<String> getInventorySourceIds() {
        return this.inventorySourceIds;
    }

    public ListInventorySynchronizationJobsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInventorySynchronizationJobsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInventorySynchronizationJobsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListInventorySynchronizationJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
