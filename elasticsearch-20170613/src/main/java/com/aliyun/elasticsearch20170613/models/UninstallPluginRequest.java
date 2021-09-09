// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UninstallPluginRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static UninstallPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallPluginRequest self = new UninstallPluginRequest();
        return TeaModel.build(map, self);
    }

    public UninstallPluginRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
