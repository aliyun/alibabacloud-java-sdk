// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSQLPatternsResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Patterns")
    public java.util.List<DescribeDBInstanceSQLPatternsResponseBodyPatterns> patterns;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBInstanceSQLPatternsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSQLPatternsResponseBody self = new DescribeDBInstanceSQLPatternsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSQLPatternsResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBInstanceSQLPatternsResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBInstanceSQLPatternsResponseBody setPatterns(java.util.List<DescribeDBInstanceSQLPatternsResponseBodyPatterns> patterns) {
        this.patterns = patterns;
        return this;
    }
    public java.util.List<DescribeDBInstanceSQLPatternsResponseBodyPatterns> getPatterns() {
        return this.patterns;
    }

    public DescribeDBInstanceSQLPatternsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceSQLPatternsResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDBInstanceSQLPatternsResponseBodyPatterns extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Values")
        public java.util.Map<String, ?> values;

        public static DescribeDBInstanceSQLPatternsResponseBodyPatterns build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceSQLPatternsResponseBodyPatterns self = new DescribeDBInstanceSQLPatternsResponseBodyPatterns();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceSQLPatternsResponseBodyPatterns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBInstanceSQLPatternsResponseBodyPatterns setValues(java.util.Map<String, ?> values) {
            this.values = values;
            return this;
        }
        public java.util.Map<String, ?> getValues() {
            return this.values;
        }

    }

}
