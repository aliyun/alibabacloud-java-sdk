// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSeatInformationRequest extends TeaModel {
    // AICCS实例ID，在智能联络中心控制台上可以看到
    @NameInMap("InstanceId")
    public String instanceId;

    // 开始日期时间戳（毫秒）
    @NameInMap("startDate")
    public Long startDate;

    // 结束日期时间戳（毫秒）
    @NameInMap("endDate")
    public Long endDate;

    // 每页大小（默认为10)
    @NameInMap("pageSize")
    public Integer pageSize;

    // 当前页（默认为1）
    @NameInMap("currentPage")
    public Integer currentPage;

    // 部门id列表
    @NameInMap("depIds")
    public java.util.List<Long> depIds;

    // 是否根据部门分组
    @NameInMap("existDepartmentGrouping")
    public Boolean existDepartmentGrouping;

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

    public GetSeatInformationRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetSeatInformationRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetSeatInformationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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

    public GetSeatInformationRequest setExistDepartmentGrouping(Boolean existDepartmentGrouping) {
        this.existDepartmentGrouping = existDepartmentGrouping;
        return this;
    }
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
    }

}
