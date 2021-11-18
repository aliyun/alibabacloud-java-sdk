// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GenerateAgentStatisticReportRequest extends TeaModel {
    @NameInMap("AgentId")
    public String agentId;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartDate")
    public String startDate;

    public static GenerateAgentStatisticReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAgentStatisticReportRequest self = new GenerateAgentStatisticReportRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAgentStatisticReportRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public GenerateAgentStatisticReportRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GenerateAgentStatisticReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GenerateAgentStatisticReportRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GenerateAgentStatisticReportRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GenerateAgentStatisticReportRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
