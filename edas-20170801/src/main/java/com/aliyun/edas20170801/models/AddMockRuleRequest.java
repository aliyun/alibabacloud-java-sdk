// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

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

    @NameInMap("ScMockItemJson")
    public String scMockItemJson;

    @NameInMap("DubboMockItemJson")
    public String dubboMockItemJson;

    @NameInMap("ConsumerAppsJson")
    public String consumerAppsJson;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("Namespace")
    public String namespace;

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

    public AddMockRuleRequest setScMockItemJson(String scMockItemJson) {
        this.scMockItemJson = scMockItemJson;
        return this;
    }
    public String getScMockItemJson() {
        return this.scMockItemJson;
    }

    public AddMockRuleRequest setDubboMockItemJson(String dubboMockItemJson) {
        this.dubboMockItemJson = dubboMockItemJson;
        return this;
    }
    public String getDubboMockItemJson() {
        return this.dubboMockItemJson;
    }

    public AddMockRuleRequest setConsumerAppsJson(String consumerAppsJson) {
        this.consumerAppsJson = consumerAppsJson;
        return this;
    }
    public String getConsumerAppsJson() {
        return this.consumerAppsJson;
    }

    public AddMockRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public AddMockRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
