// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayZoneRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    public static ListGatewayZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayZoneRequest self = new ListGatewayZoneRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayZoneRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

}
