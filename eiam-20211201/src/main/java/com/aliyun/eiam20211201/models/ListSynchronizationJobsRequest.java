// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListSynchronizationJobsRequest extends TeaModel {
    /**
     * <p>The direction of the sync task. Valid values:</p>
     * <ul>
     * <li><p>ingress: Inbound.</p>
     * </li>
     * <li><p>egress: Outbound.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ingress</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The synchronization end time. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1649830226000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The filter parameters.</p>
     */
    @NameInMap("Filters")
    public java.util.List<ListSynchronizationJobsRequestFilters> filters;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries to return on each page. The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The token to retrieve the next page of results. If no more pages exist, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number. The value starts from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The synchronization start time. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1649830226000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The status of the sync task. Valid values:</p>
     * <ul>
     * <li><p>pending: The task is pending.</p>
     * </li>
     * <li><p>running: The task is running.</p>
     * </li>
     * <li><p>failed: The task failed.</p>
     * </li>
     * <li><p>partial_success: The task is partially successful.</p>
     * </li>
     * <li><p>success: The task is successful.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>A list of synchronization target IDs. For example, \<code>[idp_111XXXX,idp_222XXXX]\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>target_001</p>
     */
    @NameInMap("TargetIds")
    public java.util.List<String> targetIds;

    /**
     * <p>The type of the synchronization target. Valid values:</p>
     * <ul>
     * <li><p>identity_provider: Identity provider.</p>
     * </li>
     * <li><p>application: Application.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>identity_provider</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static ListSynchronizationJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSynchronizationJobsRequest self = new ListSynchronizationJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListSynchronizationJobsRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListSynchronizationJobsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListSynchronizationJobsRequest setFilters(java.util.List<ListSynchronizationJobsRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<ListSynchronizationJobsRequestFilters> getFilters() {
        return this.filters;
    }

    public ListSynchronizationJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSynchronizationJobsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListSynchronizationJobsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSynchronizationJobsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListSynchronizationJobsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSynchronizationJobsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListSynchronizationJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListSynchronizationJobsRequest setTargetIds(java.util.List<String> targetIds) {
        this.targetIds = targetIds;
        return this;
    }
    public java.util.List<String> getTargetIds() {
        return this.targetIds;
    }

    public ListSynchronizationJobsRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public static class ListSynchronizationJobsRequestFilters extends TeaModel {
        /**
         * <p>The name of the dynamic parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>qps</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values of the dynamic parameter.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListSynchronizationJobsRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsRequestFilters self = new ListSynchronizationJobsRequestFilters();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListSynchronizationJobsRequestFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
