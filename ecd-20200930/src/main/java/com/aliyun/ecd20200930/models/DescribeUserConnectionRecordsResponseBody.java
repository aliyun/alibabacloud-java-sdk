// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUserConnectionRecordsResponseBody extends TeaModel {
    /**
     * <p>The connection records.</p>
     */
    @NameInMap("ConnectionRecords")
    public java.util.List<DescribeUserConnectionRecordsResponseBodyConnectionRecords> connectionRecords;

    /**
     * <p>The token that is used to start the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2CC66B0A-BA3B-5D87-BFBE-11AAAD7A8E03</p>
     */
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
        /**
         * <p>The connection duration. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3405035000</p>
         */
        @NameInMap("ConnectDuration")
        public String connectDuration;

        /**
         * <p>The time when the end user disconnected from the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-27T20:03:13Z</p>
         */
        @NameInMap("ConnectEndTime")
        public String connectEndTime;

        /**
         * <p>The time when the end user connected to the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-19T10:12:38Z</p>
         */
        @NameInMap("ConnectStartTime")
        public String connectStartTime;

        /**
         * <p>The ID of the connection record.</p>
         * 
         * <strong>example:</strong>
         * <p>528</p>
         */
        @NameInMap("ConnectionRecordId")
        public String connectionRecordId;

        /**
         * <p>The ID of the cloud computer to which the end user connected.</p>
         * 
         * <strong>example:</strong>
         * <p>ud-2hawufy3uedi1****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The name of the cloud computer to which the end user connected.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
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
