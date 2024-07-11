// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupPlanConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("FullBackupCycle")
    public Integer fullBackupCycle;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MinHFileBackupCount")
    public Integer minHFileBackupCount;

    /**
     * <strong>example:</strong>
     * <p>2020-11-09T18:00:00Z</p>
     */
    @NameInMap("NextFullBackupDate")
    public String nextFullBackupDate;

    /**
     * <strong>example:</strong>
     * <p>33A23201-6038-4A6A-B76A-61047EA04E6A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tables")
    public DescribeBackupPlanConfigResponseBodyTables tables;

    public static DescribeBackupPlanConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPlanConfigResponseBody self = new DescribeBackupPlanConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPlanConfigResponseBody setFullBackupCycle(Integer fullBackupCycle) {
        this.fullBackupCycle = fullBackupCycle;
        return this;
    }
    public Integer getFullBackupCycle() {
        return this.fullBackupCycle;
    }

    public DescribeBackupPlanConfigResponseBody setMinHFileBackupCount(Integer minHFileBackupCount) {
        this.minHFileBackupCount = minHFileBackupCount;
        return this;
    }
    public Integer getMinHFileBackupCount() {
        return this.minHFileBackupCount;
    }

    public DescribeBackupPlanConfigResponseBody setNextFullBackupDate(String nextFullBackupDate) {
        this.nextFullBackupDate = nextFullBackupDate;
        return this;
    }
    public String getNextFullBackupDate() {
        return this.nextFullBackupDate;
    }

    public DescribeBackupPlanConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPlanConfigResponseBody setTables(DescribeBackupPlanConfigResponseBodyTables tables) {
        this.tables = tables;
        return this;
    }
    public DescribeBackupPlanConfigResponseBodyTables getTables() {
        return this.tables;
    }

    public static class DescribeBackupPlanConfigResponseBodyTables extends TeaModel {
        @NameInMap("Table")
        public java.util.List<String> table;

        public static DescribeBackupPlanConfigResponseBodyTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlanConfigResponseBodyTables self = new DescribeBackupPlanConfigResponseBodyTables();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlanConfigResponseBodyTables setTable(java.util.List<String> table) {
            this.table = table;
            return this;
        }
        public java.util.List<String> getTable() {
            return this.table;
        }

    }

}
