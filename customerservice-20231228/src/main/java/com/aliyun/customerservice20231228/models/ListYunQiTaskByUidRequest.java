// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class ListYunQiTaskByUidRequest extends TeaModel {
    @NameInMap("createTimeEnd")
    public Long createTimeEnd;

    @NameInMap("createTimeStart")
    public Long createTimeStart;

    @NameInMap("freeOrderApplyCodes")
    public java.util.List<String> freeOrderApplyCodes;

    @NameInMap("freeOrderApplyIds")
    public java.util.List<Long> freeOrderApplyIds;

    @NameInMap("orderIds")
    public java.util.List<Long> orderIds;

    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("statusList")
    public java.util.List<String> statusList;

    public static ListYunQiTaskByUidRequest build(java.util.Map<String, ?> map) throws Exception {
        ListYunQiTaskByUidRequest self = new ListYunQiTaskByUidRequest();
        return TeaModel.build(map, self);
    }

    public ListYunQiTaskByUidRequest setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public ListYunQiTaskByUidRequest setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public ListYunQiTaskByUidRequest setFreeOrderApplyCodes(java.util.List<String> freeOrderApplyCodes) {
        this.freeOrderApplyCodes = freeOrderApplyCodes;
        return this;
    }
    public java.util.List<String> getFreeOrderApplyCodes() {
        return this.freeOrderApplyCodes;
    }

    public ListYunQiTaskByUidRequest setFreeOrderApplyIds(java.util.List<Long> freeOrderApplyIds) {
        this.freeOrderApplyIds = freeOrderApplyIds;
        return this;
    }
    public java.util.List<Long> getFreeOrderApplyIds() {
        return this.freeOrderApplyIds;
    }

    public ListYunQiTaskByUidRequest setOrderIds(java.util.List<Long> orderIds) {
        this.orderIds = orderIds;
        return this;
    }
    public java.util.List<Long> getOrderIds() {
        return this.orderIds;
    }

    public ListYunQiTaskByUidRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListYunQiTaskByUidRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListYunQiTaskByUidRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

}
