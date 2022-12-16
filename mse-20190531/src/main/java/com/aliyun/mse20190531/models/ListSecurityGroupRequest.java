// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListSecurityGroupRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // - zh: Chinese
    // - en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the gateway.
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    public static ListSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityGroupRequest self = new ListSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListSecurityGroupRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListSecurityGroupRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

}
