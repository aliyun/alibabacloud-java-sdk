// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeStorageResourceUsageResponseBody extends TeaModel {
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
    public DescribeStorageResourceUsageResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEAW</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeStorageResourceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageResourceUsageResponseBody self = new DescribeStorageResourceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStorageResourceUsageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeStorageResourceUsageResponseBody setData(DescribeStorageResourceUsageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeStorageResourceUsageResponseBodyData getData() {
        return this.data;
    }

    public DescribeStorageResourceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeStorageResourceUsageResponseBodyDataAcuInfo extends TeaModel {
        /**
         * <p>The resource usage metric. Valid values:</p>
         * <ul>
         * <li><code>TotalAcuNumber</code>: the total number of ACUs.</li>
         * <li><code>ReservedAcuNumber</code>: the number of ACUs for the reserved resources.</li>
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

        public static DescribeStorageResourceUsageResponseBodyDataAcuInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageResourceUsageResponseBodyDataAcuInfo self = new DescribeStorageResourceUsageResponseBodyDataAcuInfo();
            return TeaModel.build(map, self);
        }

        public DescribeStorageResourceUsageResponseBodyDataAcuInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeStorageResourceUsageResponseBodyDataAcuInfo setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeStorageResourceUsageResponseBodyData extends TeaModel {
        /**
         * <p>The AnalyticDB compute unit (ACU) usage of the cluster.</p>
         */
        @NameInMap("AcuInfo")
        public java.util.List<DescribeStorageResourceUsageResponseBodyDataAcuInfo> acuInfo;

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1bg858bo8c****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The end time of the query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-23T01:06:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-22T01:06:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeStorageResourceUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageResourceUsageResponseBodyData self = new DescribeStorageResourceUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeStorageResourceUsageResponseBodyData setAcuInfo(java.util.List<DescribeStorageResourceUsageResponseBodyDataAcuInfo> acuInfo) {
            this.acuInfo = acuInfo;
            return this;
        }
        public java.util.List<DescribeStorageResourceUsageResponseBodyDataAcuInfo> getAcuInfo() {
            return this.acuInfo;
        }

        public DescribeStorageResourceUsageResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeStorageResourceUsageResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeStorageResourceUsageResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
