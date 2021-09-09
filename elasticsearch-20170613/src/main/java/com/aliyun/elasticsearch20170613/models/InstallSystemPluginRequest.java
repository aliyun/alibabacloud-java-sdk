// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InstallSystemPluginRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static InstallSystemPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallSystemPluginRequest self = new InstallSystemPluginRequest();
        return TeaModel.build(map, self);
    }

    public InstallSystemPluginRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
