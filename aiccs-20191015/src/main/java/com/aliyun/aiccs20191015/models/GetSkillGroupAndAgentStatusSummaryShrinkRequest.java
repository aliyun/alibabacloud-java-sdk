// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupAndAgentStatusSummaryShrinkRequest extends TeaModel {
    /**
     * <p>Current page. The value must be greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>List of department IDs.</p>
     */
    @NameInMap("DepIds")
    public String depIdsShrink;

    /**
     * <p>End Datetime Variable as a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1617761765000</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>Specifies whether to query by department grouping. Default value: <strong>false</strong>. Valid values:  </p>
     * <ul>
     * <li><strong>true</strong>: Yes.  </li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExistDepartmentGrouping")
    public Boolean existDepartmentGrouping;

    /**
     * <p>Specifies whether to query by skill group grouping. Default value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExistSkillGroupGrouping")
    public Boolean existSkillGroupGrouping;

    /**
     * <p>List of skill group IDs.</p>
     */
    @NameInMap("GroupIds")
    public String groupIdsShrink;

    /**
     * <p>AICCS instance ID.<br>You can obtain it in the <strong>Instance Management</strong> section of the left-side navigation pane in the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Page size. The value must be greater than <strong>0</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Start date UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1615083365000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    public static GetSkillGroupAndAgentStatusSummaryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupAndAgentStatusSummaryShrinkRequest self = new GetSkillGroupAndAgentStatusSummaryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupAndAgentStatusSummaryShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetSkillGroupAndAgentStatusSummaryShrinkRequest setDepIdsShrink(String depIdsShrink) {
        this.depIdsShrink = depIdsShrink;
        return this;
    }
    public String getDepIdsShrink() {
        return this.depIdsShrink;
    }

    public GetSkillGroupAndAgentStatusSummaryShrinkRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetSkillGroupAndAgentStatusSummaryShrinkRequest setExistDepartmentGrouping(Boolean existDepartmentGrouping) {
        this.existDepartmentGrouping = existDepartmentGrouping;
        return this;
    }
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
    }

    public GetSkillGroupAndAgentStatusSummaryShrinkRequest setExistSkillGroupGrouping(Boolean existSkillGroupGrouping) {
        this.existSkillGroupGrouping = existSkillGroupGrouping;
        return this;
    }
    public Boolean getExistSkillGroupGrouping() {
        return this.existSkillGroupGrouping;
    }

    public GetSkillGroupAndAgentStatusSummaryShrinkRequest setGroupIdsShrink(String groupIdsShrink) {
        this.groupIdsShrink = groupIdsShrink;
        return this;
    }
    public String getGroupIdsShrink() {
        return this.groupIdsShrink;
    }

    public GetSkillGroupAndAgentStatusSummaryShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSkillGroupAndAgentStatusSummaryShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSkillGroupAndAgentStatusSummaryShrinkRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
