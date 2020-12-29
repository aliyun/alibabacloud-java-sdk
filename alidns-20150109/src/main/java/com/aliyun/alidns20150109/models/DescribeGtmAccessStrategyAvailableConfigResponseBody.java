// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAccessStrategyAvailableConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AddrPools")
    public java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPools> addrPools;

    @NameInMap("Lines")
    public java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseBodyLines> lines;

    public static DescribeGtmAccessStrategyAvailableConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmAccessStrategyAvailableConfigResponseBody self = new DescribeGtmAccessStrategyAvailableConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmAccessStrategyAvailableConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmAccessStrategyAvailableConfigResponseBody setAddrPools(java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPools> addrPools) {
        this.addrPools = addrPools;
        return this;
    }
    public java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPools> getAddrPools() {
        return this.addrPools;
    }

    public DescribeGtmAccessStrategyAvailableConfigResponseBody setLines(java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseBodyLines> lines) {
        this.lines = lines;
        return this;
    }
    public java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseBodyLines> getLines() {
        return this.lines;
    }

    public static class DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPools extends TeaModel {
        @NameInMap("AddrPoolId")
        public String addrPoolId;

        @NameInMap("AddrPoolName")
        public String addrPoolName;

        public static DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPools self = new DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPools setAddrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }
        public String getAddrPoolId() {
            return this.addrPoolId;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPools setAddrPoolName(String addrPoolName) {
            this.addrPoolName = addrPoolName;
            return this;
        }
        public String getAddrPoolName() {
            return this.addrPoolName;
        }

    }

    public static class DescribeGtmAccessStrategyAvailableConfigResponseBodyLines extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("FatherCode")
        public String fatherCode;

        @NameInMap("LineCode")
        public String lineCode;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("LineName")
        public String lineName;

        @NameInMap("GroupCode")
        public String groupCode;

        public static DescribeGtmAccessStrategyAvailableConfigResponseBodyLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategyAvailableConfigResponseBodyLines self = new DescribeGtmAccessStrategyAvailableConfigResponseBodyLines();
            return TeaModel.build(map, self);
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBodyLines setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBodyLines setFatherCode(String fatherCode) {
            this.fatherCode = fatherCode;
            return this;
        }
        public String getFatherCode() {
            return this.fatherCode;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBodyLines setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBodyLines setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBodyLines setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBodyLines setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

    }

}
