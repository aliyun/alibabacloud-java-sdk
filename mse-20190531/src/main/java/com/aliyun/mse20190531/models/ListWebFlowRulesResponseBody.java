// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListWebFlowRulesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ListWebFlowRulesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4AE73569-304C-5AA9-AE11-C1D99C7D1689</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The request was successful.</p>
     * </li>
     * <li><p><code>false</code>: The request failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hkhon1XXXX@c3df23522bXXXXX</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>spring-cloud-a</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The number of additional requests allowed for burst requests. The effect is equivalent to the maximum number of tokens for the token bucket algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Burst")
        public Integer burst;

        /**
         * <p>The flow control method. Valid values:</p>
         * <ul>
         * <li><p>0: fast failure</p>
         * </li>
         * <li><p>2: wait in queue</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ControlBehavior")
        public Integer controlBehavior;

        /**
         * <p>Indicates whether the rule is enabled or disabled.</p>
         * <ul>
         * <li><p><code>true</code>: enabled.</p>
         * </li>
         * <li><p><code>false</code>: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The behavior that was bound to the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;appName\&quot;:\&quot;spring-cloud-a\&quot;,\&quot;fallbackBehavior\&quot;:{\&quot;webFallbackMode\&quot;:0,\&quot;webRespContentType\&quot;:0,\&quot;webRespMessage\&quot;:\&quot;Blocked\&quot;,\&quot;webRespStatusCode\&quot;:429},\&quot;id\&quot;:977,\&quot;name\&quot;:\&quot;Fallback\&quot;,\&quot;namespace\&quot;:\&quot;default\&quot;,\&quot;resourceClassification\&quot;:1}</p>
         */
        @NameInMap("FallbackObject")
        public String fallbackObject;

        /**
         * <p>The timeout period for queuing when the ControlBehavior parameter is set to 2. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("MaxQueueingTimeMs")
        public Integer maxQueueingTimeMs;

        /**
         * <p>The threshold type. Valid values:</p>
         * <ul>
         * <li>1: number of requests</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MetricType")
        public Integer metricType;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The parameter description item, which is a JSON string containing the following key-value pairs:</p>
         * <ul>
         * <li><p>parseStrategy: the parameter property (0: client IP address. 1: remote host. 2: header. 3: URL parameter)</p>
         * </li>
         * <li><p>fieldName: the header name or URL parameter name. You must specify this key only if parseStrategy is set to 2 or 3</p>
         * </li>
         * <li><p>matchStrategy: the method to match the property value. You must specify this key only if parseStrategy is set to 2 or 3 and the property value is matched. Valid values: 0 (exact match), 2 (regular expression match), and 3 (substring match)</p>
         * </li>
         * <li><p>pattern: the match string. You must specify this key only if parseStrategy is set to 2 or 3 and the property value is matched</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fieldName&quot;:&quot;testKey&quot;,&quot;matchStrategy&quot;:2,&quot;parseStrategy&quot;:2,&quot;pattern&quot;:&quot;testValue&quot;}</p>
         */
        @NameInMap("ParamItem")
        public String paramItem;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the interface resource.</p>
         * 
         * <strong>example:</strong>
         * <p>/flow</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The resource mode. Valid values:</p>
         * <ul>
         * <li>0: resource name mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResourceMode")
        public Integer resourceMode;

        /**
         * <p>The resource type</p>
         * <ul>
         * <li><p>0: custom interface</p>
         * </li>
         * <li><p>1: WEB</p>
         * </li>
         * <li><p>2: RPC</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceType")
        public Integer resourceType;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The length of the time window. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("StatIntervalMs")
        public Integer statIntervalMs;

        /**
         * <p>The threshold.</p>
         * 
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The returned results.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListWebFlowRulesResponseBodyDataResult> result;

        /**
         * <p>The total number of queried rules.</p>
         * 
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
