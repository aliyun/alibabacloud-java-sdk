// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertDetailDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeAlertDetailDataResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DescribeAlertDetailDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertDetailDataResponseBody self = new DescribeAlertDetailDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertDetailDataResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlertDetailDataResponseBody setData(DescribeAlertDetailDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAlertDetailDataResponseBodyData getData() {
        return this.data;
    }

    public DescribeAlertDetailDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertDetailDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertDetailDataResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeAlertDetailDataResponseBodyData extends TeaModel {
        @NameInMap("AlertName")
        public String alertName;

        @NameInMap("Algorithm")
        public String algorithm;

        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("Category")
        public String category;

        @NameInMap("CountConvergence")
        public Integer countConvergence;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceRegionName")
        public String instanceRegionName;

        @NameInMap("MetricExtend")
        public String metricExtend;

        @NameInMap("Mttr")
        public String mttr;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("metricName")
        public String metricName;

        @NameInMap("metricUnit")
        public String metricUnit;

        @NameInMap("productCodeKey")
        public String productCodeKey;

        public static DescribeAlertDetailDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertDetailDataResponseBodyData self = new DescribeAlertDetailDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertDetailDataResponseBodyData setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public DescribeAlertDetailDataResponseBodyData setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public DescribeAlertDetailDataResponseBodyData setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public DescribeAlertDetailDataResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeAlertDetailDataResponseBodyData setCountConvergence(Integer countConvergence) {
            this.countConvergence = countConvergence;
            return this;
        }
        public Integer getCountConvergence() {
            return this.countConvergence;
        }

        public DescribeAlertDetailDataResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeAlertDetailDataResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAlertDetailDataResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAlertDetailDataResponseBodyData setInstanceRegionName(String instanceRegionName) {
            this.instanceRegionName = instanceRegionName;
            return this;
        }
        public String getInstanceRegionName() {
            return this.instanceRegionName;
        }

        public DescribeAlertDetailDataResponseBodyData setMetricExtend(String metricExtend) {
            this.metricExtend = metricExtend;
            return this;
        }
        public String getMetricExtend() {
            return this.metricExtend;
        }

        public DescribeAlertDetailDataResponseBodyData setMttr(String mttr) {
            this.mttr = mttr;
            return this;
        }
        public String getMttr() {
            return this.mttr;
        }

        public DescribeAlertDetailDataResponseBodyData setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public DescribeAlertDetailDataResponseBodyData setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeAlertDetailDataResponseBodyData setMetricUnit(String metricUnit) {
            this.metricUnit = metricUnit;
            return this;
        }
        public String getMetricUnit() {
            return this.metricUnit;
        }

        public DescribeAlertDetailDataResponseBodyData setProductCodeKey(String productCodeKey) {
            this.productCodeKey = productCodeKey;
            return this;
        }
        public String getProductCodeKey() {
            return this.productCodeKey;
        }

    }

}
