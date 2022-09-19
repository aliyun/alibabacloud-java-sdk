// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlResultsExportHistoryResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Records")
    public java.util.List<DescribeSqlResultsExportHistoryResponseBodyRecords> records;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSqlResultsExportHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlResultsExportHistoryResponseBody self = new DescribeSqlResultsExportHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlResultsExportHistoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSqlResultsExportHistoryResponseBody setRecords(java.util.List<DescribeSqlResultsExportHistoryResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeSqlResultsExportHistoryResponseBodyRecords> getRecords() {
        return this.records;
    }

    public DescribeSqlResultsExportHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlResultsExportHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSqlResultsExportHistoryResponseBodyRecords extends TeaModel {
        @NameInMap("ExceptionMsg")
        public String exceptionMsg;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Url")
        public String url;

        public static DescribeSqlResultsExportHistoryResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlResultsExportHistoryResponseBodyRecords self = new DescribeSqlResultsExportHistoryResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeSqlResultsExportHistoryResponseBodyRecords setExceptionMsg(String exceptionMsg) {
            this.exceptionMsg = exceptionMsg;
            return this;
        }
        public String getExceptionMsg() {
            return this.exceptionMsg;
        }

        public DescribeSqlResultsExportHistoryResponseBodyRecords setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeSqlResultsExportHistoryResponseBodyRecords setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSqlResultsExportHistoryResponseBodyRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSqlResultsExportHistoryResponseBodyRecords setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
