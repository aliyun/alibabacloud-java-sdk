// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ActivateZonesRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static ActivateZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateZonesRequest self = new ActivateZonesRequest();
        return TeaModel.build(map, self);
    }

    public ActivateZonesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
