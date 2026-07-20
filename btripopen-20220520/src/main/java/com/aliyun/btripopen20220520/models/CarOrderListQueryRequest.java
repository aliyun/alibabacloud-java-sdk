// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarOrderListQueryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("all_apply")
    public Boolean allApply;

    /**
     * <strong>example:</strong>
     * <p>117429516</p>
     */
    @NameInMap("apply_id")
    public Long applyId;

    /**
     * <strong>example:</strong>
     * <p>departId</p>
     */
    @NameInMap("depart_id")
    public String departId;

    /**
     * <strong>example:</strong>
     * <p>2022-07-01 00:00:00</p>
     */
    @NameInMap("end_time")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("page_size")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>2022-07-01 00:00:00</p>
     */
    @NameInMap("start_time")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>cs2NH_n1QTC3R6hB9m-BAQ08221658314273</p>
     */
    @NameInMap("thirdpart_apply_id")
    public String thirdpartApplyId;

    /**
     * <strong>example:</strong>
     * <p>2022-07-01 00:00:00</p>
     */
    @NameInMap("update_end_time")
    public String updateEndTime;

    /**
     * <strong>example:</strong>
     * <p>2022-07-01 00:00:00</p>
     */
    @NameInMap("update_start_time")
    public String updateStartTime;

    /**
     * <strong>example:</strong>
     * <p>userId</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static CarOrderListQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        CarOrderListQueryRequest self = new CarOrderListQueryRequest();
        return TeaModel.build(map, self);
    }

    public CarOrderListQueryRequest setAllApply(Boolean allApply) {
        this.allApply = allApply;
        return this;
    }
    public Boolean getAllApply() {
        return this.allApply;
    }

    public CarOrderListQueryRequest setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

    public CarOrderListQueryRequest setDepartId(String departId) {
        this.departId = departId;
        return this;
    }
    public String getDepartId() {
        return this.departId;
    }

    public CarOrderListQueryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CarOrderListQueryRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public CarOrderListQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CarOrderListQueryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CarOrderListQueryRequest setThirdpartApplyId(String thirdpartApplyId) {
        this.thirdpartApplyId = thirdpartApplyId;
        return this;
    }
    public String getThirdpartApplyId() {
        return this.thirdpartApplyId;
    }

    public CarOrderListQueryRequest setUpdateEndTime(String updateEndTime) {
        this.updateEndTime = updateEndTime;
        return this;
    }
    public String getUpdateEndTime() {
        return this.updateEndTime;
    }

    public CarOrderListQueryRequest setUpdateStartTime(String updateStartTime) {
        this.updateStartTime = updateStartTime;
        return this;
    }
    public String getUpdateStartTime() {
        return this.updateStartTime;
    }

    public CarOrderListQueryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
