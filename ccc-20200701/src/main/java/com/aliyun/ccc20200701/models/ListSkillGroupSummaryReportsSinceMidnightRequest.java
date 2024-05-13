// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSkillGroupSummaryReportsSinceMidnightRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SkillGroups")
    public String skillGroups;

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

    public ListSkillGroupSummaryReportsSinceMidnightRequest setSkillGroups(String skillGroups) {
        this.skillGroups = skillGroups;
        return this;
    }
    public String getSkillGroups() {
        return this.skillGroups;
    }

}
