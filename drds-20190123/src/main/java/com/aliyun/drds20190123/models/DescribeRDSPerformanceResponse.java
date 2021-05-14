// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRDSPerformanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<DescribeRDSPerformanceResponseData> data;

    public static DescribeRDSPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRDSPerformanceResponse self = new DescribeRDSPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRDSPerformanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRDSPerformanceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRDSPerformanceResponse setData(java.util.List<DescribeRDSPerformanceResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeRDSPerformanceResponseData> getData() {
        return this.data;
    }

    public static class DescribeRDSPerformanceResponseDataValues extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("Date")
        @Validation(required = true)
        public Long date;

        public static DescribeRDSPerformanceResponseDataValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeRDSPerformanceResponseDataValues self = new DescribeRDSPerformanceResponseDataValues();
            return TeaModel.build(map, self);
        }

        public DescribeRDSPerformanceResponseDataValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeRDSPerformanceResponseDataValues setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

    }

    public static class DescribeRDSPerformanceResponseData extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Unit")
        @Validation(required = true)
        public String unit;

        @NameInMap("NodeNum")
        @Validation(required = true)
        public Integer nodeNum;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("Values")
        @Validation(required = true)
        public java.util.List<DescribeRDSPerformanceResponseDataValues> values;

        public static DescribeRDSPerformanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRDSPerformanceResponseData self = new DescribeRDSPerformanceResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeRDSPerformanceResponseData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeRDSPerformanceResponseData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeRDSPerformanceResponseData setNodeNum(Integer nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        public DescribeRDSPerformanceResponseData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeRDSPerformanceResponseData setValues(java.util.List<DescribeRDSPerformanceResponseDataValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<DescribeRDSPerformanceResponseDataValues> getValues() {
            return this.values;
        }

    }

}
