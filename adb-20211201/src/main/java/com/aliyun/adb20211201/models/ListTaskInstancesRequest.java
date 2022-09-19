// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListTaskInstancesRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProcessInstanceId")
    public Integer processInstanceId;

    @NameInMap("ProcessInstanceName")
    public String processInstanceName;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("StateType")
    public String stateType;

    @NameInMap("TaskName")
    public String taskName;

    public static ListTaskInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskInstancesRequest self = new ListTaskInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskInstancesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ListTaskInstancesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListTaskInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTaskInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskInstancesRequest setProcessInstanceId(Integer processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public Integer getProcessInstanceId() {
        return this.processInstanceId;
    }

    public ListTaskInstancesRequest setProcessInstanceName(String processInstanceName) {
        this.processInstanceName = processInstanceName;
        return this;
    }
    public String getProcessInstanceName() {
        return this.processInstanceName;
    }

    public ListTaskInstancesRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public ListTaskInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTaskInstancesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListTaskInstancesRequest setStateType(String stateType) {
        this.stateType = stateType;
        return this;
    }
    public String getStateType() {
        return this.stateType;
    }

    public ListTaskInstancesRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
