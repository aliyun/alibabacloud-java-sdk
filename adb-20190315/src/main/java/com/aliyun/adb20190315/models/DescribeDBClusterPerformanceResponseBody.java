// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceResponseBody extends TeaModel {
    /**
     * <p>The information about the request denial. This parameter is returned only if Resource Access Management (RAM) permission verification failed.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;AuthAction&quot;: &quot;xxx&quot;,
     *   &quot;AuthPrincipalDisplayName&quot;: &quot;sampleName&quot;,
     *   &quot;AuthPrincipalOwnerId&quot;: &quot;111111111111111111&quot;,
     *   &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
     *   &quot;AuthResource&quot;: &quot;xxx&quot;,
     *   &quot;NoPermissionType&quot;: &quot;xxx&quot;,
     *   &quot;PolicyType&quot;: &quot;xxx&quot;
     * }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>am-************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-03T15:01:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The queried performance metrics.</p>
     */
    @NameInMap("Performances")
    public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformances> performances;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25B56BC7-4978-40B3-9E48-4B7067******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-03T15:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBClusterPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterPerformanceResponseBody self = new DescribeDBClusterPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterPerformanceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
         * <p>The name of the performance metric value. For more information about the performance metrics, see <a href="https://help.aliyun.com/document_detail/2863211.html">Metric overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>worker_avg_cpu_used</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The tags that are added to the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_name: &quot;amv-8vbf80pjcz*****&quot;</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The key that is used to obtain the name of the performance metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>elastic_executor_avg_cpu_use</p>
         */
        @NameInMap("TranslateKey")
        public String translateKey;

        /**
         * <p>The values of the queried performance metric.</p>
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
         * <p>AnalyticDB_CPU</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The queried performance metric data.</p>
         */
        @NameInMap("Series")
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformancesSeries> series;

        /**
         * <p>The unit of the performance metric.</p>
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
