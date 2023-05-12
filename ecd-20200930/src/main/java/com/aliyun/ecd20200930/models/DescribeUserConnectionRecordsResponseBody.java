// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUserConnectionRecordsResponseBody extends TeaModel {
    @NameInMap("ConnectionRecords")
    public java.util.List<DescribeUserConnectionRecordsResponseBodyConnectionRecords> connectionRecords;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserConnectionRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserConnectionRecordsResponseBody self = new DescribeUserConnectionRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserConnectionRecordsResponseBody setConnectionRecords(java.util.List<DescribeUserConnectionRecordsResponseBodyConnectionRecords> connectionRecords) {
        this.connectionRecords = connectionRecords;
        return this;
    }
    public java.util.List<DescribeUserConnectionRecordsResponseBodyConnectionRecords> getConnectionRecords() {
        return this.connectionRecords;
    }

    public DescribeUserConnectionRecordsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUserConnectionRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserConnectionRecordsResponseBodyConnectionRecords extends TeaModel {
        @NameInMap("ConnectDuration")
        public String connectDuration;

        @NameInMap("ConnectEndTime")
        public String connectEndTime;

        @NameInMap("ConnectStartTime")
        public String connectStartTime;

        @NameInMap("ConnectionRecordId")
        public String connectionRecordId;

        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("DesktopName")
        public String desktopName;

        public static DescribeUserConnectionRecordsResponseBodyConnectionRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserConnectionRecordsResponseBodyConnectionRecords self = new DescribeUserConnectionRecordsResponseBodyConnectionRecords();
            return TeaModel.build(map, self);
        }

        public DescribeUserConnectionRecordsResponseBodyConnectionRecords setConnectDuration(String connectDuration) {
            this.connectDuration = connectDuration;
            return this;
        }
        public String getConnectDuration() {
            return this.connectDuration;
        }

        public DescribeUserConnectionRecordsResponseBodyConnectionRecords setConnectEndTime(String connectEndTime) {
            this.connectEndTime = connectEndTime;
            return this;
        }
        public String getConnectEndTime() {
            return this.connectEndTime;
        }

        public DescribeUserConnectionRecordsResponseBodyConnectionRecords setConnectStartTime(String connectStartTime) {
            this.connectStartTime = connectStartTime;
            return this;
        }
        public String getConnectStartTime() {
            return this.connectStartTime;
        }

        public DescribeUserConnectionRecordsResponseBodyConnectionRecords setConnectionRecordId(String connectionRecordId) {
            this.connectionRecordId = connectionRecordId;
            return this;
        }
        public String getConnectionRecordId() {
            return this.connectionRecordId;
        }

        public DescribeUserConnectionRecordsResponseBodyConnectionRecords setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeUserConnectionRecordsResponseBodyConnectionRecords setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

    }

}
