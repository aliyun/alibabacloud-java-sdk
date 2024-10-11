// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeSyncReportDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<DescribeSyncReportDetailResponseBodyResult> result;

    public static DescribeSyncReportDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncReportDetailResponseBody self = new DescribeSyncReportDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSyncReportDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public DescribeSyncReportDetailResponseBody setResult(java.util.List<DescribeSyncReportDetailResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeSyncReportDetailResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeSyncReportDetailResponseBodyResultHistoryData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1586673466</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>84.6</p>
         */
        @NameInMap("errorPercent")
        public Float errorPercent;

        /**
         * <strong>example:</strong>
         * <p>1586673466</p>
         */
        @NameInMap("startTime")
        public Long startTime;

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

        public DescribeSyncReportDetailResponseBodyResultHistoryData setErrorPercent(Float errorPercent) {
            this.errorPercent = errorPercent;
            return this;
        }
        public Float getErrorPercent() {
            return this.errorPercent;
        }

        public DescribeSyncReportDetailResponseBodyResultHistoryData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeSyncReportDetailResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("defaultDisplay")
        public Boolean defaultDisplay;

        /**
         * <strong>example:</strong>
         * <p>246165</p>
         */
        @NameInMap("errorCount")
        public Integer errorCount;

        /**
         * <strong>example:</strong>
         * <p>84.6</p>
         */
        @NameInMap("errorPercent")
        public Float errorPercent;

        @NameInMap("historyData")
        public java.util.List<DescribeSyncReportDetailResponseBodyResultHistoryData> historyData;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("sampleDisplay")
        public Boolean sampleDisplay;

        /**
         * <strong>example:</strong>
         * <p>bhvTimeBehavior</p>
         */
        @NameInMap("type")
        public String type;

        public static DescribeSyncReportDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncReportDetailResponseBodyResult self = new DescribeSyncReportDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeSyncReportDetailResponseBodyResult setDefaultDisplay(Boolean defaultDisplay) {
            this.defaultDisplay = defaultDisplay;
            return this;
        }
        public Boolean getDefaultDisplay() {
            return this.defaultDisplay;
        }

        public DescribeSyncReportDetailResponseBodyResult setErrorCount(Integer errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Integer getErrorCount() {
            return this.errorCount;
        }

        public DescribeSyncReportDetailResponseBodyResult setErrorPercent(Float errorPercent) {
            this.errorPercent = errorPercent;
            return this;
        }
        public Float getErrorPercent() {
            return this.errorPercent;
        }

        public DescribeSyncReportDetailResponseBodyResult setHistoryData(java.util.List<DescribeSyncReportDetailResponseBodyResultHistoryData> historyData) {
            this.historyData = historyData;
            return this;
        }
        public java.util.List<DescribeSyncReportDetailResponseBodyResultHistoryData> getHistoryData() {
            return this.historyData;
        }

        public DescribeSyncReportDetailResponseBodyResult setSampleDisplay(Boolean sampleDisplay) {
            this.sampleDisplay = sampleDisplay;
            return this;
        }
        public Boolean getSampleDisplay() {
            return this.sampleDisplay;
        }

        public DescribeSyncReportDetailResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
