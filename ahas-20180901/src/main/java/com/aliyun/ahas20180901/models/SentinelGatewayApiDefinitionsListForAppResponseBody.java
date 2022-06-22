// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayApiDefinitionsListForAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelGatewayApiDefinitionsListForAppResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelGatewayApiDefinitionsListForAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayApiDefinitionsListForAppResponseBody self = new SentinelGatewayApiDefinitionsListForAppResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayApiDefinitionsListForAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelGatewayApiDefinitionsListForAppResponseBody setData(java.util.List<SentinelGatewayApiDefinitionsListForAppResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelGatewayApiDefinitionsListForAppResponseBodyData> getData() {
        return this.data;
    }

    public SentinelGatewayApiDefinitionsListForAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelGatewayApiDefinitionsListForAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelGatewayApiDefinitionsListForAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelGatewayApiDefinitionsListForAppResponseBodyDataApiItems extends TeaModel {
        @NameInMap("matchStrategy")
        public Integer matchStrategy;

        @NameInMap("pattern")
        public String pattern;

        public static SentinelGatewayApiDefinitionsListForAppResponseBodyDataApiItems build(java.util.Map<String, ?> map) throws Exception {
            SentinelGatewayApiDefinitionsListForAppResponseBodyDataApiItems self = new SentinelGatewayApiDefinitionsListForAppResponseBodyDataApiItems();
            return TeaModel.build(map, self);
        }

        public SentinelGatewayApiDefinitionsListForAppResponseBodyDataApiItems setMatchStrategy(Integer matchStrategy) {
            this.matchStrategy = matchStrategy;
            return this;
        }
        public Integer getMatchStrategy() {
            return this.matchStrategy;
        }

        public SentinelGatewayApiDefinitionsListForAppResponseBodyDataApiItems setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

    }

    public static class SentinelGatewayApiDefinitionsListForAppResponseBodyData extends TeaModel {
        @NameInMap("apiCount")
        public Integer apiCount;

        @NameInMap("apiItems")
        public java.util.List<SentinelGatewayApiDefinitionsListForAppResponseBodyDataApiItems> apiItems;

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

        public static SentinelGatewayApiDefinitionsListForAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelGatewayApiDefinitionsListForAppResponseBodyData self = new SentinelGatewayApiDefinitionsListForAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelGatewayApiDefinitionsListForAppResponseBodyData setApiCount(Integer apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Integer getApiCount() {
            return this.apiCount;
        }

        public SentinelGatewayApiDefinitionsListForAppResponseBodyData setApiItems(java.util.List<SentinelGatewayApiDefinitionsListForAppResponseBodyDataApiItems> apiItems) {
            this.apiItems = apiItems;
            return this;
        }
        public java.util.List<SentinelGatewayApiDefinitionsListForAppResponseBodyDataApiItems> getApiItems() {
            return this.apiItems;
        }

        public SentinelGatewayApiDefinitionsListForAppResponseBodyData setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public SentinelGatewayApiDefinitionsListForAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelGatewayApiDefinitionsListForAppResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelGatewayApiDefinitionsListForAppResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelGatewayApiDefinitionsListForAppResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
