// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListWebFlowRulesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListWebFlowRulesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>4AE73569-304C-5AA9-AE11-C1D99C7D1689</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListWebFlowRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWebFlowRulesResponseBody self = new ListWebFlowRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWebFlowRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListWebFlowRulesResponseBody setData(ListWebFlowRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListWebFlowRulesResponseBodyData getData() {
        return this.data;
    }

    public ListWebFlowRulesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListWebFlowRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWebFlowRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWebFlowRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWebFlowRulesResponseBodyDataResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hkhon1XXXX@c3df23522bXXXXX</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>spring-cloud-a</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Burst")
        public Integer burst;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ControlBehavior")
        public Integer controlBehavior;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;appName\&quot;:\&quot;spring-cloud-a\&quot;,\&quot;fallbackBehavior\&quot;:{\&quot;webFallbackMode\&quot;:0,\&quot;webRespContentType\&quot;:0,\&quot;webRespMessage\&quot;:\&quot;Blocked\&quot;,\&quot;webRespStatusCode\&quot;:429},\&quot;id\&quot;:977,\&quot;name\&quot;:\&quot;Fallback\&quot;,\&quot;namespace\&quot;:\&quot;default\&quot;,\&quot;resourceClassification\&quot;:1}</p>
         */
        @NameInMap("FallbackObject")
        public String fallbackObject;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("MaxQueueingTimeMs")
        public Integer maxQueueingTimeMs;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MetricType")
        public Integer metricType;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>{&quot;fieldName&quot;:&quot;testKey&quot;,&quot;matchStrategy&quot;:2,&quot;parseStrategy&quot;:2,&quot;pattern&quot;:&quot;testValue&quot;}</p>
         */
        @NameInMap("ParamItem")
        public String paramItem;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>/flow</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResourceMode")
        public Integer resourceMode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceType")
        public Integer resourceType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("StatIntervalMs")
        public Integer statIntervalMs;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        public static ListWebFlowRulesResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListWebFlowRulesResponseBodyDataResult self = new ListWebFlowRulesResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListWebFlowRulesResponseBodyDataResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListWebFlowRulesResponseBodyDataResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListWebFlowRulesResponseBodyDataResult setBurst(Integer burst) {
            this.burst = burst;
            return this;
        }
        public Integer getBurst() {
            return this.burst;
        }

        public ListWebFlowRulesResponseBodyDataResult setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public ListWebFlowRulesResponseBodyDataResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListWebFlowRulesResponseBodyDataResult setFallbackObject(String fallbackObject) {
            this.fallbackObject = fallbackObject;
            return this;
        }
        public String getFallbackObject() {
            return this.fallbackObject;
        }

        public ListWebFlowRulesResponseBodyDataResult setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public ListWebFlowRulesResponseBodyDataResult setMetricType(Integer metricType) {
            this.metricType = metricType;
            return this;
        }
        public Integer getMetricType() {
            return this.metricType;
        }

        public ListWebFlowRulesResponseBodyDataResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListWebFlowRulesResponseBodyDataResult setParamItem(String paramItem) {
            this.paramItem = paramItem;
            return this;
        }
        public String getParamItem() {
            return this.paramItem;
        }

        public ListWebFlowRulesResponseBodyDataResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListWebFlowRulesResponseBodyDataResult setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ListWebFlowRulesResponseBodyDataResult setResourceMode(Integer resourceMode) {
            this.resourceMode = resourceMode;
            return this;
        }
        public Integer getResourceMode() {
            return this.resourceMode;
        }

        public ListWebFlowRulesResponseBodyDataResult setResourceType(Integer resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Integer getResourceType() {
            return this.resourceType;
        }

        public ListWebFlowRulesResponseBodyDataResult setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListWebFlowRulesResponseBodyDataResult setStatIntervalMs(Integer statIntervalMs) {
            this.statIntervalMs = statIntervalMs;
            return this;
        }
        public Integer getStatIntervalMs() {
            return this.statIntervalMs;
        }

        public ListWebFlowRulesResponseBodyDataResult setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class ListWebFlowRulesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<ListWebFlowRulesResponseBodyDataResult> result;

        /**
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListWebFlowRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWebFlowRulesResponseBodyData self = new ListWebFlowRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWebFlowRulesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListWebFlowRulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListWebFlowRulesResponseBodyData setResult(java.util.List<ListWebFlowRulesResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListWebFlowRulesResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListWebFlowRulesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
