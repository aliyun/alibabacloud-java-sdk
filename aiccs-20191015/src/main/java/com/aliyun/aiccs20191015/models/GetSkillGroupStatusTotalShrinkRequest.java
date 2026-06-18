// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupStatusTotalShrinkRequest extends TeaModel {
    /**
     * <p>List of agent IDs.</p>
     */
    @NameInMap("AgentIds")
    public String agentIdsShrink;

    /**
     * <p>Current page number. The value must be greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
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
     * <p>End UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1617761765000</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>Whether to query by agent group. Default value: <strong>false</strong>. Valid values:  </p>
     * <ul>
     * <li><strong>true</strong>: Yes.  </li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExistAgentGrouping")
    public Boolean existAgentGrouping;

    /**
     * <p>Whether to query by department group. Default value: <strong>false</strong>. Valid values:  </p>
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
     * <p>AICCS instance ID.</p>
     * <p>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
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
     * <p>Start Datetime Variable UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1615083365000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    /**
     * <p>Time latitude type. Valid values:</p>
     * <ul>
     * <li><strong>minute</strong>: Minute.</li>
     * <li><strong>hour</strong>: Hour.</li>
     * <li><strong>day</strong>: Day.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>minute</p>
     */
    @NameInMap("TimeLatitudeType")
    public String timeLatitudeType;

    public static GetSkillGroupStatusTotalShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupStatusTotalShrinkRequest self = new GetSkillGroupStatusTotalShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupStatusTotalShrinkRequest setAgentIdsShrink(String agentIdsShrink) {
        this.agentIdsShrink = agentIdsShrink;
        return this;
    }
    public String getAgentIdsShrink() {
        return this.agentIdsShrink;
    }

    public GetSkillGroupStatusTotalShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetSkillGroupStatusTotalShrinkRequest setDepIdsShrink(String depIdsShrink) {
        this.depIdsShrink = depIdsShrink;
        return this;
    }
    public String getDepIdsShrink() {
        return this.depIdsShrink;
    }

    public GetSkillGroupStatusTotalShrinkRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetSkillGroupStatusTotalShrinkRequest setExistAgentGrouping(Boolean existAgentGrouping) {
        this.existAgentGrouping = existAgentGrouping;
        return this;
    }
    public Boolean getExistAgentGrouping() {
        return this.existAgentGrouping;
    }

    public GetSkillGroupStatusTotalShrinkRequest setExistDepartmentGrouping(Boolean existDepartmentGrouping) {
        this.existDepartmentGrouping = existDepartmentGrouping;
        return this;
    }
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
    }

    public GetSkillGroupStatusTotalShrinkRequest setExistSkillGroupGrouping(Boolean existSkillGroupGrouping) {
        this.existSkillGroupGrouping = existSkillGroupGrouping;
        return this;
    }
    public Boolean getExistSkillGroupGrouping() {
        return this.existSkillGroupGrouping;
    }

    public GetSkillGroupStatusTotalShrinkRequest setGroupIdsShrink(String groupIdsShrink) {
        this.groupIdsShrink = groupIdsShrink;
        return this;
    }
    public String getGroupIdsShrink() {
        return this.groupIdsShrink;
    }

    public GetSkillGroupStatusTotalShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSkillGroupStatusTotalShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSkillGroupStatusTotalShrinkRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetSkillGroupStatusTotalShrinkRequest setTimeLatitudeType(String timeLatitudeType) {
        this.timeLatitudeType = timeLatitudeType;
        return this;
    }
    public String getTimeLatitudeType() {
        return this.timeLatitudeType;
    }

}
