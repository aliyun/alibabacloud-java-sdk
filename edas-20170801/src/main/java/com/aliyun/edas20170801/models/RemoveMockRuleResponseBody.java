// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RemoveMockRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RemoveMockRuleResponseBodyData data;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RemoveMockRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveMockRuleResponseBody self = new RemoveMockRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveMockRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveMockRuleResponseBody setData(RemoveMockRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveMockRuleResponseBodyData getData() {
        return this.data;
    }

    public RemoveMockRuleResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public RemoveMockRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveMockRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveMockRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RemoveMockRuleResponseBodyData extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("ConsumerAppId")
        public String consumerAppId;

        @NameInMap("ConsumerAppName")
        public String consumerAppName;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("ExtraJson")
        public String extraJson;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("ProviderAppId")
        public String providerAppId;

        @NameInMap("ProviderAppName")
        public String providerAppName;

        @NameInMap("Region")
        public String region;

        @NameInMap("ScMockItemJson")
        public String scMockItemJson;

        @NameInMap("Source")
        public String source;

        public static RemoveMockRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveMockRuleResponseBodyData self = new RemoveMockRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveMockRuleResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public RemoveMockRuleResponseBodyData setConsumerAppId(String consumerAppId) {
            this.consumerAppId = consumerAppId;
            return this;
        }
        public String getConsumerAppId() {
            return this.consumerAppId;
        }

        public RemoveMockRuleResponseBodyData setConsumerAppName(String consumerAppName) {
            this.consumerAppName = consumerAppName;
            return this;
        }
        public String getConsumerAppName() {
            return this.consumerAppName;
        }

        public RemoveMockRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public RemoveMockRuleResponseBodyData setExtraJson(String extraJson) {
            this.extraJson = extraJson;
            return this;
        }
        public String getExtraJson() {
            return this.extraJson;
        }

        public RemoveMockRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public RemoveMockRuleResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RemoveMockRuleResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public RemoveMockRuleResponseBodyData setProviderAppId(String providerAppId) {
            this.providerAppId = providerAppId;
            return this;
        }
        public String getProviderAppId() {
            return this.providerAppId;
        }

        public RemoveMockRuleResponseBodyData setProviderAppName(String providerAppName) {
            this.providerAppName = providerAppName;
            return this;
        }
        public String getProviderAppName() {
            return this.providerAppName;
        }

        public RemoveMockRuleResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public RemoveMockRuleResponseBodyData setScMockItemJson(String scMockItemJson) {
            this.scMockItemJson = scMockItemJson;
            return this;
        }
        public String getScMockItemJson() {
            return this.scMockItemJson;
        }

        public RemoveMockRuleResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
