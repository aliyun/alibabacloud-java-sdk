// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAccessStrategyAvailableConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AddrPools")
    @Validation(required = true)
    public DescribeGtmAccessStrategyAvailableConfigResponseAddrPools addrPools;

    @NameInMap("Lines")
    @Validation(required = true)
    public DescribeGtmAccessStrategyAvailableConfigResponseLines lines;

    public static DescribeGtmAccessStrategyAvailableConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmAccessStrategyAvailableConfigResponse self = new DescribeGtmAccessStrategyAvailableConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmAccessStrategyAvailableConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmAccessStrategyAvailableConfigResponse setAddrPools(DescribeGtmAccessStrategyAvailableConfigResponseAddrPools addrPools) {
        this.addrPools = addrPools;
        return this;
    }
    public DescribeGtmAccessStrategyAvailableConfigResponseAddrPools getAddrPools() {
        return this.addrPools;
    }

    public DescribeGtmAccessStrategyAvailableConfigResponse setLines(DescribeGtmAccessStrategyAvailableConfigResponseLines lines) {
        this.lines = lines;
        return this;
    }
    public DescribeGtmAccessStrategyAvailableConfigResponseLines getLines() {
        return this.lines;
    }

    public static class DescribeGtmAccessStrategyAvailableConfigResponseAddrPoolsAddrPool extends TeaModel {
        @NameInMap("AddrPoolId")
        @Validation(required = true)
        public String addrPoolId;

        @NameInMap("AddrPoolName")
        @Validation(required = true)
        public String addrPoolName;

        public static DescribeGtmAccessStrategyAvailableConfigResponseAddrPoolsAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategyAvailableConfigResponseAddrPoolsAddrPool self = new DescribeGtmAccessStrategyAvailableConfigResponseAddrPoolsAddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseAddrPoolsAddrPool setAddrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }
        public String getAddrPoolId() {
            return this.addrPoolId;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseAddrPoolsAddrPool setAddrPoolName(String addrPoolName) {
            this.addrPoolName = addrPoolName;
            return this;
        }
        public String getAddrPoolName() {
            return this.addrPoolName;
        }

    }

    public static class DescribeGtmAccessStrategyAvailableConfigResponseAddrPools extends TeaModel {
        @NameInMap("AddrPool")
        @Validation(required = true)
        public java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseAddrPoolsAddrPool> addrPool;

        public static DescribeGtmAccessStrategyAvailableConfigResponseAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategyAvailableConfigResponseAddrPools self = new DescribeGtmAccessStrategyAvailableConfigResponseAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseAddrPools setAddrPool(java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseAddrPoolsAddrPool> addrPool) {
            this.addrPool = addrPool;
            return this;
        }
        public java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseAddrPoolsAddrPool> getAddrPool() {
            return this.addrPool;
        }

    }

    public static class DescribeGtmAccessStrategyAvailableConfigResponseLinesLine extends TeaModel {
        @NameInMap("LineCode")
        @Validation(required = true)
        public String lineCode;

        @NameInMap("LineName")
        @Validation(required = true)
        public String lineName;

        @NameInMap("GroupCode")
        @Validation(required = true)
        public String groupCode;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("FatherCode")
        @Validation(required = true)
        public String fatherCode;

        public static DescribeGtmAccessStrategyAvailableConfigResponseLinesLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategyAvailableConfigResponseLinesLine self = new DescribeGtmAccessStrategyAvailableConfigResponseLinesLine();
            return TeaModel.build(map, self);
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseLinesLine setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseLinesLine setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseLinesLine setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseLinesLine setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseLinesLine setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseLinesLine setFatherCode(String fatherCode) {
            this.fatherCode = fatherCode;
            return this;
        }
        public String getFatherCode() {
            return this.fatherCode;
        }

    }

    public static class DescribeGtmAccessStrategyAvailableConfigResponseLines extends TeaModel {
        @NameInMap("Line")
        @Validation(required = true)
        public java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseLinesLine> line;

        public static DescribeGtmAccessStrategyAvailableConfigResponseLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategyAvailableConfigResponseLines self = new DescribeGtmAccessStrategyAvailableConfigResponseLines();
            return TeaModel.build(map, self);
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseLines setLine(java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseLinesLine> line) {
            this.line = line;
            return this;
        }
        public java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseLinesLine> getLine() {
            return this.line;
        }

    }

}
