// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DownloadDataTrackResultShrinkRequest extends TeaModel {
    @NameInMap("ColumnFilter")
    public String columnFilterShrink;

    @NameInMap("EventIdList")
    public String eventIdListShrink;

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

    @NameInMap("RollbackSQLType")
    public String rollbackSQLType;

    @NameInMap("Tid")
    public Long tid;

    public static DownloadDataTrackResultShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadDataTrackResultShrinkRequest self = new DownloadDataTrackResultShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DownloadDataTrackResultShrinkRequest setColumnFilterShrink(String columnFilterShrink) {
        this.columnFilterShrink = columnFilterShrink;
        return this;
    }
    public String getColumnFilterShrink() {
        return this.columnFilterShrink;
    }

    public DownloadDataTrackResultShrinkRequest setEventIdListShrink(String eventIdListShrink) {
        this.eventIdListShrink = eventIdListShrink;
        return this;
    }
    public String getEventIdListShrink() {
        return this.eventIdListShrink;
    }

    public DownloadDataTrackResultShrinkRequest setFilterEndTime(String filterEndTime) {
        this.filterEndTime = filterEndTime;
        return this;
    }
    public String getFilterEndTime() {
        return this.filterEndTime;
    }

    public DownloadDataTrackResultShrinkRequest setFilterStartTime(String filterStartTime) {
        this.filterStartTime = filterStartTime;
        return this;
    }
    public String getFilterStartTime() {
        return this.filterStartTime;
    }

    public DownloadDataTrackResultShrinkRequest setFilterTableListShrink(String filterTableListShrink) {
        this.filterTableListShrink = filterTableListShrink;
        return this;
    }
    public String getFilterTableListShrink() {
        return this.filterTableListShrink;
    }

    public DownloadDataTrackResultShrinkRequest setFilterTypeListShrink(String filterTypeListShrink) {
        this.filterTypeListShrink = filterTypeListShrink;
        return this;
    }
    public String getFilterTypeListShrink() {
        return this.filterTypeListShrink;
    }

    public DownloadDataTrackResultShrinkRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public DownloadDataTrackResultShrinkRequest setRollbackSQLType(String rollbackSQLType) {
        this.rollbackSQLType = rollbackSQLType;
        return this;
    }
    public String getRollbackSQLType() {
        return this.rollbackSQLType;
    }

    public DownloadDataTrackResultShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
