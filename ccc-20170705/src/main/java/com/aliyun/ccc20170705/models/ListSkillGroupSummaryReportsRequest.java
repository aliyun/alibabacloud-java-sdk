// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSkillGroupSummaryReportsRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SkillGroupIds")
    public String skillGroupIds;

    @NameInMap("StartTime")
    public String startTime;

    public static ListSkillGroupSummaryReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupSummaryReportsRequest self = new ListSkillGroupSummaryReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupSummaryReportsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListSkillGroupSummaryReportsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSkillGroupSummaryReportsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSkillGroupSummaryReportsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSkillGroupSummaryReportsRequest setSkillGroupIds(String skillGroupIds) {
        this.skillGroupIds = skillGroupIds;
        return this;
    }
    public String getSkillGroupIds() {
        return this.skillGroupIds;
    }

    public ListSkillGroupSummaryReportsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
