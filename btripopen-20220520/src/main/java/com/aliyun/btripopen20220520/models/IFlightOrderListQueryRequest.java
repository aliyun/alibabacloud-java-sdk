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

    @NameInMap("end_date")
    public String endDate;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("scroll_id")
    public String scrollId;

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
