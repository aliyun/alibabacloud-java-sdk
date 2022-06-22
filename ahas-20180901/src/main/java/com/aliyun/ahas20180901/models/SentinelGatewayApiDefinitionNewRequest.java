// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayApiDefinitionNewRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ApiItems")
    public String apiItems;

    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelGatewayApiDefinitionNewRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayApiDefinitionNewRequest self = new SentinelGatewayApiDefinitionNewRequest();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayApiDefinitionNewRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelGatewayApiDefinitionNewRequest setApiItems(String apiItems) {
        this.apiItems = apiItems;
        return this;
    }
    public String getApiItems() {
        return this.apiItems;
    }

    public SentinelGatewayApiDefinitionNewRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public SentinelGatewayApiDefinitionNewRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelGatewayApiDefinitionNewRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelGatewayApiDefinitionNewRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
