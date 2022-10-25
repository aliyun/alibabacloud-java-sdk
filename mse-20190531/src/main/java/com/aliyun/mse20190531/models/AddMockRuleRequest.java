// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddMockRuleRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("ConsumerAppIds")
    public String consumerAppIds;

    @NameInMap("DubboMockItems")
    public String dubboMockItems;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("ExtraJson")
    public String extraJson;

    @NameInMap("MockType")
    public Long mockType;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProviderAppId")
    public String providerAppId;

    @NameInMap("ProviderAppName")
    public String providerAppName;

    @NameInMap("Region")
    public String region;

    @NameInMap("ScMockItems")
    public String scMockItems;

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
