// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddMockRuleRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the custom application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;appName\&quot;:\&quot;provide\&quot;,\&quot;appId\&quot;:\&quot;bst8l6o735@f6d8aaf6e56e67d\&quot;}]</p>
     */
    @NameInMap("ConsumerAppIds")
    public String consumerAppIds;

    /**
     * <p>The items in the recycle bin.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("DubboMockItems")
    public String dubboMockItems;

    /**
     * <p>Specifies whether to enable the alert rule. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enables the alert rule.</li>
     * <li><code>false</code>: disables the alert rule.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The description.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtraJson")
    public String extraJson;

    /**
     * <p>The response time (RT) threshold of slow calls. Valid values:</p>
     * <ul>
     * <li>\- 15: 15 ms</li>
     * <li>\- 30: 30 ms</li>
     * <li>\- 60: 60 ms</li>
     * <li>\- 120: 120 ms</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MockType")
    public Long mockType;

    /**
     * <p>The name of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-auto-test-sc</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the service provider application.</p>
     * 
     * <strong>example:</strong>
     * <p>dcqtkuhnc4@66e5235415****</p>
     */
    @NameInMap("ProviderAppId")
    public String providerAppId;

    /**
     * <p>The name of the service provider application.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-cartservice</p>
     */
    @NameInMap("ProviderAppName")
    public String providerAppName;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The input parameters. The JSON format is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("ScMockItems")
    public String scMockItems;

    /**
     * <p>The rule source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>edasmsc</p>
     */
    @NameInMap("Source")
    public String source;

    public static AddMockRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMockRuleRequest self = new AddMockRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddMockRuleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddMockRuleRequest setConsumerAppIds(String consumerAppIds) {
        this.consumerAppIds = consumerAppIds;
        return this;
    }
    public String getConsumerAppIds() {
        return this.consumerAppIds;
    }

    public AddMockRuleRequest setDubboMockItems(String dubboMockItems) {
        this.dubboMockItems = dubboMockItems;
        return this;
    }
    public String getDubboMockItems() {
        return this.dubboMockItems;
    }

    public AddMockRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public AddMockRuleRequest setExtraJson(String extraJson) {
        this.extraJson = extraJson;
        return this;
    }
    public String getExtraJson() {
        return this.extraJson;
    }

    public AddMockRuleRequest setMockType(Long mockType) {
        this.mockType = mockType;
        return this;
    }
    public Long getMockType() {
        return this.mockType;
    }

    public AddMockRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddMockRuleRequest setProviderAppId(String providerAppId) {
        this.providerAppId = providerAppId;
        return this;
    }
    public String getProviderAppId() {
        return this.providerAppId;
    }

    public AddMockRuleRequest setProviderAppName(String providerAppName) {
        this.providerAppName = providerAppName;
        return this;
    }
    public String getProviderAppName() {
        return this.providerAppName;
    }

    public AddMockRuleRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddMockRuleRequest setScMockItems(String scMockItems) {
        this.scMockItems = scMockItems;
        return this;
    }
    public String getScMockItems() {
        return this.scMockItems;
    }

    public AddMockRuleRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
