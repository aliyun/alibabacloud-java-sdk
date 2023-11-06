// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSupportMaxPerformanceResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Performances")
    public DescribeDBInstanceSupportMaxPerformanceResponseBodyPerformances performances;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceSupportMaxPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSupportMaxPerformanceResponseBody self = new DescribeDBInstanceSupportMaxPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSupportMaxPerformanceResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceSupportMaxPerformanceResponseBody setPerformances(DescribeDBInstanceSupportMaxPerformanceResponseBodyPerformances performances) {
        this.performances = performances;
        return this;
    }
    public DescribeDBInstanceSupportMaxPerformanceResponseBodyPerformances getPerformances() {
        return this.performances;
    }

    public DescribeDBInstanceSupportMaxPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceSupportMaxPerformanceResponseBodyPerformancesPerformance extends TeaModel {
        @NameInMap("Bottleneck")
        public String bottleneck;

        @NameInMap("Key")
        public String key;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public String value;

        public static DescribeDBInstanceSupportMaxPerformanceResponseBodyPerformancesPerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceSupportMaxPerformanceResponseBodyPerformancesPerformance self = new DescribeDBInstanceSupportMaxPerformanceResponseBodyPerformancesPerformance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceSupportMaxPerformanceResponseBodyPerformancesPerformance setBottleneck(String bottleneck) {
            this.bottleneck = bottleneck;
            return this;
        }
        public String getBottleneck() {
            return this.bottleneck;
        }

        public DescribeDBInstanceSupportMaxPerformanceResponseBodyPerformancesPerformance setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstanceSupportMaxPerformanceResponseBodyPerformancesPerformance setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeDBInstanceSupportMaxPerformanceResponseBodyPerformancesPerformance setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstanceSupportMaxPerformanceResponseBodyPerformances extends TeaModel {
        @NameInMap("Performance")
        public java.util.List<DescribeDBInstanceSupportMaxPerformanceResponseBodyPerformancesPerformance> performance;

        public static DescribeDBInstanceSupportMaxPerformanceResponseBodyPerformances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceSupportMaxPerformanceResponseBodyPerformances self = new DescribeDBInstanceSupportMaxPerformanceResponseBodyPerformances();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceSupportMaxPerformanceResponseBodyPerformances setPerformance(java.util.List<DescribeDBInstanceSupportMaxPerformanceResponseBodyPerformancesPerformance> performance) {
            this.performance = performance;
            return this;
        }
        public java.util.List<DescribeDBInstanceSupportMaxPerformanceResponseBodyPerformancesPerformance> getPerformance() {
            return this.performance;
        }

    }

}
