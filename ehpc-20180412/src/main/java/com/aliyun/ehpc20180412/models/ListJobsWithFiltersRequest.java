// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListJobsWithFiltersRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    @NameInMap("ExecuteOrder")
    public String executeOrder;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("JobStatus")
    public String jobStatus;

    @NameInMap("Nodes")
    public java.util.List<String> nodes;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PendOrder")
    public String pendOrder;

    @NameInMap("Queues")
    public java.util.List<String> queues;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SubmitOrder")
    public String submitOrder;

    @NameInMap("Users")
    public java.util.List<String> users;

    public static ListJobsWithFiltersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobsWithFiltersRequest self = new ListJobsWithFiltersRequest();
        return TeaModel.build(map, self);
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
