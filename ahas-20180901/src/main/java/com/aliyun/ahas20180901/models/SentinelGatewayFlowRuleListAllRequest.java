// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayFlowRuleListAllRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelGatewayFlowRuleListAllRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayFlowRuleListAllRequest self = new SentinelGatewayFlowRuleListAllRequest();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayFlowRuleListAllRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelGatewayFlowRuleListAllRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelGatewayFlowRuleListAllRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelGatewayFlowRuleListAllRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
