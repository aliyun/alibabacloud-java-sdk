// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDISyncTaskMetricInfoResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // isSuccess
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("MetricInfo")
    public GetDISyncTaskMetricInfoResponseBodyMetricInfo metricInfo;

    public static GetDISyncTaskMetricInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncTaskMetricInfoResponseBody self = new GetDISyncTaskMetricInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDISyncTaskMetricInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDISyncTaskMetricInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDISyncTaskMetricInfoResponseBody setMetricInfo(GetDISyncTaskMetricInfoResponseBodyMetricInfo metricInfo) {
        this.metricInfo = metricInfo;
        return this;
    }
    public GetDISyncTaskMetricInfoResponseBodyMetricInfo getMetricInfo() {
        return this.metricInfo;
    }

    public static class GetDISyncTaskMetricInfoResponseBodyMetricInfo extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("SumReaderRecords")
        public Long sumReaderRecords;

        @NameInMap("SumWriterRecords")
        public Long sumWriterRecords;

        @NameInMap("LastTaskDelay")
        public Long lastTaskDelay;

        @NameInMap("InsertReaderRecords")
        public Long insertReaderRecords;

        @NameInMap("UpdateReaderRecords")
        public Long updateReaderRecords;

        @NameInMap("DeleteReaderRecords")
        public Long deleteReaderRecords;

        @NameInMap("InsertWriterRecords")
        public Long insertWriterRecords;

        @NameInMap("UpdateWriterRecords")
        public Long updateWriterRecords;

        @NameInMap("DeleteWriterRecords")
        public Long deleteWriterRecords;

        public static GetDISyncTaskMetricInfoResponseBodyMetricInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncTaskMetricInfoResponseBodyMetricInfo self = new GetDISyncTaskMetricInfoResponseBodyMetricInfo();
            return TeaModel.build(map, self);
        }

        public GetDISyncTaskMetricInfoResponseBodyMetricInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDISyncTaskMetricInfoResponseBodyMetricInfo setSumReaderRecords(Long sumReaderRecords) {
            this.sumReaderRecords = sumReaderRecords;
            return this;
        }
        public Long getSumReaderRecords() {
            return this.sumReaderRecords;
        }

        public GetDISyncTaskMetricInfoResponseBodyMetricInfo setSumWriterRecords(Long sumWriterRecords) {
            this.sumWriterRecords = sumWriterRecords;
            return this;
        }
        public Long getSumWriterRecords() {
            return this.sumWriterRecords;
        }

        public GetDISyncTaskMetricInfoResponseBodyMetricInfo setLastTaskDelay(Long lastTaskDelay) {
            this.lastTaskDelay = lastTaskDelay;
            return this;
        }
        public Long getLastTaskDelay() {
            return this.lastTaskDelay;
        }

        public GetDISyncTaskMetricInfoResponseBodyMetricInfo setInsertReaderRecords(Long insertReaderRecords) {
            this.insertReaderRecords = insertReaderRecords;
            return this;
        }
        public Long getInsertReaderRecords() {
            return this.insertReaderRecords;
        }

        public GetDISyncTaskMetricInfoResponseBodyMetricInfo setUpdateReaderRecords(Long updateReaderRecords) {
            this.updateReaderRecords = updateReaderRecords;
            return this;
        }
        public Long getUpdateReaderRecords() {
            return this.updateReaderRecords;
        }

        public GetDISyncTaskMetricInfoResponseBodyMetricInfo setDeleteReaderRecords(Long deleteReaderRecords) {
            this.deleteReaderRecords = deleteReaderRecords;
            return this;
        }
        public Long getDeleteReaderRecords() {
            return this.deleteReaderRecords;
        }

        public GetDISyncTaskMetricInfoResponseBodyMetricInfo setInsertWriterRecords(Long insertWriterRecords) {
            this.insertWriterRecords = insertWriterRecords;
            return this;
        }
        public Long getInsertWriterRecords() {
            return this.insertWriterRecords;
        }

        public GetDISyncTaskMetricInfoResponseBodyMetricInfo setUpdateWriterRecords(Long updateWriterRecords) {
            this.updateWriterRecords = updateWriterRecords;
            return this;
        }
        public Long getUpdateWriterRecords() {
            return this.updateWriterRecords;
        }

        public GetDISyncTaskMetricInfoResponseBodyMetricInfo setDeleteWriterRecords(Long deleteWriterRecords) {
            this.deleteWriterRecords = deleteWriterRecords;
            return this;
        }
        public Long getDeleteWriterRecords() {
            return this.deleteWriterRecords;
        }

    }

}
