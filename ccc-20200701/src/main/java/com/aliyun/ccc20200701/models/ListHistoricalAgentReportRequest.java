// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListHistoricalAgentReportRequest extends TeaModel {
    @NameInMap("AgentIdList")
    public String agentIdList;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MediaType")
    public String mediaType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("StopTime")
    public Long stopTime;

    public static ListHistoricalAgentReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHistoricalAgentReportRequest self = new ListHistoricalAgentReportRequest();
        return TeaModel.build(map, self);
    }

    public ListHistoricalAgentReportRequest setAgentIdList(String agentIdList) {
        this.agentIdList = agentIdList;
        return this;
    }
    public String getAgentIdList() {
        return this.agentIdList;
    }

    public ListHistoricalAgentReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListHistoricalAgentReportRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public ListHistoricalAgentReportRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHistoricalAgentReportRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHistoricalAgentReportRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public ListHistoricalAgentReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListHistoricalAgentReportRequest setStopTime(Long stopTime) {
        this.stopTime = stopTime;
        return this;
    }
    public Long getStopTime() {
        return this.stopTime;
    }

}
