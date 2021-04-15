// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddMockRuleRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Region")
    public String region;

    @NameInMap("Source")
    public String source;

    @NameInMap("ProviderAppId")
    public String providerAppId;

    @NameInMap("ProviderAppName")
    public String providerAppName;

    @NameInMap("ExtraJson")
    public String extraJson;

    @NameInMap("ScMockItems")
    public String scMockItems;

    @NameInMap("DubboMockItems")
    public String dubboMockItems;

    @NameInMap("ConsumerAppIds")
    public String consumerAppIds;

    @NameInMap("Enable")
    public Boolean enable;

    public static AddMockRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMockRuleRequest self = new AddMockRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddMockRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddMockRuleRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddMockRuleRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
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

    public AddMockRuleRequest setExtraJson(String extraJson) {
        this.extraJson = extraJson;
        return this;
    }
    public String getExtraJson() {
        return this.extraJson;
    }

    public AddMockRuleRequest setScMockItems(String scMockItems) {
        this.scMockItems = scMockItems;
        return this;
    }
    public String getScMockItems() {
        return this.scMockItems;
    }

    public AddMockRuleRequest setDubboMockItems(String dubboMockItems) {
        this.dubboMockItems = dubboMockItems;
        return this;
    }
    public String getDubboMockItems() {
        return this.dubboMockItems;
    }

    public AddMockRuleRequest setConsumerAppIds(String consumerAppIds) {
        this.consumerAppIds = consumerAppIds;
        return this;
    }
    public String getConsumerAppIds() {
        return this.consumerAppIds;
    }

    public AddMockRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

}
