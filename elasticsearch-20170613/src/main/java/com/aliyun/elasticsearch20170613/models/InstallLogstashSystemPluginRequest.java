// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InstallLogstashSystemPluginRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static InstallLogstashSystemPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallLogstashSystemPluginRequest self = new InstallLogstashSystemPluginRequest();
        return TeaModel.build(map, self);
    }

    public InstallLogstashSystemPluginRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public InstallLogstashSystemPluginRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
