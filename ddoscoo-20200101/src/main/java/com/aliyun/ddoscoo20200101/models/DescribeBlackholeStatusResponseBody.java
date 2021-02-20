// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeBlackholeStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BlackholeStatus")
    public java.util.List<DescribeBlackholeStatusResponseBodyBlackholeStatus> blackholeStatus;

    public static DescribeBlackholeStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlackholeStatusResponseBody self = new DescribeBlackholeStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBlackholeStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBlackholeStatusResponseBody setBlackholeStatus(java.util.List<DescribeBlackholeStatusResponseBodyBlackholeStatus> blackholeStatus) {
        this.blackholeStatus = blackholeStatus;
        return this;
    }
    public java.util.List<DescribeBlackholeStatusResponseBodyBlackholeStatus> getBlackholeStatus() {
        return this.blackholeStatus;
    }

    public static class DescribeBlackholeStatusResponseBodyBlackholeStatus extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("BlackStatus")
        public String blackStatus;

        public static DescribeBlackholeStatusResponseBodyBlackholeStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlackholeStatusResponseBodyBlackholeStatus self = new DescribeBlackholeStatusResponseBodyBlackholeStatus();
            return TeaModel.build(map, self);
        }

        public DescribeBlackholeStatusResponseBodyBlackholeStatus setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeBlackholeStatusResponseBodyBlackholeStatus setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeBlackholeStatusResponseBodyBlackholeStatus setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeBlackholeStatusResponseBodyBlackholeStatus setBlackStatus(String blackStatus) {
            this.blackStatus = blackStatus;
            return this;
        }
        public String getBlackStatus() {
            return this.blackStatus;
        }

    }

}
