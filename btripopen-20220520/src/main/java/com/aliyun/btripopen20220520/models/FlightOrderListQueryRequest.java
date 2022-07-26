// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOrderListQueryRequest extends TeaModel {
    @NameInMap("all_apply")
    public Boolean allApply;

    @NameInMap("apply_id")
    public Long applyId;

    @NameInMap("depart_id")
    public String departId;

    @NameInMap("end_time")
    public String endTime;

    @NameInMap("page")
    public Integer page;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("start_time")
    public String startTime;

    @NameInMap("thirdpart_apply_id")
    public String thirdpartApplyId;

    @NameInMap("update_end_time")
    public String updateEndTime;

    @NameInMap("update_start_time")
    public String updateStartTime;

    @NameInMap("user_id")
    public String userId;

    public static FlightOrderListQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightOrderListQueryRequest self = new FlightOrderListQueryRequest();
        return TeaModel.build(map, self);
    }

    public FlightOrderListQueryRequest setAllApply(Boolean allApply) {
        this.allApply = allApply;
        return this;
    }
    public Boolean getAllApply() {
        return this.allApply;
    }

    public FlightOrderListQueryRequest setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

    public FlightOrderListQueryRequest setDepartId(String departId) {
        this.departId = departId;
        return this;
    }
    public String getDepartId() {
        return this.departId;
    }

    public FlightOrderListQueryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public FlightOrderListQueryRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public FlightOrderListQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public FlightOrderListQueryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public FlightOrderListQueryRequest setThirdpartApplyId(String thirdpartApplyId) {
        this.thirdpartApplyId = thirdpartApplyId;
        return this;
    }
    public String getThirdpartApplyId() {
        return this.thirdpartApplyId;
    }

    public FlightOrderListQueryRequest setUpdateEndTime(String updateEndTime) {
        this.updateEndTime = updateEndTime;
        return this;
    }
    public String getUpdateEndTime() {
        return this.updateEndTime;
    }

    public FlightOrderListQueryRequest setUpdateStartTime(String updateStartTime) {
        this.updateStartTime = updateStartTime;
        return this;
    }
    public String getUpdateStartTime() {
        return this.updateStartTime;
    }

    public FlightOrderListQueryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
