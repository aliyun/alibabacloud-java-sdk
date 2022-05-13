// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRecordingsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Recordings")
    public java.util.List<DescribeRecordingsResponseBodyRecordings> recordings;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRecordingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordingsResponseBody self = new DescribeRecordingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecordingsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRecordingsResponseBody setRecordings(java.util.List<DescribeRecordingsResponseBodyRecordings> recordings) {
        this.recordings = recordings;
        return this;
    }
    public java.util.List<DescribeRecordingsResponseBodyRecordings> getRecordings() {
        return this.recordings;
    }

    public DescribeRecordingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRecordingsResponseBodyRecordings extends TeaModel {
        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("RecordingSize")
        public Integer recordingSize;

        @NameInMap("RecordingType")
        public String recordingType;

        @NameInMap("StartTime")
        public String startTime;

        public static DescribeRecordingsResponseBodyRecordings build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordingsResponseBodyRecordings self = new DescribeRecordingsResponseBodyRecordings();
            return TeaModel.build(map, self);
        }

        public DescribeRecordingsResponseBodyRecordings setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeRecordingsResponseBodyRecordings setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRecordingsResponseBodyRecordings setEndUserIds(java.util.List<String> endUserIds) {
            this.endUserIds = endUserIds;
            return this;
        }
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
        }

        public DescribeRecordingsResponseBodyRecordings setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public DescribeRecordingsResponseBodyRecordings setRecordingSize(Integer recordingSize) {
            this.recordingSize = recordingSize;
            return this;
        }
        public Integer getRecordingSize() {
            return this.recordingSize;
        }

        public DescribeRecordingsResponseBodyRecordings setRecordingType(String recordingType) {
            this.recordingType = recordingType;
            return this;
        }
        public String getRecordingType() {
            return this.recordingType;
        }

        public DescribeRecordingsResponseBodyRecordings setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
