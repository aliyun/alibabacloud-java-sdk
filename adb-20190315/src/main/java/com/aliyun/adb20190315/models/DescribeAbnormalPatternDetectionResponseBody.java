// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAbnormalPatternDetectionResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>am-xxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The queried detection items and detection results.</p>
     */
    @NameInMap("DetectionItems")
    public java.util.List<DescribeAbnormalPatternDetectionResponseBodyDetectionItems> detectionItems;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36B66482-A215-5F04-A42E-859983D89D7B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeAbnormalPatternDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAbnormalPatternDetectionResponseBody self = new DescribeAbnormalPatternDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAbnormalPatternDetectionResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAbnormalPatternDetectionResponseBody setDetectionItems(java.util.List<DescribeAbnormalPatternDetectionResponseBodyDetectionItems> detectionItems) {
        this.detectionItems = detectionItems;
        return this;
    }
    public java.util.List<DescribeAbnormalPatternDetectionResponseBodyDetectionItems> getDetectionItems() {
        return this.detectionItems;
    }

    public DescribeAbnormalPatternDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAbnormalPatternDetectionResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAbnormalPatternDetectionResponseBodyDetectionItemsResults extends TeaModel {
        /**
         * <p>The IP address of the SQL client that submits the SQL pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>11.81.238.102</p>
         */
        @NameInMap("AccessIp")
        public String accessIp;

        /**
         * <p>The details about the detection report of the SQL pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The number of failed SQL patterns within the time range.</p>
         * 
         * <strong>example:</strong>
         * <p>63</p>
         */
        @NameInMap("FailedCount")
        public Long failedCount;

        /**
         * <p>The SQL pattern ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5495577090378760322</p>
         */
        @NameInMap("PatternId")
        public String patternId;

        /**
         * <p>The number of executed SQL patterns within the time range.</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("QueryCount")
        public Long queryCount;

        /**
         * <p>The metrics related to the SQL pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>Maximum query duration: 1.43s
         * Maximum peak memory: 20.73 MB
         * Maximum read table data: 10.12 MB</p>
         */
        @NameInMap("RelatedMetrics")
        public String relatedMetrics;

        /**
         * <p>The SQL statement that represents the SQL pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT *nFROM HIVE.<code>ADB_EXTERNAL_TPCH_10GB</code>.<code>External_customer</code>nLIMIT ?</p>
         */
        @NameInMap("SQLPattern")
        public String SQLPattern;

        /**
         * <p>The names of tables.</p>
         * 
         * <strong>example:</strong>
         * <p>ad_marketing_engine.prod_dws_oe_promotion_daily_trend_report</p>
         */
        @NameInMap("Tables")
        public String tables;

        /**
         * <p>The name of the database account that is used to submit the query.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("User")
        public String user;

        public static DescribeAbnormalPatternDetectionResponseBodyDetectionItemsResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeAbnormalPatternDetectionResponseBodyDetectionItemsResults self = new DescribeAbnormalPatternDetectionResponseBodyDetectionItemsResults();
            return TeaModel.build(map, self);
        }

        public DescribeAbnormalPatternDetectionResponseBodyDetectionItemsResults setAccessIp(String accessIp) {
            this.accessIp = accessIp;
            return this;
        }
        public String getAccessIp() {
            return this.accessIp;
        }

        public DescribeAbnormalPatternDetectionResponseBodyDetectionItemsResults setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeAbnormalPatternDetectionResponseBodyDetectionItemsResults setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public DescribeAbnormalPatternDetectionResponseBodyDetectionItemsResults setPatternId(String patternId) {
            this.patternId = patternId;
            return this;
        }
        public String getPatternId() {
            return this.patternId;
        }

        public DescribeAbnormalPatternDetectionResponseBodyDetectionItemsResults setQueryCount(Long queryCount) {
            this.queryCount = queryCount;
            return this;
        }
        public Long getQueryCount() {
            return this.queryCount;
        }

        public DescribeAbnormalPatternDetectionResponseBodyDetectionItemsResults setRelatedMetrics(String relatedMetrics) {
            this.relatedMetrics = relatedMetrics;
            return this;
        }
        public String getRelatedMetrics() {
            return this.relatedMetrics;
        }

        public DescribeAbnormalPatternDetectionResponseBodyDetectionItemsResults setSQLPattern(String SQLPattern) {
            this.SQLPattern = SQLPattern;
            return this;
        }
        public String getSQLPattern() {
            return this.SQLPattern;
        }

        public DescribeAbnormalPatternDetectionResponseBodyDetectionItemsResults setTables(String tables) {
            this.tables = tables;
            return this;
        }
        public String getTables() {
            return this.tables;
        }

        public DescribeAbnormalPatternDetectionResponseBodyDetectionItemsResults setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class DescribeAbnormalPatternDetectionResponseBodyDetectionItems extends TeaModel {
        /**
         * <p>The description of the detection result.</p>
         * 
         * <strong>example:</strong>
         * <p>Two SQL patterns that have abnormal totalTime metric values are detected. This may result in increased CPU utilization, query slowdown, and degraded system stability. Go to the monitoring page to diagnose the issue and then perform optimization.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the detection item.</p>
         * 
         * <strong>example:</strong>
         * <p>Cost，PeakMemory</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The detection result.</p>
         */
        @NameInMap("Results")
        public java.util.List<DescribeAbnormalPatternDetectionResponseBodyDetectionItemsResults> results;

        /**
         * <p>The severity level of the detection result. Valid values:</p>
         * <ul>
         * <li>NORMAL</li>
         * <li>WARNING</li>
         * <li>CRITICAL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL
         * WARNNING
         * CRITICAL</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeAbnormalPatternDetectionResponseBodyDetectionItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAbnormalPatternDetectionResponseBodyDetectionItems self = new DescribeAbnormalPatternDetectionResponseBodyDetectionItems();
            return TeaModel.build(map, self);
        }

        public DescribeAbnormalPatternDetectionResponseBodyDetectionItems setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeAbnormalPatternDetectionResponseBodyDetectionItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAbnormalPatternDetectionResponseBodyDetectionItems setResults(java.util.List<DescribeAbnormalPatternDetectionResponseBodyDetectionItemsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<DescribeAbnormalPatternDetectionResponseBodyDetectionItemsResults> getResults() {
            return this.results;
        }

        public DescribeAbnormalPatternDetectionResponseBodyDetectionItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
