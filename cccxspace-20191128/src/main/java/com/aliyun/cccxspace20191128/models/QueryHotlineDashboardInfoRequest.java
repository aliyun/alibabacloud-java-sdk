// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class QueryHotlineDashboardInfoRequest extends TeaModel {
    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ServiceId")
    public java.util.List<String> serviceId;

    @NameInMap("SkillGroups")
    public java.util.List<String> skillGroups;

    @NameInMap("SortFields")
    public java.util.List<String> sortFields;

    @NameInMap("StartDate")
    public Long startDate;

    public static QueryHotlineDashboardInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHotlineDashboardInfoRequest self = new QueryHotlineDashboardInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryHotlineDashboardInfoRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public QueryHotlineDashboardInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryHotlineDashboardInfoRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryHotlineDashboardInfoRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryHotlineDashboardInfoRequest setServiceId(java.util.List<String> serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public java.util.List<String> getServiceId() {
        return this.serviceId;
    }

    public QueryHotlineDashboardInfoRequest setSkillGroups(java.util.List<String> skillGroups) {
        this.skillGroups = skillGroups;
        return this;
    }
    public java.util.List<String> getSkillGroups() {
        return this.skillGroups;
    }

    public QueryHotlineDashboardInfoRequest setSortFields(java.util.List<String> sortFields) {
        this.sortFields = sortFields;
        return this;
    }
    public java.util.List<String> getSortFields() {
        return this.sortFields;
    }

    public QueryHotlineDashboardInfoRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
