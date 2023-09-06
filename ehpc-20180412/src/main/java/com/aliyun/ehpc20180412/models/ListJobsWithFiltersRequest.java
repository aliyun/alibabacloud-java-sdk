// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListJobsWithFiltersRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable asynchronous query.</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The ID of the E-HPC cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The latest time when a job is submitted. The value is a UNIX timestamp, which represents the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    /**
     * <p>The earliest time when a job is submitted. The value is a UNIX timestamp, which represents the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    /**
     * <p>The order in which jobs are sorted based on the execution time. Valid values:</p>
     * <br>
     * <p>*   asc: ascending order</p>
     * <p>*   desc: descending order</p>
     */
    @NameInMap("ExecuteOrder")
    public String executeOrder;

    /**
     * <p>The name of the job. Fuzzy search is supported.</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The status of the job. Valid values:</p>
     * <br>
     * <p>*   all</p>
     * <p>*   finished</p>
     * <p>*   notfinish</p>
     * <br>
     * <p>Default value: all.</p>
     */
    @NameInMap("JobStatus")
    public String jobStatus;

    /**
     * <p>The information about the computing nodes that are used to run the job.</p>
     */
    @NameInMap("Nodes")
    public java.util.List<String> nodes;

    /**
     * <p>The page number to return.</p>
     * <br>
     * <p>Pages start from 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 50.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The order in which jobs are sorted based on the time when they queue. Valid values:</p>
     * <br>
     * <p>*   asc: ascending order</p>
     * <p>*   desc: descending order</p>
     */
    @NameInMap("PendOrder")
    public String pendOrder;

    /**
     * <p>The information about the queues in which the job is run.</p>
     */
    @NameInMap("Queues")
    public java.util.List<String> queues;

    /**
     * <p>The ID of the region. You can call the [ListRegions](~~188593~~) operation to query the list of regions where E-HPC is supported.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The order in which jobs are sorted based on the time when they are submitted. Valid values:</p>
     * <br>
     * <p>*   asc: ascending order</p>
     * <p>*   desc: descending order</p>
     */
    @NameInMap("SubmitOrder")
    public String submitOrder;

    /**
     * <p>The users that run the job.</p>
     */
    @NameInMap("Users")
    public java.util.List<String> users;

    public static ListJobsWithFiltersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobsWithFiltersRequest self = new ListJobsWithFiltersRequest();
        return TeaModel.build(map, self);
    }

    public ListJobsWithFiltersRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public ListJobsWithFiltersRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListJobsWithFiltersRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public ListJobsWithFiltersRequest setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public ListJobsWithFiltersRequest setExecuteOrder(String executeOrder) {
        this.executeOrder = executeOrder;
        return this;
    }
    public String getExecuteOrder() {
        return this.executeOrder;
    }

    public ListJobsWithFiltersRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public ListJobsWithFiltersRequest setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public String getJobStatus() {
        return this.jobStatus;
    }

    public ListJobsWithFiltersRequest setNodes(java.util.List<String> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

    public ListJobsWithFiltersRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListJobsWithFiltersRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListJobsWithFiltersRequest setPendOrder(String pendOrder) {
        this.pendOrder = pendOrder;
        return this;
    }
    public String getPendOrder() {
        return this.pendOrder;
    }

    public ListJobsWithFiltersRequest setQueues(java.util.List<String> queues) {
        this.queues = queues;
        return this;
    }
    public java.util.List<String> getQueues() {
        return this.queues;
    }

    public ListJobsWithFiltersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListJobsWithFiltersRequest setSubmitOrder(String submitOrder) {
        this.submitOrder = submitOrder;
        return this;
    }
    public String getSubmitOrder() {
        return this.submitOrder;
    }

    public ListJobsWithFiltersRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

}
