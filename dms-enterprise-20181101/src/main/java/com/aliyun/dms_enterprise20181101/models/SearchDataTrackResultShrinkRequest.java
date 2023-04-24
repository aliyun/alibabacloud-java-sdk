// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchDataTrackResultShrinkRequest extends TeaModel {
    @NameInMap("ColumnFilter")
    public String columnFilterShrink;

    @NameInMap("FilterEndTime")
    public String filterEndTime;

    @NameInMap("FilterStartTime")
    public String filterStartTime;

    @NameInMap("FilterTableList")
    public String filterTableListShrink;

    @NameInMap("FilterTypeList")
    public String filterTypeListShrink;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("Tid")
    public Long tid;

    public static SearchDataTrackResultShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchDataTrackResultShrinkRequest self = new SearchDataTrackResultShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchDataTrackResultShrinkRequest setColumnFilterShrink(String columnFilterShrink) {
        this.columnFilterShrink = columnFilterShrink;
        return this;
    }
    public String getColumnFilterShrink() {
        return this.columnFilterShrink;
    }

    public SearchDataTrackResultShrinkRequest setFilterEndTime(String filterEndTime) {
        this.filterEndTime = filterEndTime;
        return this;
    }
    public String getFilterEndTime() {
        return this.filterEndTime;
    }

    public SearchDataTrackResultShrinkRequest setFilterStartTime(String filterStartTime) {
        this.filterStartTime = filterStartTime;
        return this;
    }
    public String getFilterStartTime() {
        return this.filterStartTime;
    }

    public SearchDataTrackResultShrinkRequest setFilterTableListShrink(String filterTableListShrink) {
        this.filterTableListShrink = filterTableListShrink;
        return this;
    }
    public String getFilterTableListShrink() {
        return this.filterTableListShrink;
    }

    public SearchDataTrackResultShrinkRequest setFilterTypeListShrink(String filterTypeListShrink) {
        this.filterTypeListShrink = filterTypeListShrink;
        return this;
    }
    public String getFilterTypeListShrink() {
        return this.filterTypeListShrink;
    }

    public SearchDataTrackResultShrinkRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public SearchDataTrackResultShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
