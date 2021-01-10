// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRecordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Records")
    public java.util.List<DescribeRecordsResponseBodyRecords> records;

    public static DescribeRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordsResponseBody self = new DescribeRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordsResponseBody setRecords(java.util.List<DescribeRecordsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeRecordsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class DescribeRecordsResponseBodyRecords extends TeaModel {
        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("BoardId")
        public Integer boardId;

        @NameInMap("RecordStartTime")
        public Long recordStartTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("State")
        public Integer state;

        @NameInMap("OssPath")
        public String ossPath;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        public static DescribeRecordsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordsResponseBodyRecords self = new DescribeRecordsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeRecordsResponseBodyRecords setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeRecordsResponseBodyRecords setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeRecordsResponseBodyRecords setBoardId(Integer boardId) {
            this.boardId = boardId;
            return this;
        }
        public Integer getBoardId() {
            return this.boardId;
        }

        public DescribeRecordsResponseBodyRecords setRecordStartTime(Long recordStartTime) {
            this.recordStartTime = recordStartTime;
            return this;
        }
        public Long getRecordStartTime() {
            return this.recordStartTime;
        }

        public DescribeRecordsResponseBodyRecords setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeRecordsResponseBodyRecords setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeRecordsResponseBodyRecords setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public DescribeRecordsResponseBodyRecords setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public DescribeRecordsResponseBodyRecords setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeRecordsResponseBodyRecords setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

    }

}
