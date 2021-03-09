// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineAgentDetailReportRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DepIds")
    public java.util.List<Integer> depIds;

    @NameInMap("GroupIds")
    public java.util.List<Integer> groupIds;

    public static GetHotlineAgentDetailReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineAgentDetailReportRequest self = new GetHotlineAgentDetailReportRequest();
        return TeaModel.build(map, self);
    }

    public GetHotlineAgentDetailReportRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetHotlineAgentDetailReportRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetHotlineAgentDetailReportRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetHotlineAgentDetailReportRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetHotlineAgentDetailReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetHotlineAgentDetailReportRequest setDepIds(java.util.List<Integer> depIds) {
        this.depIds = depIds;
        return this;
    }
    public java.util.List<Integer> getDepIds() {
        return this.depIds;
    }

    public GetHotlineAgentDetailReportRequest setGroupIds(java.util.List<Integer> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<Integer> getGroupIds() {
        return this.groupIds;
    }

}
