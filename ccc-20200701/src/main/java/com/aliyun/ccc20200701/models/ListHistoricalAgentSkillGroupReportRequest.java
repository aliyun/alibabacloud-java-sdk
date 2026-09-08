// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListHistoricalAgentSkillGroupReportRequest extends TeaModel {
    /**
     * <p>List of agent IDs. The list size is 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;agent1@ccc-test&quot;, &quot;agent2@ccc-test&quot;]</p>
     */
    @NameInMap("AgentIdList")
    public String agentIdList;

    /**
     * <p>End time for historical data retrieval. Format is UNIX timestamp in milliseconds. Optional. Defaults to the current time. The statistical time granularity is hourly, rounded up to the nearest hour, in an open interval. For example, if the start time is 11:12:20 and the end time is 11:45:50, the aligned request parameter time range is [11:00:00, 12:00:00), meaning greater than or equal to 11:00 and less than 12:00.</p>
     * 
     * <strong>example:</strong>
     * <p>1620273600000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Media type. Defaults to Audio. Other optional parameters include Chat and Video.</p>
     * 
     * <strong>example:</strong>
     * <p>VIDEO</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>Page number. Valid values are 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size. Valid values are 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>List of skill group IDs. The list size is 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       &quot;skg1@ccc-test&quot;,
     *       &quot;skg2@ccc-test&quot;
     * ]</p>
     */
    @NameInMap("SkillGroupIdList")
    public String skillGroupIdList;

    /**
     * <p>Start timestamp. Defaults to 00:00 on the current day. The statistical time granularity is hourly, rounded down to the nearest hour, in a closed interval.</p>
     * 
     * <strong>example:</strong>
     * <p>1634140800000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListHistoricalAgentSkillGroupReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHistoricalAgentSkillGroupReportRequest self = new ListHistoricalAgentSkillGroupReportRequest();
        return TeaModel.build(map, self);
    }

    public ListHistoricalAgentSkillGroupReportRequest setAgentIdList(String agentIdList) {
        this.agentIdList = agentIdList;
        return this;
    }
    public String getAgentIdList() {
        return this.agentIdList;
    }

    public ListHistoricalAgentSkillGroupReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListHistoricalAgentSkillGroupReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListHistoricalAgentSkillGroupReportRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public ListHistoricalAgentSkillGroupReportRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHistoricalAgentSkillGroupReportRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHistoricalAgentSkillGroupReportRequest setSkillGroupIdList(String skillGroupIdList) {
        this.skillGroupIdList = skillGroupIdList;
        return this;
    }
    public String getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

    public ListHistoricalAgentSkillGroupReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
