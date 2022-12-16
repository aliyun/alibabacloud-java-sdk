// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetPluginsRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // zh: Chinese en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The plug-in directory.
    // 
    // *   0: user-defined
    // *   1: permission authentication
    // *   2: security protection
    // *   3: transmission protocol
    // *   4: traffic control
    // *   5: traffic observation
    @NameInMap("Category")
    public Integer category;

    // Specifies whether to enable the plug-in.
    @NameInMap("EnableOnly")
    public Boolean enableOnly;

    // The ID of the gateway.
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // The name of the plug-in.
    @NameInMap("Name")
    public String name;

    public static GetPluginsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPluginsRequest self = new GetPluginsRequest();
        return TeaModel.build(map, self);
    }

    public GetPluginsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetPluginsRequest setCategory(Integer category) {
        this.category = category;
        return this;
    }
    public Integer getCategory() {
        return this.category;
    }

    public GetPluginsRequest setEnableOnly(Boolean enableOnly) {
        this.enableOnly = enableOnly;
        return this;
    }
    public Boolean getEnableOnly() {
        return this.enableOnly;
    }

    public GetPluginsRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public GetPluginsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
