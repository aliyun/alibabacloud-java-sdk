// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderListQueryRequest extends TeaModel {
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

    public static HotelOrderListQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderListQueryRequest self = new HotelOrderListQueryRequest();
        return TeaModel.build(map, self);
    }

    public HotelOrderListQueryRequest setAllApply(Boolean allApply) {
        this.allApply = allApply;
        return this;
    }
    public Boolean getAllApply() {
        return this.allApply;
    }

    public HotelOrderListQueryRequest setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

    public HotelOrderListQueryRequest setDepartId(String departId) {
        this.departId = departId;
        return this;
    }
    public String getDepartId() {
        return this.departId;
    }

    public HotelOrderListQueryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public HotelOrderListQueryRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public HotelOrderListQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public HotelOrderListQueryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public HotelOrderListQueryRequest setThirdpartApplyId(String thirdpartApplyId) {
        this.thirdpartApplyId = thirdpartApplyId;
        return this;
    }
    public String getThirdpartApplyId() {
        return this.thirdpartApplyId;
    }

    public HotelOrderListQueryRequest setUpdateEndTime(String updateEndTime) {
        this.updateEndTime = updateEndTime;
        return this;
    }
    public String getUpdateEndTime() {
        return this.updateEndTime;
    }

    public HotelOrderListQueryRequest setUpdateStartTime(String updateStartTime) {
        this.updateStartTime = updateStartTime;
        return this;
    }
    public String getUpdateStartTime() {
        return this.updateStartTime;
    }

    public HotelOrderListQueryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
