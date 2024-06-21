// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddMockRuleResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public AddMockRuleResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The request is successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>316F5F64-F73D-42DC-8632-01E308B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>178432728867xxxx</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The ID of the consumer application.</p>
         * 
         * <strong>example:</strong>
         * <p>hkhon1po62@a000601b265xxxx</p>
         */
        @NameInMap("ConsumerAppId")
        public String consumerAppId;

        /**
         * <p>The name of the consumer application.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-xxxx</p>
         */
        @NameInMap("ConsumerAppName")
        public String consumerAppName;

        /**
         * <p>Indicates whether the mock rule is enabled.</p>
         * <ul>
         * <li><code>true</code>: enabled</li>
         * <li><code>false</code>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("ExtraJson")
        public String extraJson;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>275</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The mock type. Valid values:</p>
         * <ul>
         * <li>\- <code>[unk]0[unk]</code>: desktop client</li>
         * <li>\- <code>[unk]1[unk]</code>: mobile client</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MockType")
        public Long mockType;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-bc1a29b0-160230875****-reg-center-0-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The ID of the service provider application.</p>
         * 
         * <strong>example:</strong>
         * <p>hkhon1po62@a000601b265xxxx</p>
         */
        @NameInMap("ProviderAppId")
        public String providerAppId;

        /**
         * <p>The name of the service provider application.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-xxxx</p>
         */
        @NameInMap("ProviderAppName")
        public String providerAppName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The HTTP mock rule.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;oper&quot;:&quot;return+json&quot;,&quot;Path&quot;:&quot;/mock&quot;,&quot;Value&quot;:&quot;{\n \&quot;date\&quot;: \&quot;2021-09-10T07:45:12.357+0000\&quot;,\n \&quot;name\&quot;: \&quot;name\&quot;,\n \&quot;id\&quot;: \&quot;1\&quot;\n}&quot;,&quot;Method&quot;:&quot;GET&quot;,&quot;Condition&quot;:&quot;AND&quot;,&quot;Timeout&quot;:1,&quot;ArgumentMockItems&quot;:[{&quot;type&quot;:&quot;param&quot;,&quot;name&quot;:&quot;id&quot;,&quot;value&quot;:&quot;1&quot;,&quot;cond&quot;:&quot;==&quot;,&quot;operator&quot;:&quot;rawvalue&quot;},{&quot;type&quot;:&quot;param&quot;,&quot;name&quot;:&quot;name&quot;,&quot;value&quot;:&quot;aliyun&quot;,&quot;cond&quot;:&quot;==&quot;,&quot;operator&quot;:&quot;rawvalue&quot;}]}]</p>
         */
        @NameInMap("ScMockItemJson")
        public String scMockItemJson;

        /**
         * <p>The service source.</p>
         * 
         * <strong>example:</strong>
         * <p>edasmsc</p>
         */
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
