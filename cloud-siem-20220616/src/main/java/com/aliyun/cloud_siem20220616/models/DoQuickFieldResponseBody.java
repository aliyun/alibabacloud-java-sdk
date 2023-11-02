// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DoQuickFieldResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DoQuickFieldResponseBodyData data;

    @NameInMap("DyCode")
    public String dyCode;

    @NameInMap("DyMessage")
    public String dyMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DoQuickFieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DoQuickFieldResponseBody self = new DoQuickFieldResponseBody();
        return TeaModel.build(map, self);
    }

    public DoQuickFieldResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DoQuickFieldResponseBody setData(DoQuickFieldResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DoQuickFieldResponseBodyData getData() {
        return this.data;
    }

    public DoQuickFieldResponseBody setDyCode(String dyCode) {
        this.dyCode = dyCode;
        return this;
    }
    public String getDyCode() {
        return this.dyCode;
    }

    public DoQuickFieldResponseBody setDyMessage(String dyMessage) {
        this.dyMessage = dyMessage;
        return this;
    }
    public String getDyMessage() {
        return this.dyMessage;
    }

    public DoQuickFieldResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DoQuickFieldResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DoQuickFieldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DoQuickFieldResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DoQuickFieldResponseBodyData extends TeaModel {
        @NameInMap("AggQueryd")
        public String aggQueryd;

        @NameInMap("CompleteOrNot")
        public Boolean completeOrNot;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("HasSQL")
        public Boolean hasSQL;

        @NameInMap("Keys")
        public java.util.List<String> keys;

        @NameInMap("Limited")
        public Long limited;

        @NameInMap("Logs")
        public java.util.List<?> logs;

        @NameInMap("PQuery")
        public String PQuery;

        @NameInMap("ProcessedRows")
        public Long processedRows;

        @NameInMap("QueryMode")
        public Integer queryMode;

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
