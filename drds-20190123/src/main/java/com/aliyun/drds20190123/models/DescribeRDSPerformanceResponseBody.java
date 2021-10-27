// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRDSPerformanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeRDSPerformanceResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Date")
        public Long date;

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
        @NameInMap("Key")
        public String key;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("NodeNum")
        public Integer nodeNum;

        @NameInMap("Unit")
        public String unit;

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
