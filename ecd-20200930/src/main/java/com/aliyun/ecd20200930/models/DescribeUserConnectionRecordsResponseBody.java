// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUserConnectionRecordsResponseBody extends TeaModel {
    // Details about connection records.
    @NameInMap("ConnectionRecords")
    public java.util.List<DescribeUserConnectionRecordsResponseBodyConnectionRecords> connectionRecords;

    // The token that is used to start the next query.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the request.
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
        // The duration of the desktop connection. Unit: seconds.
        @NameInMap("ConnectDuration")
        public String connectDuration;

        // The time when the cloud desktop was disconnected.
        @NameInMap("ConnectEndTime")
        public String connectEndTime;

        // The time when the cloud desktop was connected.
        @NameInMap("ConnectStartTime")
        public String connectStartTime;

        // The ID of the connection record.
        @NameInMap("ConnectionRecordId")
        public String connectionRecordId;

        // The ID of the cloud desktop that is connected.
        @NameInMap("DesktopId")
        public String desktopId;

        // The name of the cloud desktop that is connected.
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
