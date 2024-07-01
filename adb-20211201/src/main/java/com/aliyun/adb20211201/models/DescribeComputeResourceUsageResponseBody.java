// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeComputeResourceUsageResponseBody extends TeaModel {
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
    public DescribeComputeResourceUsageResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEAW</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeComputeResourceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComputeResourceUsageResponseBody self = new DescribeComputeResourceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComputeResourceUsageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeComputeResourceUsageResponseBody setData(DescribeComputeResourceUsageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeComputeResourceUsageResponseBodyData getData() {
        return this.data;
    }

    public DescribeComputeResourceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeComputeResourceUsageResponseBodyDataAcuInfo extends TeaModel {
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

        public static DescribeComputeResourceUsageResponseBodyDataAcuInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeComputeResourceUsageResponseBodyDataAcuInfo self = new DescribeComputeResourceUsageResponseBodyDataAcuInfo();
            return TeaModel.build(map, self);
        }

        public DescribeComputeResourceUsageResponseBodyDataAcuInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeComputeResourceUsageResponseBodyDataAcuInfo setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeComputeResourceUsageResponseBodyData extends TeaModel {
        /**
         * <p>The AnalyticDB compute unit (ACU) usage of the cluster.</p>
         */
        @NameInMap("AcuInfo")
        public java.util.List<DescribeComputeResourceUsageResponseBodyDataAcuInfo> acuInfo;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-clusterxxx</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The end time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-07T02:37:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <p>The type of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>interative</p>
         */
        @NameInMap("ResourceGroupType")
        public String resourceGroupType;

        /**
         * <p>The start time of the query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-24T07:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeComputeResourceUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeComputeResourceUsageResponseBodyData self = new DescribeComputeResourceUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeComputeResourceUsageResponseBodyData setAcuInfo(java.util.List<DescribeComputeResourceUsageResponseBodyDataAcuInfo> acuInfo) {
            this.acuInfo = acuInfo;
            return this;
        }
        public java.util.List<DescribeComputeResourceUsageResponseBodyDataAcuInfo> getAcuInfo() {
            return this.acuInfo;
        }

        public DescribeComputeResourceUsageResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeComputeResourceUsageResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeComputeResourceUsageResponseBodyData setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public DescribeComputeResourceUsageResponseBodyData setResourceGroupType(String resourceGroupType) {
            this.resourceGroupType = resourceGroupType;
            return this;
        }
        public String getResourceGroupType() {
            return this.resourceGroupType;
        }

        public DescribeComputeResourceUsageResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
