// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAgentSummaryReportsSinceMidnightRequest extends TeaModel {
    /**
     * <p>Filter by a list of agent IDs, with up to 100 IDs.</p>
     * <blockquote>
     * <p>If the agent ID list is not empty, the system directly queries based on the provided agent ID list. In this case, the pageSize and pageNumber parameters are invalid, and the data is returned directly. For example, if the request parameter is pageNumber = 3, the response parameter will also be pageNumber = 3.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;agent1@ccc-test&quot;, &quot;agent2@ccc-test&quot;]</p>
     */
    @NameInMap("AgentIds")
    public String agentIds;

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
     * <p>Page number, ranging from 1 to 100. Optional. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, ranging from 1 to 100. Optional. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Filter by skill group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>skillgroup@ccc-test</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    public static ListAgentSummaryReportsSinceMidnightRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSummaryReportsSinceMidnightRequest self = new ListAgentSummaryReportsSinceMidnightRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentSummaryReportsSinceMidnightRequest setAgentIds(String agentIds) {
        this.agentIds = agentIds;
        return this;
    }
    public String getAgentIds() {
        return this.agentIds;
    }

    public ListAgentSummaryReportsSinceMidnightRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAgentSummaryReportsSinceMidnightRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAgentSummaryReportsSinceMidnightRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentSummaryReportsSinceMidnightRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

}
