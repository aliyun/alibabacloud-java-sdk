// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeSyncReportDetailResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public java.util.List<DescribeSyncReportDetailResponseBodyResult> result;

    public static DescribeSyncReportDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncReportDetailResponseBody self = new DescribeSyncReportDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSyncReportDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSyncReportDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSyncReportDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSyncReportDetailResponseBody setResult(java.util.List<DescribeSyncReportDetailResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeSyncReportDetailResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeSyncReportDetailResponseBodyResultHistoryData extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("ErrorPercent")
        public Float errorPercent;

        public static DescribeSyncReportDetailResponseBodyResultHistoryData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncReportDetailResponseBodyResultHistoryData self = new DescribeSyncReportDetailResponseBodyResultHistoryData();
            return TeaModel.build(map, self);
        }

        public DescribeSyncReportDetailResponseBodyResultHistoryData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeSyncReportDetailResponseBodyResultHistoryData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeSyncReportDetailResponseBodyResultHistoryData setErrorPercent(Float errorPercent) {
            this.errorPercent = errorPercent;
            return this;
        }
        public Float getErrorPercent() {
            return this.errorPercent;
        }

    }

    public static class DescribeSyncReportDetailResponseBodyResult extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ErrorCount")
        public Integer errorCount;

        @NameInMap("SampleDisplay")
        public Boolean sampleDisplay;

        @NameInMap("HistoryData")
        public java.util.List<DescribeSyncReportDetailResponseBodyResultHistoryData> historyData;

        @NameInMap("DefaultDisplay")
        public Boolean defaultDisplay;

        @NameInMap("ErrorPercent")
        public Float errorPercent;

        public static DescribeSyncReportDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncReportDetailResponseBodyResult self = new DescribeSyncReportDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeSyncReportDetailResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSyncReportDetailResponseBodyResult setErrorCount(Integer errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Integer getErrorCount() {
            return this.errorCount;
        }

        public DescribeSyncReportDetailResponseBodyResult setSampleDisplay(Boolean sampleDisplay) {
            this.sampleDisplay = sampleDisplay;
            return this;
        }
        public Boolean getSampleDisplay() {
            return this.sampleDisplay;
        }

        public DescribeSyncReportDetailResponseBodyResult setHistoryData(java.util.List<DescribeSyncReportDetailResponseBodyResultHistoryData> historyData) {
            this.historyData = historyData;
            return this;
        }
        public java.util.List<DescribeSyncReportDetailResponseBodyResultHistoryData> getHistoryData() {
            return this.historyData;
        }

        public DescribeSyncReportDetailResponseBodyResult setDefaultDisplay(Boolean defaultDisplay) {
            this.defaultDisplay = defaultDisplay;
            return this;
        }
        public Boolean getDefaultDisplay() {
            return this.defaultDisplay;
        }

        public DescribeSyncReportDetailResponseBodyResult setErrorPercent(Float errorPercent) {
            this.errorPercent = errorPercent;
            return this;
        }
        public Float getErrorPercent() {
            return this.errorPercent;
        }

    }

}
