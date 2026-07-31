// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the IDs of all clusters in a specific region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1hx5n1o8f61****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. The time is in UTC and uses the <em>yyyy-MM-ddTHH:mmZ</em> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-11T15:01Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The cluster performance metrics.</p>
     */
    @NameInMap("Performances")
    public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformances> performances;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BD8C3096-8BC6-51DF-A4AB-BACD9DC10435</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the query. The time is in UTC and uses the <em>yyyy-MM-ddTHH:mmZ</em> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-10T23:56Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBClusterPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterPerformanceResponseBody self = new DescribeDBClusterPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterPerformanceResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterPerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBClusterPerformanceResponseBody setPerformances(java.util.List<DescribeDBClusterPerformanceResponseBodyPerformances> performances) {
        this.performances = performances;
        return this;
    }
    public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformances> getPerformances() {
        return this.performances;
    }

    public DescribeDBClusterPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterPerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDBClusterPerformanceResponseBodyPerformancesSeries extends TeaModel {
        /**
         * <p>The name of the performance metric. This parameter is the Value Name of the monitoring metric. For more information, see <a href="https://help.aliyun.com/document_detail/2863211.html">Overview of Monitoring Items</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>AnalyticDB_Storage_CPU_Avg_Usage_Percentage</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>A JSON string that contains the tags for the metric series.</p>
         * 
         * <strong>example:</strong>
         * <p>{instance_name: &quot;am-***&quot;}</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>A key for internal internationalization (i18n). You can safely ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>AnalyticDB_RP_WaitTime</p>
         */
        @NameInMap("TranslateKey")
        public String translateKey;

        /**
         * <p>An array of data points for the time series.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeDBClusterPerformanceResponseBodyPerformancesSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponseBodyPerformancesSeries self = new DescribeDBClusterPerformanceResponseBodyPerformancesSeries();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPerformanceResponseBodyPerformancesSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformancesSeries setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformancesSeries setTranslateKey(String translateKey) {
            this.translateKey = translateKey;
            return this;
        }
        public String getTranslateKey() {
            return this.translateKey;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformancesSeries setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeDBClusterPerformanceResponseBodyPerformances extends TeaModel {
        /**
         * <p>The name of the performance metric.</p>
         * 
         * <strong>example:</strong>
         * <p>AnalyticDB_CPU_Usage_Percentage</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The time series data for the metric.</p>
         */
        @NameInMap("Series")
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformancesSeries> series;

        /**
         * <p>The unit of the monitoring metric.</p>
         * 
         * <strong>example:</strong>
         * <p>%</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static DescribeDBClusterPerformanceResponseBodyPerformances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponseBodyPerformances self = new DescribeDBClusterPerformanceResponseBodyPerformances();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPerformanceResponseBodyPerformances setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformances setSeries(java.util.List<DescribeDBClusterPerformanceResponseBodyPerformancesSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformancesSeries> getSeries() {
            return this.series;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformances setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
