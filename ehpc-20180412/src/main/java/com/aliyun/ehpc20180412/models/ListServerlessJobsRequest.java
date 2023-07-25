// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListServerlessJobsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("JobIds")
    public java.util.List<String> jobIds;

    @NameInMap("JobNames")
    public java.util.List<String> jobNames;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartOrder")
    public String startOrder;

    @NameInMap("State")
    public String state;

    @NameInMap("SubmitOrder")
    public String submitOrder;

    @NameInMap("SubmitTimeEnd")
    public String submitTimeEnd;

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
