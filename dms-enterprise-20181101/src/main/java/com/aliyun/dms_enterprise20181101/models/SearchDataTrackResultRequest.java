// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchDataTrackResultRequest extends TeaModel {
    @NameInMap("ColumnFilter")
    public SearchDataTrackResultRequestColumnFilter columnFilter;

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

    @NameInMap("Tid")
    public Long tid;

    public static SearchDataTrackResultRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchDataTrackResultRequest self = new SearchDataTrackResultRequest();
        return TeaModel.build(map, self);
    }

    public SearchDataTrackResultRequest setColumnFilter(SearchDataTrackResultRequestColumnFilter columnFilter) {
        this.columnFilter = columnFilter;
        return this;
    }
    public SearchDataTrackResultRequestColumnFilter getColumnFilter() {
        return this.columnFilter;
    }

    public SearchDataTrackResultRequest setFilterEndTime(String filterEndTime) {
        this.filterEndTime = filterEndTime;
        return this;
    }
    public String getFilterEndTime() {
        return this.filterEndTime;
    }

    public SearchDataTrackResultRequest setFilterStartTime(String filterStartTime) {
        this.filterStartTime = filterStartTime;
        return this;
    }
    public String getFilterStartTime() {
        return this.filterStartTime;
    }

    public SearchDataTrackResultRequest setFilterTableList(java.util.List<String> filterTableList) {
        this.filterTableList = filterTableList;
        return this;
    }
    public java.util.List<String> getFilterTableList() {
        return this.filterTableList;
    }

    public SearchDataTrackResultRequest setFilterTypeList(java.util.List<String> filterTypeList) {
        this.filterTypeList = filterTypeList;
        return this;
    }
    public java.util.List<String> getFilterTypeList() {
        return this.filterTypeList;
    }

    public SearchDataTrackResultRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public SearchDataTrackResultRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class SearchDataTrackResultRequestColumnFilter extends TeaModel {
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

        public static SearchDataTrackResultRequestColumnFilter build(java.util.Map<String, ?> map) throws Exception {
            SearchDataTrackResultRequestColumnFilter self = new SearchDataTrackResultRequestColumnFilter();
            return TeaModel.build(map, self);
        }

        public SearchDataTrackResultRequestColumnFilter setBetweenEnd(String betweenEnd) {
            this.betweenEnd = betweenEnd;
            return this;
        }
        public String getBetweenEnd() {
            return this.betweenEnd;
        }

        public SearchDataTrackResultRequestColumnFilter setBetweenStart(String betweenStart) {
            this.betweenStart = betweenStart;
            return this;
        }
        public String getBetweenStart() {
            return this.betweenStart;
        }

        public SearchDataTrackResultRequestColumnFilter setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public SearchDataTrackResultRequestColumnFilter setInList(java.util.List<String> inList) {
            this.inList = inList;
            return this;
        }
        public java.util.List<String> getInList() {
            return this.inList;
        }

        public SearchDataTrackResultRequestColumnFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public SearchDataTrackResultRequestColumnFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
