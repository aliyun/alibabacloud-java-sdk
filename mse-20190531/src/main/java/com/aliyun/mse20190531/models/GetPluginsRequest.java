// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetPluginsRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>zh: Chinese en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The type of the plug-in. Valid values:</p>
     * <br>
     * <p>*   0: custom</p>
     * <p>*   1: permission authorization</p>
     * <p>*   2: security protection</p>
     * <p>*   3: transmission protocol</p>
     * <p>*   4: traffic control</p>
     * <p>*   5: traffic observation</p>
     */
    @NameInMap("Category")
    public Integer category;

    /**
     * <p>Specifies whether to enable the plug-in.</p>
     */
    @NameInMap("EnableOnly")
    public Boolean enableOnly;

    /**
     * <p>The ID of the gateway.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The name of the plug-in.</p>
     */
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
