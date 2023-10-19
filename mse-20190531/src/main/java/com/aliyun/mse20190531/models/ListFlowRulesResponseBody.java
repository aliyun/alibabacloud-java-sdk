// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListFlowRulesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public ListFlowRulesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    The request was successful.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   false</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    The request failed.</p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListFlowRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowRulesResponseBody self = new ListFlowRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListFlowRulesResponseBody setData(ListFlowRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFlowRulesResponseBodyData getData() {
        return this.data;
    }

    public ListFlowRulesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFlowRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFlowRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListFlowRulesResponseBodyDataResult extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The throttling effect.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   0</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    fast failure</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   2</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    in queue</p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("ControlBehavior")
        public Integer controlBehavior;

        /**
         * <p>Indicates whether the throttling rule was enabled.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   false</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The throttling behavior.</p>
         */
        @NameInMap("FallbackObject")
        public String fallbackObject;

        /**
         * <p>The timeout period for queuing when the value of ControlBehavior is set to 2. Unit: milliseconds.</p>
         */
        @NameInMap("MaxQueueingTimeMs")
        public Integer maxQueueingTimeMs;

        /**
         * <p>The statistical dimension. The value 1 indicates the number of accepted requests.</p>
         */
        @NameInMap("MetricType")
        public Integer metricType;

        /**
         * <p>The namespace.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the interface resource.</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The throttling threshold.</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("TrafficTags")
        public java.util.Map<String, ?> trafficTags;

        public static ListFlowRulesResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListFlowRulesResponseBodyDataResult self = new ListFlowRulesResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListFlowRulesResponseBodyDataResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListFlowRulesResponseBodyDataResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListFlowRulesResponseBodyDataResult setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public ListFlowRulesResponseBodyDataResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListFlowRulesResponseBodyDataResult setFallbackObject(String fallbackObject) {
            this.fallbackObject = fallbackObject;
            return this;
        }
        public String getFallbackObject() {
            return this.fallbackObject;
        }

        public ListFlowRulesResponseBodyDataResult setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public ListFlowRulesResponseBodyDataResult setMetricType(Integer metricType) {
            this.metricType = metricType;
            return this;
        }
        public Integer getMetricType() {
            return this.metricType;
        }

        public ListFlowRulesResponseBodyDataResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListFlowRulesResponseBodyDataResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListFlowRulesResponseBodyDataResult setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ListFlowRulesResponseBodyDataResult setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListFlowRulesResponseBodyDataResult setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public ListFlowRulesResponseBodyDataResult setTrafficTags(java.util.Map<String, ?> trafficTags) {
            this.trafficTags = trafficTags;
            return this;
        }
        public java.util.Map<String, ?> getTrafficTags() {
            return this.trafficTags;
        }

    }

    public static class ListFlowRulesResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The data returned.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListFlowRulesResponseBodyDataResult> result;

        /**
         * <p>The total number of entries.</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListFlowRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFlowRulesResponseBodyData self = new ListFlowRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFlowRulesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListFlowRulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFlowRulesResponseBodyData setResult(java.util.List<ListFlowRulesResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListFlowRulesResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListFlowRulesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
