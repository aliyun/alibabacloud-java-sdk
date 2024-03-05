// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListServerlessJobsRequest extends TeaModel {
    /**
     * <p>The ID of the E-HPC cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The list of serverless job IDs or subtask IDs (array jobs).</p>
     */
    @NameInMap("JobIds")
    public java.util.List<String> jobIds;

    /**
     * <p>The names of the serverless jobs.</p>
     */
    @NameInMap("JobNames")
    public java.util.List<String> jobNames;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100. Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID. You can call the [ListRegions](~~188593~~) operation to query the list of regions where E-HPC is supported.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to sort the serverless jobs by the job start time. Valid values:</p>
     * <br>
     * <p>*   Asc: ascending order.</p>
     * <p>*   Desc: descending order.</p>
     */
    @NameInMap("StartOrder")
    public String startOrder;

    /**
     * <p>The status of the serverless job. Valid values:</p>
     * <br>
     * <p>*   All</p>
     * <p>*   Pending</p>
     * <p>*   Running</p>
     * <p>*   Succeeded</p>
     * <p>*   Canceled</p>
     * <p>*   Failed</p>
     * <br>
     * <p>Default value: All.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>Specifies whether to sort the serverless jobs by the job submission time. Valid values:</p>
     * <br>
     * <p>*   Asc: ascending order.</p>
     * <p>*   Desc: descending order.</p>
     */
    @NameInMap("SubmitOrder")
    public String submitOrder;

    /**
     * <p>The latest time at which the job is submitted.</p>
     * <br>
     * <p>>  You can use this parameter to query the job list based on the job submission time.</p>
     */
    @NameInMap("SubmitTimeEnd")
    public String submitTimeEnd;

    /**
     * <p>The earliest time at which the job is submitted.</p>
     * <br>
     * <p>>  You can use this parameter to query the job list based on the job submission time.</p>
     */
    @NameInMap("SubmitTimeStart")
    public String submitTimeStart;

    public static ListServerlessJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServerlessJobsRequest self = new ListServerlessJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListServerlessJobsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListServerlessJobsRequest setJobIds(java.util.List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public java.util.List<String> getJobIds() {
        return this.jobIds;
    }

    public ListServerlessJobsRequest setJobNames(java.util.List<String> jobNames) {
        this.jobNames = jobNames;
        return this;
    }
    public java.util.List<String> getJobNames() {
        return this.jobNames;
    }

    public ListServerlessJobsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListServerlessJobsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListServerlessJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServerlessJobsRequest setStartOrder(String startOrder) {
        this.startOrder = startOrder;
        return this;
    }
    public String getStartOrder() {
        return this.startOrder;
    }

    public ListServerlessJobsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListServerlessJobsRequest setSubmitOrder(String submitOrder) {
        this.submitOrder = submitOrder;
        return this;
    }
    public String getSubmitOrder() {
        return this.submitOrder;
    }

    public ListServerlessJobsRequest setSubmitTimeEnd(String submitTimeEnd) {
        this.submitTimeEnd = submitTimeEnd;
        return this;
    }
    public String getSubmitTimeEnd() {
        return this.submitTimeEnd;
    }

    public ListServerlessJobsRequest setSubmitTimeStart(String submitTimeStart) {
        this.submitTimeStart = submitTimeStart;
        return this;
    }
    public String getSubmitTimeStart() {
        return this.submitTimeStart;
    }

}
