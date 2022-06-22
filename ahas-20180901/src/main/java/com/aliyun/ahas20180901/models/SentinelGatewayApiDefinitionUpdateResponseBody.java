// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayApiDefinitionUpdateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelGatewayApiDefinitionUpdateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelGatewayApiDefinitionUpdateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayApiDefinitionUpdateResponseBody self = new SentinelGatewayApiDefinitionUpdateResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayApiDefinitionUpdateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelGatewayApiDefinitionUpdateResponseBody setData(SentinelGatewayApiDefinitionUpdateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelGatewayApiDefinitionUpdateResponseBodyData getData() {
        return this.data;
    }

    public SentinelGatewayApiDefinitionUpdateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelGatewayApiDefinitionUpdateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelGatewayApiDefinitionUpdateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelGatewayApiDefinitionUpdateResponseBodyDataApiItems extends TeaModel {
        @NameInMap("matchStrategy")
        public Integer matchStrategy;

        @NameInMap("pattern")
        public String pattern;

        public static SentinelGatewayApiDefinitionUpdateResponseBodyDataApiItems build(java.util.Map<String, ?> map) throws Exception {
            SentinelGatewayApiDefinitionUpdateResponseBodyDataApiItems self = new SentinelGatewayApiDefinitionUpdateResponseBodyDataApiItems();
            return TeaModel.build(map, self);
        }

        public SentinelGatewayApiDefinitionUpdateResponseBodyDataApiItems setMatchStrategy(Integer matchStrategy) {
            this.matchStrategy = matchStrategy;
            return this;
        }
        public Integer getMatchStrategy() {
            return this.matchStrategy;
        }

        public SentinelGatewayApiDefinitionUpdateResponseBodyDataApiItems setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

    }

    public static class SentinelGatewayApiDefinitionUpdateResponseBodyData extends TeaModel {
        @NameInMap("apiCount")
        public Integer apiCount;

        @NameInMap("apiItems")
        public java.util.List<SentinelGatewayApiDefinitionUpdateResponseBodyDataApiItems> apiItems;

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

        public static SentinelGatewayApiDefinitionUpdateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelGatewayApiDefinitionUpdateResponseBodyData self = new SentinelGatewayApiDefinitionUpdateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelGatewayApiDefinitionUpdateResponseBodyData setApiCount(Integer apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Integer getApiCount() {
            return this.apiCount;
        }

        public SentinelGatewayApiDefinitionUpdateResponseBodyData setApiItems(java.util.List<SentinelGatewayApiDefinitionUpdateResponseBodyDataApiItems> apiItems) {
            this.apiItems = apiItems;
            return this;
        }
        public java.util.List<SentinelGatewayApiDefinitionUpdateResponseBodyDataApiItems> getApiItems() {
            return this.apiItems;
        }

        public SentinelGatewayApiDefinitionUpdateResponseBodyData setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public SentinelGatewayApiDefinitionUpdateResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelGatewayApiDefinitionUpdateResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelGatewayApiDefinitionUpdateResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelGatewayApiDefinitionUpdateResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
