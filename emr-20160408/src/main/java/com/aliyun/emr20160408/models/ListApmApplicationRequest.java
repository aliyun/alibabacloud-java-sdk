// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListApmApplicationRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTimeFrom")
    public Long startTimeFrom;

    @NameInMap("StartTimeTo")
    public Long startTimeTo;

    @NameInMap("EndTimeFrom")
    public Long endTimeFrom;

    @NameInMap("EndTimeTo")
    public Long endTimeTo;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("State")
    public String state;

    @NameInMap("FinalStatus")
    public String finalStatus;

    @NameInMap("User")
    public String user;

    @NameInMap("Queue")
    public String queue;

    @NameInMap("Name")
    public String name;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("DiagnoseResult")
    public String diagnoseResult;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListApmApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApmApplicationRequest self = new ListApmApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ListApmApplicationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListApmApplicationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListApmApplicationRequest setStartTimeFrom(Long startTimeFrom) {
        this.startTimeFrom = startTimeFrom;
        return this;
    }
    public Long getStartTimeFrom() {
        return this.startTimeFrom;
    }

    public ListApmApplicationRequest setStartTimeTo(Long startTimeTo) {
        this.startTimeTo = startTimeTo;
        return this;
    }
    public Long getStartTimeTo() {
        return this.startTimeTo;
    }

    public ListApmApplicationRequest setEndTimeFrom(Long endTimeFrom) {
        this.endTimeFrom = endTimeFrom;
        return this;
    }
    public Long getEndTimeFrom() {
        return this.endTimeFrom;
    }

    public ListApmApplicationRequest setEndTimeTo(Long endTimeTo) {
        this.endTimeTo = endTimeTo;
        return this;
    }
    public Long getEndTimeTo() {
        return this.endTimeTo;
    }

    public ListApmApplicationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListApmApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListApmApplicationRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListApmApplicationRequest setFinalStatus(String finalStatus) {
        this.finalStatus = finalStatus;
        return this;
    }
    public String getFinalStatus() {
        return this.finalStatus;
    }

    public ListApmApplicationRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public ListApmApplicationRequest setQueue(String queue) {
        this.queue = queue;
        return this;
    }
    public String getQueue() {
        return this.queue;
    }

    public ListApmApplicationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListApmApplicationRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListApmApplicationRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListApmApplicationRequest setDiagnoseResult(String diagnoseResult) {
        this.diagnoseResult = diagnoseResult;
        return this;
    }
    public String getDiagnoseResult() {
        return this.diagnoseResult;
    }

    public ListApmApplicationRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApmApplicationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
