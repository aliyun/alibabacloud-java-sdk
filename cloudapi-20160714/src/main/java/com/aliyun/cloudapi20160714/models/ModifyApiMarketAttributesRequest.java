// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiMarketAttributesRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("NeedCharging")
    public Boolean needCharging;

    @NameInMap("MarketChargingMode")
    public String marketChargingMode;

    public static ModifyApiMarketAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiMarketAttributesRequest self = new ModifyApiMarketAttributesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApiMarketAttributesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyApiMarketAttributesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyApiMarketAttributesRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public ModifyApiMarketAttributesRequest setNeedCharging(Boolean needCharging) {
        this.needCharging = needCharging;
        return this;
    }
    public Boolean getNeedCharging() {
        return this.needCharging;
    }

    public ModifyApiMarketAttributesRequest setMarketChargingMode(String marketChargingMode) {
        this.marketChargingMode = marketChargingMode;
        return this;
    }
    public String getMarketChargingMode() {
        return this.marketChargingMode;
    }

}
