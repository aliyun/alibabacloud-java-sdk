// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListHistoricalAgentSkillGroupReportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[&quot;agent1@ccc-test&quot;, &quot;agent2@ccc-test&quot;]</p>
     */
    @NameInMap("AgentIdList")
    public String agentIdList;

    /**
     * <strong>example:</strong>
     * <p>1620273600000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>[
     *       &quot;skg1@ccc-test&quot;,
     *       &quot;skg2@ccc-test&quot;
     * ]</p>
     */
    @NameInMap("SkillGroupIdList")
    public String skillGroupIdList;

    /**
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
