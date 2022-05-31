// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ListDistributorRequest extends TeaModel {
    // 分销商id
    @NameInMap("DistributorId")
    public String distributorId;

    // 分销商名称
    @NameInMap("DistributorName")
    public String distributorName;

    // 入驻结束时间
    @NameInMap("EndDate")
    public String endDate;

    // 页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页数量
    @NameInMap("PageSize")
    public Integer pageSize;

    // 客户体量
    @NameInMap("Scale")
    public String scale;

    // 入驻开始时间
    @NameInMap("StartDate")
    public String startDate;

    // 审核状态
    @NameInMap("Status")
    public Integer status;

    public static ListDistributorRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDistributorRequest self = new ListDistributorRequest();
        return TeaModel.build(map, self);
    }

    public ListDistributorRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public ListDistributorRequest setDistributorName(String distributorName) {
        this.distributorName = distributorName;
        return this;
    }
    public String getDistributorName() {
        return this.distributorName;
    }

    public ListDistributorRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ListDistributorRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDistributorRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDistributorRequest setScale(String scale) {
        this.scale = scale;
        return this;
    }
    public String getScale() {
        return this.scale;
    }

    public ListDistributorRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ListDistributorRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
