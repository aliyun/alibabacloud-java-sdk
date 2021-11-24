// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddMockRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public AddMockRuleResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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

        @NameInMap("MockType")
        public Long mockType;

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
