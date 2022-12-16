// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddMockRuleResponseBody extends TeaModel {
    // The status code returned.
    @NameInMap("Code")
    public Integer code;

    // The details of the data.
    @NameInMap("Data")
    public AddMockRuleResponseBodyData data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // - `true`: The request is successful. 
    // - `false`: The request fails.
    @NameInMap("Success")
    public Boolean success;

    public static AddMockRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMockRuleResponseBody self = new AddMockRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMockRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddMockRuleResponseBody setData(AddMockRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddMockRuleResponseBodyData getData() {
        return this.data;
    }

    public AddMockRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddMockRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddMockRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMockRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddMockRuleResponseBodyData extends TeaModel {
        // The ID of the Alibaba Cloud account.
        @NameInMap("AccountId")
        public String accountId;

        // The ID of the consumer application.
        @NameInMap("ConsumerAppId")
        public String consumerAppId;

        // The name of the consumer application.
        @NameInMap("ConsumerAppName")
        public String consumerAppName;

        // Indicates whether the rule is enabled. 
        // 
        // - `true`: enabled 
        // - `false`: disabled
        @NameInMap("Enable")
        public Boolean enable;

        // The description.
        @NameInMap("ExtraJson")
        public String extraJson;

        // The ID of the rule.
        @NameInMap("Id")
        public Long id;

        // The type of the model. Valid values:
        // 
        // - `[unk]0[unk]`: desktop client
        // - `[unk]1[unk]`: mobile client
        @NameInMap("MockType")
        public Long mockType;

        // The name of the rule.
        @NameInMap("Name")
        public String name;

        // The ID of the namespace.
        @NameInMap("NamespaceId")
        public String namespaceId;

        // The ID of the service provider application.
        @NameInMap("ProviderAppId")
        public String providerAppId;

        // The name of the service provider application.
        @NameInMap("ProviderAppName")
        public String providerAppName;

        // The ID of the region.
        @NameInMap("Region")
        public String region;

        // The HTTP mock rule.
        @NameInMap("ScMockItemJson")
        public String scMockItemJson;

        // The source.
        @NameInMap("Source")
        public String source;

        public static AddMockRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddMockRuleResponseBodyData self = new AddMockRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddMockRuleResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public AddMockRuleResponseBodyData setConsumerAppId(String consumerAppId) {
            this.consumerAppId = consumerAppId;
            return this;
        }
        public String getConsumerAppId() {
            return this.consumerAppId;
        }

        public AddMockRuleResponseBodyData setConsumerAppName(String consumerAppName) {
            this.consumerAppName = consumerAppName;
            return this;
        }
        public String getConsumerAppName() {
            return this.consumerAppName;
        }

        public AddMockRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public AddMockRuleResponseBodyData setExtraJson(String extraJson) {
            this.extraJson = extraJson;
            return this;
        }
        public String getExtraJson() {
            return this.extraJson;
        }

        public AddMockRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AddMockRuleResponseBodyData setMockType(Long mockType) {
            this.mockType = mockType;
            return this;
        }
        public Long getMockType() {
            return this.mockType;
        }

        public AddMockRuleResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddMockRuleResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public AddMockRuleResponseBodyData setProviderAppId(String providerAppId) {
            this.providerAppId = providerAppId;
            return this;
        }
        public String getProviderAppId() {
            return this.providerAppId;
        }

        public AddMockRuleResponseBodyData setProviderAppName(String providerAppName) {
            this.providerAppName = providerAppName;
            return this;
        }
        public String getProviderAppName() {
            return this.providerAppName;
        }

        public AddMockRuleResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public AddMockRuleResponseBodyData setScMockItemJson(String scMockItemJson) {
            this.scMockItemJson = scMockItemJson;
            return this;
        }
        public String getScMockItemJson() {
            return this.scMockItemJson;
        }

        public AddMockRuleResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
