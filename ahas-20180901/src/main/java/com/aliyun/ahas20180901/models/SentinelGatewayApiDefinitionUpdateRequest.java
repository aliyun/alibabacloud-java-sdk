// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayApiDefinitionUpdateRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ApiItems")
    public String apiItems;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelGatewayApiDefinitionUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayApiDefinitionUpdateRequest self = new SentinelGatewayApiDefinitionUpdateRequest();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayApiDefinitionUpdateRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelGatewayApiDefinitionUpdateRequest setApiItems(String apiItems) {
        this.apiItems = apiItems;
        return this;
    }
    public String getApiItems() {
        return this.apiItems;
    }

    public SentinelGatewayApiDefinitionUpdateRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelGatewayApiDefinitionUpdateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SentinelGatewayApiDefinitionUpdateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelGatewayApiDefinitionUpdateRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
