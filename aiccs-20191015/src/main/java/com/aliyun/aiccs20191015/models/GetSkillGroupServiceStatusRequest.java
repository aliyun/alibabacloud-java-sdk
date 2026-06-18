// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupServiceStatusRequest extends TeaModel {
    /**
     * <p>List of agent IDs.</p>
     */
    @NameInMap("AgentIds")
    public java.util.List<Long> agentIds;

    /**
     * <p>The current page number. The value must be greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
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
    public java.util.List<Long> depIds;

    /**
     * <p>End date UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1617761765000</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>Specifies whether to query by skill group. Default value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExistAgentGrouping")
    public Boolean existAgentGrouping;

    /**
     * <p>Specifies whether to query by Channel instance group. Default value: <strong>false</strong>. Valid values:  </p>
     * <ul>
     * <li><strong>true</strong>: Yes.  </li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExistChannelInstanceGrouping")
    public Boolean existChannelInstanceGrouping;

    /**
     * <p>Specifies whether to query by department group. Default value: <strong>false</strong>. Valid values:  </p>
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
     * <p>Specifies whether to query by robot instance group. Default value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExistRobotInstanceGrouping")
    public Boolean existRobotInstanceGrouping;

    /**
     * <p>Specifies whether to query by skill group. Default value: <strong>false</strong>. Valid values:</p>
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
    public java.util.List<Long> groupIds;

    /**
     * <p>AICCS instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
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
     * <p>10</p>
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

    /**
     * <p>Time latitude type. Valid values:  </p>
     * <ul>
     * <li><strong>minute</strong>: Minute.  </li>
     * <li><strong>hour</strong>: Hour.  </li>
     * <li><strong>day</strong>: Day.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>minute</p>
     */
    @NameInMap("TimeLatitudeType")
    public String timeLatitudeType;

    public static GetSkillGroupServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupServiceStatusRequest self = new GetSkillGroupServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupServiceStatusRequest setAgentIds(java.util.List<Long> agentIds) {
        this.agentIds = agentIds;
        return this;
    }
    public java.util.List<Long> getAgentIds() {
        return this.agentIds;
    }

    public GetSkillGroupServiceStatusRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetSkillGroupServiceStatusRequest setDepIds(java.util.List<Long> depIds) {
        this.depIds = depIds;
        return this;
    }
    public java.util.List<Long> getDepIds() {
        return this.depIds;
    }

    public GetSkillGroupServiceStatusRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetSkillGroupServiceStatusRequest setExistAgentGrouping(Boolean existAgentGrouping) {
        this.existAgentGrouping = existAgentGrouping;
        return this;
    }
    public Boolean getExistAgentGrouping() {
        return this.existAgentGrouping;
    }

    public GetSkillGroupServiceStatusRequest setExistChannelInstanceGrouping(Boolean existChannelInstanceGrouping) {
        this.existChannelInstanceGrouping = existChannelInstanceGrouping;
        return this;
    }
    public Boolean getExistChannelInstanceGrouping() {
        return this.existChannelInstanceGrouping;
    }

    public GetSkillGroupServiceStatusRequest setExistDepartmentGrouping(Boolean existDepartmentGrouping) {
        this.existDepartmentGrouping = existDepartmentGrouping;
        return this;
    }
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
    }

    public GetSkillGroupServiceStatusRequest setExistRobotInstanceGrouping(Boolean existRobotInstanceGrouping) {
        this.existRobotInstanceGrouping = existRobotInstanceGrouping;
        return this;
    }
    public Boolean getExistRobotInstanceGrouping() {
        return this.existRobotInstanceGrouping;
    }

    public GetSkillGroupServiceStatusRequest setExistSkillGroupGrouping(Boolean existSkillGroupGrouping) {
        this.existSkillGroupGrouping = existSkillGroupGrouping;
        return this;
    }
    public Boolean getExistSkillGroupGrouping() {
        return this.existSkillGroupGrouping;
    }

    public GetSkillGroupServiceStatusRequest setGroupIds(java.util.List<Long> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<Long> getGroupIds() {
        return this.groupIds;
    }

    public GetSkillGroupServiceStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSkillGroupServiceStatusRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSkillGroupServiceStatusRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetSkillGroupServiceStatusRequest setTimeLatitudeType(String timeLatitudeType) {
        this.timeLatitudeType = timeLatitudeType;
        return this;
    }
    public String getTimeLatitudeType() {
        return this.timeLatitudeType;
    }

}
