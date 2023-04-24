// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DownloadDataTrackResultRequest extends TeaModel {
    @NameInMap("ColumnFilter")
    public DownloadDataTrackResultRequestColumnFilter columnFilter;

    @NameInMap("EventIdList")
    public java.util.List<Long> eventIdList;

    @NameInMap("FilterEndTime")
    public String filterEndTime;

    @NameInMap("FilterStartTime")
    public String filterStartTime;

    @NameInMap("FilterTableList")
    public java.util.List<String> filterTableList;

    @NameInMap("FilterTypeList")
    public java.util.List<String> filterTypeList;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RollbackSQLType")
    public String rollbackSQLType;

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
        @NameInMap("BetweenEnd")
        public String betweenEnd;

        @NameInMap("BetweenStart")
        public String betweenStart;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("InList")
        public java.util.List<String> inList;

        @NameInMap("Operator")
        public String operator;

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
