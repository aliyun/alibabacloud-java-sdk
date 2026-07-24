// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class GetJobDebugDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetJobDebugDataResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetJobDebugDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobDebugDataResponseBody self = new GetJobDebugDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobDebugDataResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetJobDebugDataResponseBody setData(GetJobDebugDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetJobDebugDataResponseBodyData getData() {
        return this.data;
    }

    public GetJobDebugDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobDebugDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJobDebugDataResponseBodyDataDataRows extends TeaModel {
        @NameInMap("FlinkInstanceId")
        public String flinkInstanceId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("Offset")
        public Long offset;

        @NameInMap("Partition")
        public Integer partition;

        @NameInMap("ProcessedValue")
        public String processedValue;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Uuid")
        public String uuid;

        public static GetJobDebugDataResponseBodyDataDataRows build(java.util.Map<String, ?> map) throws Exception {
            GetJobDebugDataResponseBodyDataDataRows self = new GetJobDebugDataResponseBodyDataDataRows();
            return TeaModel.build(map, self);
        }

        public GetJobDebugDataResponseBodyDataDataRows setFlinkInstanceId(String flinkInstanceId) {
            this.flinkInstanceId = flinkInstanceId;
            return this;
        }
        public String getFlinkInstanceId() {
            return this.flinkInstanceId;
        }

        public GetJobDebugDataResponseBodyDataDataRows setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetJobDebugDataResponseBodyDataDataRows setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public GetJobDebugDataResponseBodyDataDataRows setPartition(Integer partition) {
            this.partition = partition;
            return this;
        }
        public Integer getPartition() {
            return this.partition;
        }

        public GetJobDebugDataResponseBodyDataDataRows setProcessedValue(String processedValue) {
            this.processedValue = processedValue;
            return this;
        }
        public String getProcessedValue() {
            return this.processedValue;
        }

        public GetJobDebugDataResponseBodyDataDataRows setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetJobDebugDataResponseBodyDataDataRows setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class GetJobDebugDataResponseBodyData extends TeaModel {
        @NameInMap("DataRows")
        public java.util.List<GetJobDebugDataResponseBodyDataDataRows> dataRows;

        @NameInMap("DebugField")
        public String debugField;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("Limit")
        public String limit;

        @NameInMap("NextCursor")
        public String nextCursor;

        public static GetJobDebugDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetJobDebugDataResponseBodyData self = new GetJobDebugDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetJobDebugDataResponseBodyData setDataRows(java.util.List<GetJobDebugDataResponseBodyDataDataRows> dataRows) {
            this.dataRows = dataRows;
            return this;
        }
        public java.util.List<GetJobDebugDataResponseBodyDataDataRows> getDataRows() {
            return this.dataRows;
        }

        public GetJobDebugDataResponseBodyData setDebugField(String debugField) {
            this.debugField = debugField;
            return this;
        }
        public String getDebugField() {
            return this.debugField;
        }

        public GetJobDebugDataResponseBodyData setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public GetJobDebugDataResponseBodyData setLimit(String limit) {
            this.limit = limit;
            return this;
        }
        public String getLimit() {
            return this.limit;
        }

        public GetJobDebugDataResponseBodyData setNextCursor(String nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }
        public String getNextCursor() {
            return this.nextCursor;
        }

    }

}
