// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetPluginsRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <p>zh: Chinese en: English</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The type of the plug-in. Valid values:</p>
     * <ul>
     * <li>0: custom</li>
     * <li>1: permission authorization</li>
     * <li>2: security protection</li>
     * <li>3: transmission protocol</li>
     * <li>4: traffic control</li>
     * <li>5: traffic observation</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Category")
    public Integer category;

    /**
     * <p>Specifies whether to enable the plug-in.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableOnly")
    public Boolean enableOnly;

    /**
     * <p>The ID of the gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-0adf3ad751284cc69fcf9669fba*****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The name of the plug-in.</p>
     * 
     * <strong>example:</strong>
     * <p>key-auth</p>
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
