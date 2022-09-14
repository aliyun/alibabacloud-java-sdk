// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetPluginsRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Category")
    public Integer category;

    @NameInMap("EnableOnly")
    public Boolean enableOnly;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("MseSessionId")
    public String mseSessionId;

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

    public GetPluginsRequest setMseSessionId(String mseSessionId) {
        this.mseSessionId = mseSessionId;
        return this;
    }
    public String getMseSessionId() {
        return this.mseSessionId;
    }

    public GetPluginsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
