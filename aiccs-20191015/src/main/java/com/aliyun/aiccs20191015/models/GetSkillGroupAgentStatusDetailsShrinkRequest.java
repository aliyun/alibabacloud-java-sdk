// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupAgentStatusDetailsShrinkRequest extends TeaModel {
    // AICCS实例ID，在智能联络中心控制台上可以看到
    @NameInMap("InstanceId")
    public String instanceId;

    // 开始日期时间戳（毫秒）
    @NameInMap("StartDate")
    public Long startDate;

    // 结束日期时间戳（毫秒）
    @NameInMap("EndDate")
    public Long endDate;

    // 每页大小（默认为10)
    @NameInMap("PageSize")
    public Integer pageSize;

    // 当前页（默认为1）
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // 部门id列表
    @NameInMap("DepIds")
    public String depIdsShrink;

    // 技能组id列表
    @NameInMap("GroupIds")
    public String groupIdsShrink;

    // 是否根据部门分组
    @NameInMap("ExistDepartmentGrouping")
    public Boolean existDepartmentGrouping;

    // 是否根据技能组分组
    @NameInMap("ExistSkillGroupGrouping")
    public Boolean existSkillGroupGrouping;

    public static GetSkillGroupAgentStatusDetailsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupAgentStatusDetailsShrinkRequest self = new GetSkillGroupAgentStatusDetailsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupAgentStatusDetailsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSkillGroupAgentStatusDetailsShrinkRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetSkillGroupAgentStatusDetailsShrinkRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetSkillGroupAgentStatusDetailsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSkillGroupAgentStatusDetailsShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetSkillGroupAgentStatusDetailsShrinkRequest setDepIdsShrink(String depIdsShrink) {
        this.depIdsShrink = depIdsShrink;
        return this;
    }
    public String getDepIdsShrink() {
        return this.depIdsShrink;
    }

    public GetSkillGroupAgentStatusDetailsShrinkRequest setGroupIdsShrink(String groupIdsShrink) {
        this.groupIdsShrink = groupIdsShrink;
        return this;
    }
    public String getGroupIdsShrink() {
        return this.groupIdsShrink;
    }

    public GetSkillGroupAgentStatusDetailsShrinkRequest setExistDepartmentGrouping(Boolean existDepartmentGrouping) {
        this.existDepartmentGrouping = existDepartmentGrouping;
        return this;
    }
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
    }

    public GetSkillGroupAgentStatusDetailsShrinkRequest setExistSkillGroupGrouping(Boolean existSkillGroupGrouping) {
        this.existSkillGroupGrouping = existSkillGroupGrouping;
        return this;
    }
    public Boolean getExistSkillGroupGrouping() {
        return this.existSkillGroupGrouping;
    }

}
