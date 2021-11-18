// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListJobStatusRequest extends TeaModel {
    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("ScenarioId")
    public String scenarioId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TimeAlignment")
    public String timeAlignment;

    public static ListJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobStatusRequest self = new ListJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListJobStatusRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public ListJobStatusRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListJobStatusRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListJobStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListJobStatusRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobStatusRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobStatusRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ListJobStatusRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public ListJobStatusRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListJobStatusRequest setTimeAlignment(String timeAlignment) {
        this.timeAlignment = timeAlignment;
        return this;
    }
    public String getTimeAlignment() {
        return this.timeAlignment;
    }

}
