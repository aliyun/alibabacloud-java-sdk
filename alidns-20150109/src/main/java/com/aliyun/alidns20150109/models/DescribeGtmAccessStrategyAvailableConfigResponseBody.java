// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAccessStrategyAvailableConfigResponseBody extends TeaModel {
    /**
     * <p>The returned list of address pools.</p>
     */
    @NameInMap("AddrPools")
    public DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPools addrPools;

    /**
     * <p>The returned lines of access regions.</p>
     */
    @NameInMap("Lines")
    public DescribeGtmAccessStrategyAvailableConfigResponseBodyLines lines;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuggestSetDefaultLine")
    public Boolean suggestSetDefaultLine;

    public static DescribeGtmAccessStrategyAvailableConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmAccessStrategyAvailableConfigResponseBody self = new DescribeGtmAccessStrategyAvailableConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmAccessStrategyAvailableConfigResponseBody setAddrPools(DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPools addrPools) {
        this.addrPools = addrPools;
        return this;
    }
    public DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPools getAddrPools() {
        return this.addrPools;
    }

    public DescribeGtmAccessStrategyAvailableConfigResponseBody setLines(DescribeGtmAccessStrategyAvailableConfigResponseBodyLines lines) {
        this.lines = lines;
        return this;
    }
    public DescribeGtmAccessStrategyAvailableConfigResponseBodyLines getLines() {
        return this.lines;
    }

    public DescribeGtmAccessStrategyAvailableConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmAccessStrategyAvailableConfigResponseBody setSuggestSetDefaultLine(Boolean suggestSetDefaultLine) {
        this.suggestSetDefaultLine = suggestSetDefaultLine;
        return this;
    }
    public Boolean getSuggestSetDefaultLine() {
        return this.suggestSetDefaultLine;
    }

    public static class DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPoolsAddrPool extends TeaModel {
        /**
         * <p>The ID of the address pool.</p>
         */
        @NameInMap("AddrPoolId")
        public String addrPoolId;

        /**
         * <p>The name of the address pool.</p>
         */
        @NameInMap("AddrPoolName")
        public String addrPoolName;

        public static DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPoolsAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPoolsAddrPool self = new DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPoolsAddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPoolsAddrPool setAddrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }
        public String getAddrPoolId() {
            return this.addrPoolId;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPoolsAddrPool setAddrPoolName(String addrPoolName) {
            this.addrPoolName = addrPoolName;
            return this;
        }
        public String getAddrPoolName() {
            return this.addrPoolName;
        }

    }

    public static class DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPools extends TeaModel {
        @NameInMap("AddrPool")
        public java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPoolsAddrPool> addrPool;

        public static DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPools self = new DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPools setAddrPool(java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPoolsAddrPool> addrPool) {
            this.addrPool = addrPool;
            return this;
        }
        public java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseBodyAddrPoolsAddrPool> getAddrPool() {
            return this.addrPool;
        }

    }

    public static class DescribeGtmAccessStrategyAvailableConfigResponseBodyLinesLine extends TeaModel {
        /**
         * <p>The code of the parent line for the access region. If no parent line exists, leave this parameter blank.</p>
         */
        @NameInMap("FatherCode")
        public String fatherCode;

        /**
         * <p>The code of the access region group.</p>
         */
        @NameInMap("GroupCode")
        public String groupCode;

        /**
         * <p>The name of the access region group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The code for the line of the access region.</p>
         */
        @NameInMap("LineCode")
        public String lineCode;

        /**
         * <p>The name for the line of the access region.</p>
         */
        @NameInMap("LineName")
        public String lineName;

        /**
         * <p>The current status of the line. Valid values:</p>
         * <br>
         * <p>- **FORBIDDEN**: Unavailable</p>
         * <p>- **OPTIONAL**: Availabe</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGtmAccessStrategyAvailableConfigResponseBodyLinesLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategyAvailableConfigResponseBodyLinesLine self = new DescribeGtmAccessStrategyAvailableConfigResponseBodyLinesLine();
            return TeaModel.build(map, self);
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBodyLinesLine setFatherCode(String fatherCode) {
            this.fatherCode = fatherCode;
            return this;
        }
        public String getFatherCode() {
            return this.fatherCode;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBodyLinesLine setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBodyLinesLine setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBodyLinesLine setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBodyLinesLine setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBodyLinesLine setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGtmAccessStrategyAvailableConfigResponseBodyLines extends TeaModel {
        @NameInMap("Line")
        public java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseBodyLinesLine> line;

        public static DescribeGtmAccessStrategyAvailableConfigResponseBodyLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategyAvailableConfigResponseBodyLines self = new DescribeGtmAccessStrategyAvailableConfigResponseBodyLines();
            return TeaModel.build(map, self);
        }

        public DescribeGtmAccessStrategyAvailableConfigResponseBodyLines setLine(java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseBodyLinesLine> line) {
            this.line = line;
            return this;
        }
        public java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseBodyLinesLine> getLine() {
            return this.line;
        }

    }

}
