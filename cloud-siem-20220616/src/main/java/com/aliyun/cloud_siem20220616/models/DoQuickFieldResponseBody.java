// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DoQuickFieldResponseBody extends TeaModel {
    /**
     * <p>The response of the quick analysis.</p>
     */
    @NameInMap("Data")
    public DoQuickFieldResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DoQuickFieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DoQuickFieldResponseBody self = new DoQuickFieldResponseBody();
        return TeaModel.build(map, self);
    }

    public DoQuickFieldResponseBody setData(DoQuickFieldResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DoQuickFieldResponseBodyData getData() {
        return this.data;
    }

    public DoQuickFieldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DoQuickFieldResponseBodyData extends TeaModel {
        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("AggQueryd")
        public String aggQueryd;

        /**
         * <p>Indicates whether the quick analysis was successful. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("CompleteOrNot")
        public Boolean completeOrNot;

        /**
         * <p>The number of entries returned.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("HasSQL")
        public Boolean hasSQL;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("Keys")
        public java.util.List<String> keys;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("Limited")
        public Long limited;

        /**
         * <p>The logs queried by using the quick analysis feature.</p>
         */
        @NameInMap("Logs")
        public java.util.List<?> logs;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("PQuery")
        public String PQuery;

        /**
         * <p>The number of entries queried.</p>
         */
        @NameInMap("ProcessedRows")
        public Long processedRows;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("QueryMode")
        public Integer queryMode;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("WhereQuery")
        public String whereQuery;

        public static DoQuickFieldResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DoQuickFieldResponseBodyData self = new DoQuickFieldResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DoQuickFieldResponseBodyData setAggQueryd(String aggQueryd) {
            this.aggQueryd = aggQueryd;
            return this;
        }
        public String getAggQueryd() {
            return this.aggQueryd;
        }

        public DoQuickFieldResponseBodyData setCompleteOrNot(Boolean completeOrNot) {
            this.completeOrNot = completeOrNot;
            return this;
        }
        public Boolean getCompleteOrNot() {
            return this.completeOrNot;
        }

        public DoQuickFieldResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DoQuickFieldResponseBodyData setHasSQL(Boolean hasSQL) {
            this.hasSQL = hasSQL;
            return this;
        }
        public Boolean getHasSQL() {
            return this.hasSQL;
        }

        public DoQuickFieldResponseBodyData setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public DoQuickFieldResponseBodyData setLimited(Long limited) {
            this.limited = limited;
            return this;
        }
        public Long getLimited() {
            return this.limited;
        }

        public DoQuickFieldResponseBodyData setLogs(java.util.List<?> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<?> getLogs() {
            return this.logs;
        }

        public DoQuickFieldResponseBodyData setPQuery(String PQuery) {
            this.PQuery = PQuery;
            return this;
        }
        public String getPQuery() {
            return this.PQuery;
        }

        public DoQuickFieldResponseBodyData setProcessedRows(Long processedRows) {
            this.processedRows = processedRows;
            return this;
        }
        public Long getProcessedRows() {
            return this.processedRows;
        }

        public DoQuickFieldResponseBodyData setQueryMode(Integer queryMode) {
            this.queryMode = queryMode;
            return this;
        }
        public Integer getQueryMode() {
            return this.queryMode;
        }

        public DoQuickFieldResponseBodyData setWhereQuery(String whereQuery) {
            this.whereQuery = whereQuery;
            return this;
        }
        public String getWhereQuery() {
            return this.whereQuery;
        }

    }

}
