// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IFlightOrderListQueryRequest extends TeaModel {
    @NameInMap("apply_id_list")
    public java.util.List<String> applyIdList;

    @NameInMap("book_type_list")
    public java.util.List<Integer> bookTypeList;

    @NameInMap("booker_id")
    public java.util.List<String> bookerId;

    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd HH:mm:ss</p>
     */
    @NameInMap("end_date")
    public String endDate;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("page_size")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>CAESBgoEIgIIABgAIhkKFwMSAAAAMUw4ZGViODFlYmM3MYzM4</p>
     */
    @NameInMap("scroll_id")
    public String scrollId;

    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd HH:mm:ss</p>
     */
    @NameInMap("start_date")
    public String startDate;

    @NameInMap("third_part_apply_id_list")
    public java.util.List<String> thirdPartApplyIdList;

    public static IFlightOrderListQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        IFlightOrderListQueryRequest self = new IFlightOrderListQueryRequest();
        return TeaModel.build(map, self);
    }

    public IFlightOrderListQueryRequest setApplyIdList(java.util.List<String> applyIdList) {
        this.applyIdList = applyIdList;
        return this;
    }
    public java.util.List<String> getApplyIdList() {
        return this.applyIdList;
    }

    public IFlightOrderListQueryRequest setBookTypeList(java.util.List<Integer> bookTypeList) {
        this.bookTypeList = bookTypeList;
        return this;
    }
    public java.util.List<Integer> getBookTypeList() {
        return this.bookTypeList;
    }

    public IFlightOrderListQueryRequest setBookerId(java.util.List<String> bookerId) {
        this.bookerId = bookerId;
        return this;
    }
    public java.util.List<String> getBookerId() {
        return this.bookerId;
    }

    public IFlightOrderListQueryRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public IFlightOrderListQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public IFlightOrderListQueryRequest setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }
    public String getScrollId() {
        return this.scrollId;
    }

    public IFlightOrderListQueryRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public IFlightOrderListQueryRequest setThirdPartApplyIdList(java.util.List<String> thirdPartApplyIdList) {
        this.thirdPartApplyIdList = thirdPartApplyIdList;
        return this;
    }
    public java.util.List<String> getThirdPartApplyIdList() {
        return this.thirdPartApplyIdList;
    }

}
