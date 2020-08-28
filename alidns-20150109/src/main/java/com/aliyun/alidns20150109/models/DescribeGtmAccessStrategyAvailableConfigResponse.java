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

    }

    public static class DescribeGtmAccessStrategyAvailableConfigResponseAddrPools extends TeaModel {
        @NameInMap("AddrPool")
        @Validation(required = true)
        public java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseAddrPoolsAddrPool> addrPool;

        public static DescribeGtmAccessStrategyAvailableConfigResponseAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategyAvailableConfigResponseAddrPools self = new DescribeGtmAccessStrategyAvailableConfigResponseAddrPools();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeGtmAccessStrategyAvailableConfigResponseLines extends TeaModel {
        @NameInMap("Line")
        @Validation(required = true)
        public java.util.List<DescribeGtmAccessStrategyAvailableConfigResponseLinesLine> line;

        public static DescribeGtmAccessStrategyAvailableConfigResponseLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategyAvailableConfigResponseLines self = new DescribeGtmAccessStrategyAvailableConfigResponseLines();
            return TeaModel.build(map, self);
        }

    }

}
