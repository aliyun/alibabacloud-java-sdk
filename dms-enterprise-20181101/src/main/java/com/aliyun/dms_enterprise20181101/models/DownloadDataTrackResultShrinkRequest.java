// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DownloadDataTrackResultShrinkRequest extends TeaModel {
    /**
     * <p>The condition to filter columns.</p>
     */
    @NameInMap("ColumnFilter")
    public String columnFilterShrink;

    /**
     * <p>The IDs of the events.</p>
     */
    @NameInMap("EventIdList")
    public String eventIdListShrink;

    /**
     * <p>The end time of the time range in which you want to track data operations. The time must be specified in the yyyy-MM-dd HH:mm:ss format.</p>
     */
    @NameInMap("FilterEndTime")
    public String filterEndTime;

    /**
     * <p>The start time of the time range in which you want to track data operations. The time must be specified in the yyyy-MM-dd HH:mm:ss format.</p>
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
     * <p>The ID of the ticket. You can call the [ListOrders](https://help.aliyun.com/document_detail/144643.html) operation to obtain the ticket ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The type of the SQL statement.</p>
     * <br>
     * <p>*   **REVERSE**: undoes or rolls back an executed SQL statement, which is equivalent to the UNDO SQL statement.</p>
     * <p>*   **FORWARD**: redoes or re-executes an SQL statement that failed to be executed, which is equivalent to the REDO SQL statement.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RollbackSQLType")
    public String rollbackSQLType;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/198074.html) operation to query the tenant ID.</p>
     */
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
