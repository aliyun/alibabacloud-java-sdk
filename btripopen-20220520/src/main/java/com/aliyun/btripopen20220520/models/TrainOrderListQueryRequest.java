// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderListQueryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("all_apply")
    public Boolean allApply;

    /**
     * <strong>example:</strong>
     * <p>11657</p>
     */
    @NameInMap("apply_id")
    public Long applyId;

    @NameInMap("depart_id")
    public String departId;

    /**
     * <strong>example:</strong>
     * <p>2022-05-15 22:27:00</p>
     */
    @NameInMap("end_time")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("page_size")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>2022-05-15 22:27:00</p>
     */
    @NameInMap("start_time")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>CS-EDES9898</p>
     */
    @NameInMap("thirdpart_apply_id")
    public String thirdpartApplyId;

    /**
     * <strong>example:</strong>
     * <p>2022-05-15 22:27:00</p>
     */
    @NameInMap("update_end_time")
    public String updateEndTime;

    /**
     * <strong>example:</strong>
     * <p>2022-05-15 22:27:00</p>
     */
    @NameInMap("update_start_time")
    public String updateStartTime;

    @NameInMap("user_id")
    public String userId;

    public static TrainOrderListQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderListQueryRequest self = new TrainOrderListQueryRequest();
        return TeaModel.build(map, self);
    }

    public TrainOrderListQueryRequest setAllApply(Boolean allApply) {
        this.allApply = allApply;
        return this;
    }
    public Boolean getAllApply() {
        return this.allApply;
    }

    public TrainOrderListQueryRequest setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

    public TrainOrderListQueryRequest setDepartId(String departId) {
        this.departId = departId;
        return this;
    }
    public String getDepartId() {
        return this.departId;
    }

    public TrainOrderListQueryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public TrainOrderListQueryRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public TrainOrderListQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public TrainOrderListQueryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public TrainOrderListQueryRequest setThirdpartApplyId(String thirdpartApplyId) {
        this.thirdpartApplyId = thirdpartApplyId;
        return this;
    }
    public String getThirdpartApplyId() {
        return this.thirdpartApplyId;
    }

    public TrainOrderListQueryRequest setUpdateEndTime(String updateEndTime) {
        this.updateEndTime = updateEndTime;
        return this;
    }
    public String getUpdateEndTime() {
        return this.updateEndTime;
    }

    public TrainOrderListQueryRequest setUpdateStartTime(String updateStartTime) {
        this.updateStartTime = updateStartTime;
        return this;
    }
    public String getUpdateStartTime() {
        return this.updateStartTime;
    }

    public TrainOrderListQueryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
