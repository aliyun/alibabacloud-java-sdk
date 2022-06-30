// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeBlackholeStatusResponseBody extends TeaModel {
    @NameInMap("BlackholeStatus")
    public java.util.List<DescribeBlackholeStatusResponseBodyBlackholeStatus> blackholeStatus;

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
        @NameInMap("BlackStatus")
        public String blackStatus;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Ip")
        public String ip;

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
