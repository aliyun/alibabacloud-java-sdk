// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeBlockStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Line")
        public String line;

        @NameInMap("BlockStatus")
        public String blockStatus;

        public static DescribeBlockStatusResponseBodyStatusListBlockStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockStatusResponseBodyStatusListBlockStatusList self = new DescribeBlockStatusResponseBodyStatusListBlockStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeBlockStatusResponseBodyStatusListBlockStatusList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeBlockStatusResponseBodyStatusListBlockStatusList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeBlockStatusResponseBodyStatusListBlockStatusList setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeBlockStatusResponseBodyStatusListBlockStatusList setBlockStatus(String blockStatus) {
            this.blockStatus = blockStatus;
            return this;
        }
        public String getBlockStatus() {
            return this.blockStatus;
        }

    }

    public static class DescribeBlockStatusResponseBodyStatusList extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("BlockStatusList")
        public java.util.List<DescribeBlockStatusResponseBodyStatusListBlockStatusList> blockStatusList;

        public static DescribeBlockStatusResponseBodyStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockStatusResponseBodyStatusList self = new DescribeBlockStatusResponseBodyStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeBlockStatusResponseBodyStatusList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeBlockStatusResponseBodyStatusList setBlockStatusList(java.util.List<DescribeBlockStatusResponseBodyStatusListBlockStatusList> blockStatusList) {
            this.blockStatusList = blockStatusList;
            return this;
        }
        public java.util.List<DescribeBlockStatusResponseBodyStatusListBlockStatusList> getBlockStatusList() {
            return this.blockStatusList;
        }

    }

}
