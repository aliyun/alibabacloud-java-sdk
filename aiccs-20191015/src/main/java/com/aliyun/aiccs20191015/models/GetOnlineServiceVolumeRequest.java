// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetOnlineServiceVolumeRequest extends TeaModel {
    /**
     * <p>List of agent IDs.</p>
     */
    @NameInMap("AgentIds")
    public java.util.List<Long> agentIds;

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
    public java.util.List<Long> depIds;

    /**
     * <p>End Datetime UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1617761765000</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>Whether to query by agent grouping. Default value: <strong>false</strong>. Valid values:  </p>
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
     * <p>Whether to group by department in the query. Default Value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExistDepartmentGrouping")
    public Boolean existDepartmentGrouping;

    /**
     * <p>Indicates whether to query by skill group grouping. Default value: <strong>false</strong>. Valid values:</p>
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

    public static GetOnlineServiceVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOnlineServiceVolumeRequest self = new GetOnlineServiceVolumeRequest();
        return TeaModel.build(map, self);
    }

    public GetOnlineServiceVolumeRequest setAgentIds(java.util.List<Long> agentIds) {
        this.agentIds = agentIds;
        return this;
    }
    public java.util.List<Long> getAgentIds() {
        return this.agentIds;
    }

    public GetOnlineServiceVolumeRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetOnlineServiceVolumeRequest setDepIds(java.util.List<Long> depIds) {
        this.depIds = depIds;
        return this;
    }
    public java.util.List<Long> getDepIds() {
        return this.depIds;
    }

    public GetOnlineServiceVolumeRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetOnlineServiceVolumeRequest setExistAgentGrouping(Boolean existAgentGrouping) {
        this.existAgentGrouping = existAgentGrouping;
        return this;
    }
    public Boolean getExistAgentGrouping() {
        return this.existAgentGrouping;
    }

    public GetOnlineServiceVolumeRequest setExistDepartmentGrouping(Boolean existDepartmentGrouping) {
        this.existDepartmentGrouping = existDepartmentGrouping;
        return this;
    }
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
    }

    public GetOnlineServiceVolumeRequest setExistSkillGroupGrouping(Boolean existSkillGroupGrouping) {
        this.existSkillGroupGrouping = existSkillGroupGrouping;
        return this;
    }
    public Boolean getExistSkillGroupGrouping() {
        return this.existSkillGroupGrouping;
    }

    public GetOnlineServiceVolumeRequest setGroupIds(java.util.List<Long> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<Long> getGroupIds() {
        return this.groupIds;
    }

    public GetOnlineServiceVolumeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetOnlineServiceVolumeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetOnlineServiceVolumeRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetOnlineServiceVolumeRequest setTimeLatitudeType(String timeLatitudeType) {
        this.timeLatitudeType = timeLatitudeType;
        return this;
    }
    public String getTimeLatitudeType() {
        return this.timeLatitudeType;
    }

}
