// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeBlockStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of details of the Diversion from Origin Server configurations of the instance.</p>
     */
    @NameInMap("StatusList")
    public java.util.List<DescribeBlockStatusResponseBodyStatusList> statusList;

    public static DescribeBlockStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockStatusResponseBody self = new DescribeBlockStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBlockStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBlockStatusResponseBody setStatusList(java.util.List<DescribeBlockStatusResponseBodyStatusList> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<DescribeBlockStatusResponseBodyStatusList> getStatusList() {
        return this.statusList;
    }

    public static class DescribeBlockStatusResponseBodyStatusListBlockStatusList extends TeaModel {
        /**
         * <p>The blocking status of the network traffic. Valid values:</p>
         * <br>
         * <p>*   **areablock**: Network traffic is blocked.</p>
         * <p>*   **normal**: Network traffic is not blocked.</p>
         */
        @NameInMap("BlockStatus")
        public String blockStatus;

        /**
         * <p>The end time of the blocking. This value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The Internet service provider (ISP) line from which the traffic is blocked. Valid values:</p>
         * <br>
         * <p>*   **ct**: China Telecom (International)</p>
         * <p>*   **cut**: China Unicom (International)</p>
         */
        @NameInMap("Line")
        public String line;

        /**
         * <p>The start time of the blocking. This value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeBlockStatusResponseBodyStatusListBlockStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockStatusResponseBodyStatusListBlockStatusList self = new DescribeBlockStatusResponseBodyStatusListBlockStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeBlockStatusResponseBodyStatusListBlockStatusList setBlockStatus(String blockStatus) {
            this.blockStatus = blockStatus;
            return this;
        }
        public String getBlockStatus() {
            return this.blockStatus;
        }

        public DescribeBlockStatusResponseBodyStatusListBlockStatusList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeBlockStatusResponseBodyStatusListBlockStatusList setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeBlockStatusResponseBodyStatusListBlockStatusList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeBlockStatusResponseBodyStatusList extends TeaModel {
        /**
         * <p>An array that consists of details of the Diversion from Origin Server configuration.</p>
         */
        @NameInMap("BlockStatusList")
        public java.util.List<DescribeBlockStatusResponseBodyStatusListBlockStatusList> blockStatusList;

        /**
         * <p>The IP address of the instance.</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static DescribeBlockStatusResponseBodyStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockStatusResponseBodyStatusList self = new DescribeBlockStatusResponseBodyStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeBlockStatusResponseBodyStatusList setBlockStatusList(java.util.List<DescribeBlockStatusResponseBodyStatusListBlockStatusList> blockStatusList) {
            this.blockStatusList = blockStatusList;
            return this;
        }
        public java.util.List<DescribeBlockStatusResponseBodyStatusListBlockStatusList> getBlockStatusList() {
            return this.blockStatusList;
        }

        public DescribeBlockStatusResponseBodyStatusList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

}
