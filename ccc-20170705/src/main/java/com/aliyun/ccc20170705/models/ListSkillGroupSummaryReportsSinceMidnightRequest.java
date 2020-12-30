// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSkillGroupSummaryReportsSinceMidnightRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SkillGroups")
    public String skillGroups;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListSkillGroupSummaryReportsSinceMidnightRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupSummaryReportsSinceMidnightRequest self = new ListSkillGroupSummaryReportsSinceMidnightRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupSummaryReportsSinceMidnightRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSkillGroupSummaryReportsSinceMidnightRequest setSkillGroups(String skillGroups) {
        this.skillGroups = skillGroups;
        return this;
    }
    public String getSkillGroups() {
        return this.skillGroups;
    }

    public ListSkillGroupSummaryReportsSinceMidnightRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSkillGroupSummaryReportsSinceMidnightRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
