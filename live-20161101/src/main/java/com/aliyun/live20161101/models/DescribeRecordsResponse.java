// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRecordsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Records")
    @Validation(required = true)
    public java.util.List<DescribeRecordsResponseRecords> records;

    public static DescribeRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordsResponse self = new DescribeRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecordsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordsResponse setRecords(java.util.List<DescribeRecordsResponseRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeRecordsResponseRecords> getRecords() {
        return this.records;
    }

    public static class DescribeRecordsResponseRecords extends TeaModel {
        @NameInMap("RecordId")
        @Validation(required = true)
        public String recordId;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("BoardId")
        @Validation(required = true)
        public Integer boardId;

        @NameInMap("RecordStartTime")
        @Validation(required = true)
        public Long recordStartTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("State")
        @Validation(required = true)
        public Integer state;

        @NameInMap("OssPath")
        @Validation(required = true)
        public String ossPath;

        @NameInMap("OssBucket")
        @Validation(required = true)
        public String ossBucket;

        @NameInMap("OssEndpoint")
        @Validation(required = true)
        public String ossEndpoint;

        public static DescribeRecordsResponseRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordsResponseRecords self = new DescribeRecordsResponseRecords();
            return TeaModel.build(map, self);
        }

        public DescribeRecordsResponseRecords setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeRecordsResponseRecords setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeRecordsResponseRecords setBoardId(Integer boardId) {
            this.boardId = boardId;
            return this;
        }
        public Integer getBoardId() {
            return this.boardId;
        }

        public DescribeRecordsResponseRecords setRecordStartTime(Long recordStartTime) {
            this.recordStartTime = recordStartTime;
            return this;
        }
        public Long getRecordStartTime() {
            return this.recordStartTime;
        }

        public DescribeRecordsResponseRecords setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeRecordsResponseRecords setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeRecordsResponseRecords setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public DescribeRecordsResponseRecords setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public DescribeRecordsResponseRecords setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeRecordsResponseRecords setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

    }

}
