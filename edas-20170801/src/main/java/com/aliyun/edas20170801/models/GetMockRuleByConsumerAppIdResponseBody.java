// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetMockRuleByConsumerAppIdResponseBody extends TeaModel {
    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetMockRuleByConsumerAppIdResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetMockRuleByConsumerAppIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMockRuleByConsumerAppIdResponseBody self = new GetMockRuleByConsumerAppIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMockRuleByConsumerAppIdResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public GetMockRuleByConsumerAppIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMockRuleByConsumerAppIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMockRuleByConsumerAppIdResponseBody setData(java.util.List<GetMockRuleByConsumerAppIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetMockRuleByConsumerAppIdResponseBodyData> getData() {
        return this.data;
    }

    public GetMockRuleByConsumerAppIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMockRuleByConsumerAppIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMockRuleByConsumerAppIdResponseBodyData extends TeaModel {
        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("ScMockItemJson")
        public String scMockItemJson;

        @NameInMap("ConsumerAppName")
        public String consumerAppName;

        @NameInMap("ConsumerAppId")
        public String consumerAppId;

        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("ExtraJson")
        public String extraJson;

        @NameInMap("Source")
        public String source;

        @NameInMap("Region")
        public String region;

        @NameInMap("ProviderAppId")
        public String providerAppId;

        @NameInMap("ProviderAppName")
        public String providerAppName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Enable")
        public Boolean enable;

        public static GetMockRuleByConsumerAppIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMockRuleByConsumerAppIdResponseBodyData self = new GetMockRuleByConsumerAppIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMockRuleByConsumerAppIdResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public GetMockRuleByConsumerAppIdResponseBodyData setScMockItemJson(String scMockItemJson) {
            this.scMockItemJson = scMockItemJson;
            return this;
        }
        public String getScMockItemJson() {
            return this.scMockItemJson;
        }

        public GetMockRuleByConsumerAppIdResponseBodyData setConsumerAppName(String consumerAppName) {
            this.consumerAppName = consumerAppName;
            return this;
        }
        public String getConsumerAppName() {
            return this.consumerAppName;
        }

        public GetMockRuleByConsumerAppIdResponseBodyData setConsumerAppId(String consumerAppId) {
            this.consumerAppId = consumerAppId;
            return this;
        }
        public String getConsumerAppId() {
            return this.consumerAppId;
        }

        public GetMockRuleByConsumerAppIdResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetMockRuleByConsumerAppIdResponseBodyData setExtraJson(String extraJson) {
            this.extraJson = extraJson;
            return this;
        }
        public String getExtraJson() {
            return this.extraJson;
        }

        public GetMockRuleByConsumerAppIdResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetMockRuleByConsumerAppIdResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetMockRuleByConsumerAppIdResponseBodyData setProviderAppId(String providerAppId) {
            this.providerAppId = providerAppId;
            return this;
        }
        public String getProviderAppId() {
            return this.providerAppId;
        }

        public GetMockRuleByConsumerAppIdResponseBodyData setProviderAppName(String providerAppName) {
            this.providerAppName = providerAppName;
            return this;
        }
        public String getProviderAppName() {
            return this.providerAppName;
        }

        public GetMockRuleByConsumerAppIdResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMockRuleByConsumerAppIdResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMockRuleByConsumerAppIdResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
