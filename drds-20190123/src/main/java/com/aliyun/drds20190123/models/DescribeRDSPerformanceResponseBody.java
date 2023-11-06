// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRDSPerformanceResponseBody extends TeaModel {
    /**
     * <p>The result set of the query.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeRDSPerformanceResponseBodyData> data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeRDSPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRDSPerformanceResponseBody self = new DescribeRDSPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRDSPerformanceResponseBody setData(java.util.List<DescribeRDSPerformanceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeRDSPerformanceResponseBodyData> getData() {
        return this.data;
    }

    public DescribeRDSPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRDSPerformanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRDSPerformanceResponseBodyDataValues extends TeaModel {
        /**
         * <p>The time point when the value of the monitoring metric was obtained. The value is in the UNIX timestamp format. The time is displayed in UTC. Unit: ms.</p>
         */
        @NameInMap("Date")
        public Long date;

        /**
         * <p>The value of the monitoring metric.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeRDSPerformanceResponseBodyDataValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeRDSPerformanceResponseBodyDataValues self = new DescribeRDSPerformanceResponseBodyDataValues();
            return TeaModel.build(map, self);
        }

        public DescribeRDSPerformanceResponseBodyDataValues setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

        public DescribeRDSPerformanceResponseBodyDataValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeRDSPerformanceResponseBodyData extends TeaModel {
        /**
         * <p>The name of the monitoring metric.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The name of the node.</p>
         * <br>
         * <p>>  This parameter is returned only when the storage type of the database is PolarDB for MySQL. If the storage type of the database is ApsaraDB RDS for MySQL, this parameter is not returned.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The number of nodes.</p>
         */
        @NameInMap("NodeNum")
        public Integer nodeNum;

        /**
         * <p>The unit of the monitoring metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The details of the monitoring metric data.</p>
         */
        @NameInMap("Values")
        public java.util.List<DescribeRDSPerformanceResponseBodyDataValues> values;

        public static DescribeRDSPerformanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRDSPerformanceResponseBodyData self = new DescribeRDSPerformanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRDSPerformanceResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeRDSPerformanceResponseBodyData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeRDSPerformanceResponseBodyData setNodeNum(Integer nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        public DescribeRDSPerformanceResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeRDSPerformanceResponseBodyData setValues(java.util.List<DescribeRDSPerformanceResponseBodyDataValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<DescribeRDSPerformanceResponseBodyDataValues> getValues() {
            return this.values;
        }

    }

}
