// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsProgressResponseBody extends TeaModel {
    /**
     * <p>The migration progress.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ApsHiveProgress")
    public java.util.List<DescribeApsProgressResponseBodyApsHiveProgress> apsHiveProgress;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>-3EEC-</strong></strong></strong>-9F06-******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The success rate.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SuccessPercentage")
    public Integer successPercentage;

    /**
     * <p>The total number of migrated tables returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SuccessTableCount")
    public Integer successTableCount;

    /**
     * <p>The total number of tables to be migrated.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalTableCount")
    public Integer totalTableCount;

    public static DescribeApsProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsProgressResponseBody self = new DescribeApsProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApsProgressResponseBody setApsHiveProgress(java.util.List<DescribeApsProgressResponseBodyApsHiveProgress> apsHiveProgress) {
        this.apsHiveProgress = apsHiveProgress;
        return this;
    }
    public java.util.List<DescribeApsProgressResponseBodyApsHiveProgress> getApsHiveProgress() {
        return this.apsHiveProgress;
    }

    public DescribeApsProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApsProgressResponseBody setSuccessPercentage(Integer successPercentage) {
        this.successPercentage = successPercentage;
        return this;
    }
    public Integer getSuccessPercentage() {
        return this.successPercentage;
    }

    public DescribeApsProgressResponseBody setSuccessTableCount(Integer successTableCount) {
        this.successTableCount = successTableCount;
        return this;
    }
    public Integer getSuccessTableCount() {
        return this.successTableCount;
    }

    public DescribeApsProgressResponseBody setTotalTableCount(Integer totalTableCount) {
        this.totalTableCount = totalTableCount;
        return this;
    }
    public Integer getTotalTableCount() {
        return this.totalTableCount;
    }

    public static class DescribeApsProgressResponseBodyApsHiveProgress extends TeaModel {
        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The migration progress.</p>
         * 
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The migration speed.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Speed")
        public String speed;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TbName")
        public String tbName;

        public static DescribeApsProgressResponseBodyApsHiveProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribeApsProgressResponseBodyApsHiveProgress self = new DescribeApsProgressResponseBodyApsHiveProgress();
            return TeaModel.build(map, self);
        }

        public DescribeApsProgressResponseBodyApsHiveProgress setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeApsProgressResponseBodyApsHiveProgress setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeApsProgressResponseBodyApsHiveProgress setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public DescribeApsProgressResponseBodyApsHiveProgress setTbName(String tbName) {
            this.tbName = tbName;
            return this;
        }
        public String getTbName() {
            return this.tbName;
        }

    }

}
