// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddMockRuleRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the custom application.</p>
     */
    @NameInMap("ConsumerAppIds")
    public String consumerAppIds;

    /**
     * <p>The items in the recycle bin.</p>
     */
    @NameInMap("DubboMockItems")
    public String dubboMockItems;

    /**
     * <p>Specifies whether to enable the alert rule. Valid values:</p>
     * <br>
     * <p>*   `true`: enables the alert rule.</p>
     * <p>*   `false`: disables the alert rule.</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The description.</p>
     */
    @NameInMap("ExtraJson")
    public String extraJson;

    /**
     * <p>The response time (RT) threshold of slow calls. Valid values:</p>
     * <br>
     * <p>*   \- 15: 15 ms</p>
     * <p>*   \- 30: 30 ms</p>
     * <p>*   \- 60: 60 ms</p>
     * <p>*   \- 120: 120 ms</p>
     */
    @NameInMap("MockType")
    public Long mockType;

    /**
     * <p>The name of the rule.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the service provider application.</p>
     */
    @NameInMap("ProviderAppId")
    public String providerAppId;

    /**
     * <p>The name of the service provider application.</p>
     */
    @NameInMap("ProviderAppName")
    public String providerAppName;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The input parameters. The JSON format is supported.</p>
     */
    @NameInMap("ScMockItems")
    public String scMockItems;

    /**
     * <p>The rule source.</p>
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
