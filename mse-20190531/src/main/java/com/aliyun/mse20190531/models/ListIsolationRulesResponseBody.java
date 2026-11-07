// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListIsolationRulesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the rule.</p>
     */
    @NameInMap("Data")
    public ListIsolationRulesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
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
     * <p>4E9FDCFE-0738-493B-B801-82BDFBCB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListIsolationRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIsolationRulesResponseBody self = new ListIsolationRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIsolationRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListIsolationRulesResponseBody setData(ListIsolationRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListIsolationRulesResponseBodyData getData() {
        return this.data;
    }

    public ListIsolationRulesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListIsolationRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIsolationRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIsolationRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListIsolationRulesResponseBodyDataResult extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hkhon1po62@c3df23522bXXXXX</p>
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
         * <p>Indicates whether the rule is enabled.</p>
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
         * <p>&quot;{\&quot;appName\&quot;:\&quot;spring-cloud-a\&quot;,\&quot;fallbackBehavior\&quot;:{\&quot;webFallbackMode\&quot;:0,\&quot;webRespContentType\&quot;:0,\&quot;webRespMessage\&quot;:\&quot;Blocked\&quot;,\&quot;webRespStatusCode\&quot;:429},\&quot;id\&quot;:977,\&quot;name\&quot;:\&quot;Fallback\&quot;,\&quot;namespace\&quot;:\&quot;default\&quot;,\&quot;resourceClassification\&quot;:1}&quot;</p>
         */
        @NameInMap("FallbackObject")
        public String fallbackObject;

        /**
         * <p>The source application of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>spring-cloud-a</p>
         */
        @NameInMap("LimitApp")
        public String limitApp;

        /**
         * <p>The microservice namespace to which the application belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The region in which the cluster resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the interface to which the rule applies. The interface name must be the same as the name on the interface details page in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>/a</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The concurrency threshold for isolation rules.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Threshold")
        public Integer threshold;

        public static ListIsolationRulesResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListIsolationRulesResponseBodyDataResult self = new ListIsolationRulesResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListIsolationRulesResponseBodyDataResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListIsolationRulesResponseBodyDataResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListIsolationRulesResponseBodyDataResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListIsolationRulesResponseBodyDataResult setFallbackObject(String fallbackObject) {
            this.fallbackObject = fallbackObject;
            return this;
        }
        public String getFallbackObject() {
            return this.fallbackObject;
        }

        public ListIsolationRulesResponseBodyDataResult setLimitApp(String limitApp) {
            this.limitApp = limitApp;
            return this;
        }
        public String getLimitApp() {
            return this.limitApp;
        }

        public ListIsolationRulesResponseBodyDataResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListIsolationRulesResponseBodyDataResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListIsolationRulesResponseBodyDataResult setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ListIsolationRulesResponseBodyDataResult setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListIsolationRulesResponseBodyDataResult setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

    }

    public static class ListIsolationRulesResponseBodyData extends TeaModel {
        /**
         * <p>The first page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
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
        public java.util.List<ListIsolationRulesResponseBodyDataResult> result;

        /**
         * <p>The total number of rules.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListIsolationRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIsolationRulesResponseBodyData self = new ListIsolationRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIsolationRulesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListIsolationRulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListIsolationRulesResponseBodyData setResult(java.util.List<ListIsolationRulesResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListIsolationRulesResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListIsolationRulesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
