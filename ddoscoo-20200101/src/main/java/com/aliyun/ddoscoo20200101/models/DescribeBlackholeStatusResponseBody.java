// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeBlackholeStatusResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the blackhole filtering status of the instance.</p>
     */
    @NameInMap("BlackholeStatus")
    public java.util.List<DescribeBlackholeStatusResponseBodyBlackholeStatus> blackholeStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBlackholeStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlackholeStatusResponseBody self = new DescribeBlackholeStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBlackholeStatusResponseBody setBlackholeStatus(java.util.List<DescribeBlackholeStatusResponseBodyBlackholeStatus> blackholeStatus) {
        this.blackholeStatus = blackholeStatus;
        return this;
    }
    public java.util.List<DescribeBlackholeStatusResponseBodyBlackholeStatus> getBlackholeStatus() {
        return this.blackholeStatus;
    }

    public DescribeBlackholeStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBlackholeStatusResponseBodyBlackholeStatus extends TeaModel {
        /**
         * <p>Indicates whether blackhole filtering is triggered for the instance. Valid values:</p>
         * <ul>
         * <li><strong>blackhole</strong>: yes</li>
         * <li><strong>normal</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>blackhole</p>
         */
        @NameInMap("BlackStatus")
        public String blackStatus;

        /**
         * <p>The end time of blackhole filtering. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1540196323</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>203.<em><strong>.</strong></em>.132</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The start time of blackhole filtering. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1540195323</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeBlackholeStatusResponseBodyBlackholeStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlackholeStatusResponseBodyBlackholeStatus self = new DescribeBlackholeStatusResponseBodyBlackholeStatus();
            return TeaModel.build(map, self);
        }

        public DescribeBlackholeStatusResponseBodyBlackholeStatus setBlackStatus(String blackStatus) {
            this.blackStatus = blackStatus;
            return this;
        }
        public String getBlackStatus() {
            return this.blackStatus;
        }

        public DescribeBlackholeStatusResponseBodyBlackholeStatus setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeBlackholeStatusResponseBodyBlackholeStatus setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeBlackholeStatusResponseBodyBlackholeStatus setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
