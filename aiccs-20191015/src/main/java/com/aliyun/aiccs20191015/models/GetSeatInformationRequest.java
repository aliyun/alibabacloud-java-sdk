// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSeatInformationRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("depIds")
    public java.util.List<Long> depIds;

    @NameInMap("endDate")
    public Long endDate;

    @NameInMap("existDepartmentGrouping")
    public Boolean existDepartmentGrouping;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("startDate")
    public Long startDate;

    public static GetSeatInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSeatInformationRequest self = new GetSeatInformationRequest();
        return TeaModel.build(map, self);
    }

    public GetSeatInformationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSeatInformationRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetSeatInformationRequest setDepIds(java.util.List<Long> depIds) {
        this.depIds = depIds;
        return this;
    }
    public java.util.List<Long> getDepIds() {
        return this.depIds;
    }

    public GetSeatInformationRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetSeatInformationRequest setExistDepartmentGrouping(Boolean existDepartmentGrouping) {
        this.existDepartmentGrouping = existDepartmentGrouping;
        return this;
    }
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
    }

    public GetSeatInformationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSeatInformationRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
