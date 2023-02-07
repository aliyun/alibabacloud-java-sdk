// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupServiceStatusShrinkRequest extends TeaModel {
    @NameInMap("AgentIds")
    public String agentIdsShrink;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DepIds")
    public String depIdsShrink;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("ExistAgentGrouping")
    public Boolean existAgentGrouping;

    @NameInMap("ExistChannelInstanceGrouping")
    public Boolean existChannelInstanceGrouping;

    @NameInMap("ExistDepartmentGrouping")
    public Boolean existDepartmentGrouping;

    @NameInMap("ExistRobotInstanceGrouping")
    public Boolean existRobotInstanceGrouping;

    @NameInMap("ExistSkillGroupGrouping")
    public Boolean existSkillGroupGrouping;

    @NameInMap("GroupIds")
    public String groupIdsShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("TimeLatitudeType")
    public String timeLatitudeType;

    public static GetSkillGroupServiceStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupServiceStatusShrinkRequest self = new GetSkillGroupServiceStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupServiceStatusShrinkRequest setAgentIdsShrink(String agentIdsShrink) {
        this.agentIdsShrink = agentIdsShrink;
        return this;
    }
    public String getAgentIdsShrink() {
        return this.agentIdsShrink;
    }

    public GetSkillGroupServiceStatusShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetSkillGroupServiceStatusShrinkRequest setDepIdsShrink(String depIdsShrink) {
        this.depIdsShrink = depIdsShrink;
        return this;
    }
    public String getDepIdsShrink() {
        return this.depIdsShrink;
    }

    public GetSkillGroupServiceStatusShrinkRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetSkillGroupServiceStatusShrinkRequest setExistAgentGrouping(Boolean existAgentGrouping) {
        this.existAgentGrouping = existAgentGrouping;
        return this;
    }
    public Boolean getExistAgentGrouping() {
        return this.existAgentGrouping;
    }

    public GetSkillGroupServiceStatusShrinkRequest setExistChannelInstanceGrouping(Boolean existChannelInstanceGrouping) {
        this.existChannelInstanceGrouping = existChannelInstanceGrouping;
        return this;
    }
    public Boolean getExistChannelInstanceGrouping() {
        return this.existChannelInstanceGrouping;
    }

    public GetSkillGroupServiceStatusShrinkRequest setExistDepartmentGrouping(Boolean existDepartmentGrouping) {
        this.existDepartmentGrouping = existDepartmentGrouping;
        return this;
    }
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
    }

    public GetSkillGroupServiceStatusShrinkRequest setExistRobotInstanceGrouping(Boolean existRobotInstanceGrouping) {
        this.existRobotInstanceGrouping = existRobotInstanceGrouping;
        return this;
    }
    public Boolean getExistRobotInstanceGrouping() {
        return this.existRobotInstanceGrouping;
    }

    public GetSkillGroupServiceStatusShrinkRequest setExistSkillGroupGrouping(Boolean existSkillGroupGrouping) {
        this.existSkillGroupGrouping = existSkillGroupGrouping;
        return this;
    }
    public Boolean getExistSkillGroupGrouping() {
        return this.existSkillGroupGrouping;
    }

    public GetSkillGroupServiceStatusShrinkRequest setGroupIdsShrink(String groupIdsShrink) {
        this.groupIdsShrink = groupIdsShrink;
        return this;
    }
    public String getGroupIdsShrink() {
        return this.groupIdsShrink;
    }

    public GetSkillGroupServiceStatusShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSkillGroupServiceStatusShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSkillGroupServiceStatusShrinkRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetSkillGroupServiceStatusShrinkRequest setTimeLatitudeType(String timeLatitudeType) {
        this.timeLatitudeType = timeLatitudeType;
        return this;
    }
    public String getTimeLatitudeType() {
        return this.timeLatitudeType;
    }

}
