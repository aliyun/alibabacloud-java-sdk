// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IFlightOrderListQueryShrinkRequest extends TeaModel {
    @NameInMap("apply_id_list")
    public String applyIdListShrink;

    @NameInMap("book_type_list")
    public String bookTypeListShrink;

    @NameInMap("booker_id")
    public String bookerIdShrink;

    @NameInMap("end_date")
    public String endDate;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("scroll_id")
    public String scrollId;

    @NameInMap("start_date")
    public String startDate;

    @NameInMap("third_part_apply_id_list")
    public String thirdPartApplyIdListShrink;

    public static IFlightOrderListQueryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IFlightOrderListQueryShrinkRequest self = new IFlightOrderListQueryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IFlightOrderListQueryShrinkRequest setApplyIdListShrink(String applyIdListShrink) {
        this.applyIdListShrink = applyIdListShrink;
        return this;
    }
    public String getApplyIdListShrink() {
        return this.applyIdListShrink;
    }

    public IFlightOrderListQueryShrinkRequest setBookTypeListShrink(String bookTypeListShrink) {
        this.bookTypeListShrink = bookTypeListShrink;
        return this;
    }
    public String getBookTypeListShrink() {
        return this.bookTypeListShrink;
    }

    public IFlightOrderListQueryShrinkRequest setBookerIdShrink(String bookerIdShrink) {
        this.bookerIdShrink = bookerIdShrink;
        return this;
    }
    public String getBookerIdShrink() {
        return this.bookerIdShrink;
    }

    public IFlightOrderListQueryShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public IFlightOrderListQueryShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public IFlightOrderListQueryShrinkRequest setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }
    public String getScrollId() {
        return this.scrollId;
    }

    public IFlightOrderListQueryShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public IFlightOrderListQueryShrinkRequest setThirdPartApplyIdListShrink(String thirdPartApplyIdListShrink) {
        this.thirdPartApplyIdListShrink = thirdPartApplyIdListShrink;
        return this;
    }
    public String getThirdPartApplyIdListShrink() {
        return this.thirdPartApplyIdListShrink;
    }

}
