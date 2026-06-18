// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupAgentStatusDetailsShrinkRequest extends TeaModel {
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
     * <p>End Datetime Variable as a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1614824972</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>Indicates whether to query by department grouping. Default value: <strong>false</strong>. Valid values:  </p>
     * <ul>
     * <li><strong>true</strong>: Yes.  </li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
     * <p>true</p>
     */
    @NameInMap("ExistSkillGroupGrouping")
    public Boolean existSkillGroupGrouping;

    /**
     * <p>A list of skill group IDs.</p>
     */
    @NameInMap("GroupIds")
    public String groupIdsShrink;

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
     * <p>The page size. The value must be greater than <strong>0</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start date as a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1614824872</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    public static GetSkillGroupAgentStatusDetailsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupAgentStatusDetailsShrinkRequest self = new GetSkillGroupAgentStatusDetailsShrinkRequest();
        return TeaModel.build(map, self);
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

    public GetSkillGroupAgentStatusDetailsShrinkRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
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

    public GetSkillGroupAgentStatusDetailsShrinkRequest setGroupIdsShrink(String groupIdsShrink) {
        this.groupIdsShrink = groupIdsShrink;
        return this;
    }
    public String getGroupIdsShrink() {
        return this.groupIdsShrink;
    }

    public GetSkillGroupAgentStatusDetailsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSkillGroupAgentStatusDetailsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSkillGroupAgentStatusDetailsShrinkRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
