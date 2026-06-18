// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineAgentDetailReportRequest extends TeaModel {
    /**
     * <p>The current page number. The value must be greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of department IDs.</p>
     */
    @NameInMap("DepIds")
    public java.util.List<Long> depIds;

    /**
     * <p>The UNIX timestamp of the end date. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1614824972</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>The list of skill group IDs.</p>
     */
    @NameInMap("GroupIds")
    public java.util.List<Long> groupIds;

    /**
     * <p>The Artificial Intelligence Cloud Call Service (AICCS) instance ID.</p>
     * <p>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries per page. The value must be greater than <strong>0</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The UNIX timestamp of the start date. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1614824872</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

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

    public GetHotlineAgentDetailReportRequest setDepIds(java.util.List<Long> depIds) {
        this.depIds = depIds;
        return this;
    }
    public java.util.List<Long> getDepIds() {
        return this.depIds;
    }

    public GetHotlineAgentDetailReportRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetHotlineAgentDetailReportRequest setGroupIds(java.util.List<Long> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<Long> getGroupIds() {
        return this.groupIds;
    }

    public GetHotlineAgentDetailReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

}
