// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAccessStrategyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StrategyId")
    @Validation(required = true)
    public String strategyId;

    @NameInMap("StrategyName")
    @Validation(required = true)
    public String strategyName;

    @NameInMap("DefultAddrPoolId")
    @Validation(required = true)
    public String defultAddrPoolId;

    @NameInMap("DefaultAddrPoolName")
    @Validation(required = true)
    public String defaultAddrPoolName;

    @NameInMap("FailoverAddrPoolId")
    @Validation(required = true)
    public String failoverAddrPoolId;

    @NameInMap("FailoverAddrPoolName")
    @Validation(required = true)
    public String failoverAddrPoolName;

    @NameInMap("StrategyMode")
    @Validation(required = true)
    public String strategyMode;

    @NameInMap("AccessMode")
    @Validation(required = true)
    public String accessMode;

    @NameInMap("AccessStatus")
    @Validation(required = true)
    public String accessStatus;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("DefaultAddrPoolStatus")
    @Validation(required = true)
    public String defaultAddrPoolStatus;

    @NameInMap("FailoverAddrPoolStatus")
    @Validation(required = true)
    public String failoverAddrPoolStatus;

    @NameInMap("DefaultAddrPoolMonitorStatus")
    @Validation(required = true)
    public String defaultAddrPoolMonitorStatus;

    @NameInMap("FailoverAddrPoolMonitorStatus")
    @Validation(required = true)
    public String failoverAddrPoolMonitorStatus;

    @NameInMap("Lines")
    @Validation(required = true)
    public DescribeGtmAccessStrategyResponseLines lines;

    public static DescribeGtmAccessStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmAccessStrategyResponse self = new DescribeGtmAccessStrategyResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeGtmAccessStrategyResponseLinesLine extends TeaModel {
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

        public static DescribeGtmAccessStrategyResponseLinesLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategyResponseLinesLine self = new DescribeGtmAccessStrategyResponseLinesLine();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeGtmAccessStrategyResponseLines extends TeaModel {
        @NameInMap("Line")
        @Validation(required = true)
        public java.util.List<DescribeGtmAccessStrategyResponseLinesLine> line;

        public static DescribeGtmAccessStrategyResponseLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategyResponseLines self = new DescribeGtmAccessStrategyResponseLines();
            return TeaModel.build(map, self);
        }

    }

}
