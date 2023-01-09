// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddMockRuleRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the custom application.
    @NameInMap("ConsumerAppIds")
    public String consumerAppIds;

    // The items in the recycle bin.
    @NameInMap("DubboMockItems")
    public String dubboMockItems;

    // Specifies whether to enable the alert rule. Valid values:
    // 
    // *   `true`: enables the alert rule.
    // *   `false`: disables the alert rule.
    @NameInMap("Enable")
    public Boolean enable;

    // The description.
    @NameInMap("ExtraJson")
    public String extraJson;

    // The response time (RT) threshold of slow calls. Valid values:
    // 
    // *   \- 15: 15 ms
    // *   \- 30: 30 ms
    // *   \- 60: 60 ms
    // *   \- 120: 120 ms
    @NameInMap("MockType")
    public Long mockType;

    // The name of the rule.
    @NameInMap("Name")
    public String name;

    // The ID of the service provider application.
    @NameInMap("ProviderAppId")
    public String providerAppId;

    // The name of the service provider application.
    @NameInMap("ProviderAppName")
    public String providerAppName;

    // The ID of the region.
    @NameInMap("Region")
    public String region;

    // The input parameters. The JSON format is supported.
    @NameInMap("ScMockItems")
    public String scMockItems;

    // The rule source.
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
