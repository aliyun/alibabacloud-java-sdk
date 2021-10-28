// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSeatInformationShrinkRequest extends TeaModel {
    // AICCS实例ID，在智能联络中心控制台上可以看到
    @NameInMap("InstanceId")
    public String instanceId;

    // 当前页（默认为1）
    @NameInMap("currentPage")
    public Integer currentPage;

    // 部门id列表
    @NameInMap("depIds")
    public String depIdsShrink;

    // 结束日期时间戳（毫秒）
    @NameInMap("endDate")
    public Long endDate;

    // 是否根据部门分组
    @NameInMap("existDepartmentGrouping")
    public Boolean existDepartmentGrouping;

    // 每页大小（默认为10)
    @NameInMap("pageSize")
    public Integer pageSize;

    // 开始日期时间戳（毫秒）
    @NameInMap("startDate")
    public Long startDate;

    public static GetSeatInformationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSeatInformationShrinkRequest self = new GetSeatInformationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetSeatInformationShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSeatInformationShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetSeatInformationShrinkRequest setDepIdsShrink(String depIdsShrink) {
        this.depIdsShrink = depIdsShrink;
        return this;
    }
    public String getDepIdsShrink() {
        return this.depIdsShrink;
    }

    public GetSeatInformationShrinkRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetSeatInformationShrinkRequest setExistDepartmentGrouping(Boolean existDepartmentGrouping) {
        this.existDepartmentGrouping = existDepartmentGrouping;
        return this;
    }
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
    }

    public GetSeatInformationShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSeatInformationShrinkRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
