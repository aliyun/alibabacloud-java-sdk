// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListRecordingsRequest extends TeaModel {
    @NameInMap("AgentId")
    public String agentId;

    @NameInMap("Criteria")
    public String criteria;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("StopTime")
    public Long stopTime;

    public static ListRecordingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecordingsRequest self = new ListRecordingsRequest();
        return TeaModel.build(map, self);
    }

    public ListRecordingsRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ListRecordingsRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public ListRecordingsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListRecordingsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRecordingsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRecordingsRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ListRecordingsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListRecordingsRequest setStopTime(Long stopTime) {
        this.stopTime = stopTime;
        return this;
    }
    public Long getStopTime() {
        return this.stopTime;
    }

}
