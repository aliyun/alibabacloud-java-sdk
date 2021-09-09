// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InstallKibanaSystemPluginRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static InstallKibanaSystemPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallKibanaSystemPluginRequest self = new InstallKibanaSystemPluginRequest();
        return TeaModel.build(map, self);
    }

    public InstallKibanaSystemPluginRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
