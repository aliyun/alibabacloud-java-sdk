// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeClusterResourceUsageResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The queried resource usage.</p>
     */
    @NameInMap("Data")
    public DescribeClusterResourceUsageResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEAW</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterResourceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterResourceUsageResponseBody self = new DescribeClusterResourceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterResourceUsageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeClusterResourceUsageResponseBody setData(DescribeClusterResourceUsageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeClusterResourceUsageResponseBodyData getData() {
        return this.data;
    }

    public DescribeClusterResourceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterResourceUsageResponseBodyDataAcuInfo extends TeaModel {
        /**
         * <p>The resource usage metric. Valid values:</p>
         * <ul>
         * <li><code>TotalAcuNumber</code>: the total number of ACUs.</li>
         * <li><code>ReservedAcuNumber</code>: the number of ACUs for the reserved resources.</li>
         * <li><code>ReservedAcuUsageNumber</code>: the number of ACUs for the reserved resources that are used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TotalAcuNumber</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The values of the metric at specific points in time.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeClusterResourceUsageResponseBodyDataAcuInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResourceUsageResponseBodyDataAcuInfo self = new DescribeClusterResourceUsageResponseBodyDataAcuInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResourceUsageResponseBodyDataAcuInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClusterResourceUsageResponseBodyDataAcuInfo setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeClusterResourceUsageResponseBodyData extends TeaModel {
        /**
         * <p>The AnalyticDB compute unit (ACU) usage of the cluster.</p>
         */
        @NameInMap("AcuInfo")
        public java.util.List<DescribeClusterResourceUsageResponseBodyDataAcuInfo> acuInfo;

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-uf6dj23rt5zo9s9d</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The end time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-23T02:31Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-14T03:42:15Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeClusterResourceUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResourceUsageResponseBodyData self = new DescribeClusterResourceUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResourceUsageResponseBodyData setAcuInfo(java.util.List<DescribeClusterResourceUsageResponseBodyDataAcuInfo> acuInfo) {
            this.acuInfo = acuInfo;
            return this;
        }
        public java.util.List<DescribeClusterResourceUsageResponseBodyDataAcuInfo> getAcuInfo() {
            return this.acuInfo;
        }

        public DescribeClusterResourceUsageResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeClusterResourceUsageResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeClusterResourceUsageResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
