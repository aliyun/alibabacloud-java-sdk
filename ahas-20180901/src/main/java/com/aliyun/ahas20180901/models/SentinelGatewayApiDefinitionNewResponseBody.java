// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayApiDefinitionNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelGatewayApiDefinitionNewResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelGatewayApiDefinitionNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayApiDefinitionNewResponseBody self = new SentinelGatewayApiDefinitionNewResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayApiDefinitionNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelGatewayApiDefinitionNewResponseBody setData(SentinelGatewayApiDefinitionNewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelGatewayApiDefinitionNewResponseBodyData getData() {
        return this.data;
    }

    public SentinelGatewayApiDefinitionNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelGatewayApiDefinitionNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelGatewayApiDefinitionNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelGatewayApiDefinitionNewResponseBodyDataApiItems extends TeaModel {
        @NameInMap("matchStrategy")
        public Integer matchStrategy;

        @NameInMap("pattern")
        public String pattern;

        public static SentinelGatewayApiDefinitionNewResponseBodyDataApiItems build(java.util.Map<String, ?> map) throws Exception {
            SentinelGatewayApiDefinitionNewResponseBodyDataApiItems self = new SentinelGatewayApiDefinitionNewResponseBodyDataApiItems();
            return TeaModel.build(map, self);
        }

        public SentinelGatewayApiDefinitionNewResponseBodyDataApiItems setMatchStrategy(Integer matchStrategy) {
            this.matchStrategy = matchStrategy;
            return this;
        }
        public Integer getMatchStrategy() {
            return this.matchStrategy;
        }

        public SentinelGatewayApiDefinitionNewResponseBodyDataApiItems setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

    }

    public static class SentinelGatewayApiDefinitionNewResponseBodyData extends TeaModel {
        @NameInMap("apiCount")
        public Integer apiCount;

        @NameInMap("apiItems")
        public java.util.List<SentinelGatewayApiDefinitionNewResponseBodyDataApiItems> apiItems;

        @NameInMap("apiName")
        public String apiName;

        @NameInMap("appName")
        public String appName;

        @NameInMap("id")
        public Long id;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("userId")
        public String userId;

        public static SentinelGatewayApiDefinitionNewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelGatewayApiDefinitionNewResponseBodyData self = new SentinelGatewayApiDefinitionNewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelGatewayApiDefinitionNewResponseBodyData setApiCount(Integer apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Integer getApiCount() {
            return this.apiCount;
        }

        public SentinelGatewayApiDefinitionNewResponseBodyData setApiItems(java.util.List<SentinelGatewayApiDefinitionNewResponseBodyDataApiItems> apiItems) {
            this.apiItems = apiItems;
            return this;
        }
        public java.util.List<SentinelGatewayApiDefinitionNewResponseBodyDataApiItems> getApiItems() {
            return this.apiItems;
        }

        public SentinelGatewayApiDefinitionNewResponseBodyData setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public SentinelGatewayApiDefinitionNewResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelGatewayApiDefinitionNewResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelGatewayApiDefinitionNewResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelGatewayApiDefinitionNewResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
