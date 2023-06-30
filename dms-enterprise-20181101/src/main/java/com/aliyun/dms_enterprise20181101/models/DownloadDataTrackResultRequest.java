// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DownloadDataTrackResultRequest extends TeaModel {
    /**
     * <p>The condition to filter columns.</p>
     */
    @NameInMap("ColumnFilter")
    public DownloadDataTrackResultRequestColumnFilter columnFilter;

    /**
     * <p>The IDs of the events.</p>
     */
    @NameInMap("EventIdList")
    public java.util.List<Long> eventIdList;

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
    public java.util.List<String> filterTableList;

    /**
     * <p>The types of data operations that you want to track.</p>
     */
    @NameInMap("FilterTypeList")
    public java.util.List<String> filterTypeList;

    /**
     * <p>The ID of the ticket. You can call the [ListOrders](~~144643~~) operation to obtain the ticket ID.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The type of the SQL statement.</p>
     * <br>
     * <p>*   **REVERSE**: undoes or rolls back an executed SQL statement, which is equivalent to the UNDO SQL statement.</p>
     * <p>*   **FORWARD**: redoes or re-executes an SQL statement that failed to be executed, which is equivalent to the REDO SQL statement.</p>
     */
    @NameInMap("RollbackSQLType")
    public String rollbackSQLType;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static DownloadDataTrackResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadDataTrackResultRequest self = new DownloadDataTrackResultRequest();
        return TeaModel.build(map, self);
    }

    public DownloadDataTrackResultRequest setColumnFilter(DownloadDataTrackResultRequestColumnFilter columnFilter) {
        this.columnFilter = columnFilter;
        return this;
    }
    public DownloadDataTrackResultRequestColumnFilter getColumnFilter() {
        return this.columnFilter;
    }

    public DownloadDataTrackResultRequest setEventIdList(java.util.List<Long> eventIdList) {
        this.eventIdList = eventIdList;
        return this;
    }
    public java.util.List<Long> getEventIdList() {
        return this.eventIdList;
    }

    public DownloadDataTrackResultRequest setFilterEndTime(String filterEndTime) {
        this.filterEndTime = filterEndTime;
        return this;
    }
    public String getFilterEndTime() {
        return this.filterEndTime;
    }

    public DownloadDataTrackResultRequest setFilterStartTime(String filterStartTime) {
        this.filterStartTime = filterStartTime;
        return this;
    }
    public String getFilterStartTime() {
        return this.filterStartTime;
    }

    public DownloadDataTrackResultRequest setFilterTableList(java.util.List<String> filterTableList) {
        this.filterTableList = filterTableList;
        return this;
    }
    public java.util.List<String> getFilterTableList() {
        return this.filterTableList;
    }

    public DownloadDataTrackResultRequest setFilterTypeList(java.util.List<String> filterTypeList) {
        this.filterTypeList = filterTypeList;
        return this;
    }
    public java.util.List<String> getFilterTypeList() {
        return this.filterTypeList;
    }

    public DownloadDataTrackResultRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public DownloadDataTrackResultRequest setRollbackSQLType(String rollbackSQLType) {
        this.rollbackSQLType = rollbackSQLType;
        return this;
    }
    public String getRollbackSQLType() {
        return this.rollbackSQLType;
    }

    public DownloadDataTrackResultRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class DownloadDataTrackResultRequestColumnFilter extends TeaModel {
        /**
         * <p>The end value of the range used in the filter condition. This parameter takes effect only when Operator is set to BETWEEN.</p>
         */
        @NameInMap("BetweenEnd")
        public String betweenEnd;

        /**
         * <p>The start value of the range used in the filter condition. This parameter takes effect only when Operator is set to BETWEEN.</p>
         */
        @NameInMap("BetweenStart")
        public String betweenStart;

        /**
         * <p>The name of the column.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The IN list used in the filter condition.</p>
         */
        @NameInMap("InList")
        public java.util.List<String> inList;

        /**
         * <p>The type of the operator used to configure the filter condition. Valid values:</p>
         * <br>
         * <p>*   **EQUAL**: retrieves the column whose value is equal to the specified value.</p>
         * <p>*   **NOT_EQUAL**: retrieves the column whose value is not equal to the specified value.</p>
         * <p>*   **IN**: retrieves the column whose value is in the IN list.</p>
         * <p>*   **BETWEEN**: retrieves the column whose value is in the specified range.</p>
         * <p>*   **LESS**: retrieves the column whose value is less than the specified value.</p>
         * <p>*   **MORE**: retrieves the column whose value is greater than the specified value.</p>
         * <p>*   **NOT_IN**: retrieves the column whose value is not in the IN list.</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The value used in the filter condition.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DownloadDataTrackResultRequestColumnFilter build(java.util.Map<String, ?> map) throws Exception {
            DownloadDataTrackResultRequestColumnFilter self = new DownloadDataTrackResultRequestColumnFilter();
            return TeaModel.build(map, self);
        }

        public DownloadDataTrackResultRequestColumnFilter setBetweenEnd(String betweenEnd) {
            this.betweenEnd = betweenEnd;
            return this;
        }
        public String getBetweenEnd() {
            return this.betweenEnd;
        }

        public DownloadDataTrackResultRequestColumnFilter setBetweenStart(String betweenStart) {
            this.betweenStart = betweenStart;
            return this;
        }
        public String getBetweenStart() {
            return this.betweenStart;
        }

        public DownloadDataTrackResultRequestColumnFilter setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public DownloadDataTrackResultRequestColumnFilter setInList(java.util.List<String> inList) {
            this.inList = inList;
            return this;
        }
        public java.util.List<String> getInList() {
            return this.inList;
        }

        public DownloadDataTrackResultRequestColumnFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DownloadDataTrackResultRequestColumnFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
