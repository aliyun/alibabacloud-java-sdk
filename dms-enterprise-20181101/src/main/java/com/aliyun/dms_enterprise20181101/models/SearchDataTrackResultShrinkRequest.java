// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchDataTrackResultShrinkRequest extends TeaModel {
    /**
     * <p>The condition to filter columns.</p>
     */
    @NameInMap("ColumnFilter")
    public String columnFilterShrink;

    /**
     * <p>The end time of the time range in which you want to track data operations. The time must be in the yyyy-MM-dd HH:mm:ss format.</p>
     */
    @NameInMap("FilterEndTime")
    public String filterEndTime;

    /**
     * <p>The start time of the time range in which you want to track data operations. The time must be in the yyyy-MM-dd HH:mm:ss format.</p>
     */
    @NameInMap("FilterStartTime")
    public String filterStartTime;

    /**
     * <p>The names of the tables for which you want to track data operations.</p>
     */
    @NameInMap("FilterTableList")
    public String filterTableListShrink;

    /**
     * <p>The types of data operations that you want to track.</p>
     */
    @NameInMap("FilterTypeList")
    public String filterTypeListShrink;

    /**
     * <p>The ID of the ticket. You can call the [ListOrders](~~144643~~) operation to query the ticket ID.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to query the tenant ID.</p>
     */
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
