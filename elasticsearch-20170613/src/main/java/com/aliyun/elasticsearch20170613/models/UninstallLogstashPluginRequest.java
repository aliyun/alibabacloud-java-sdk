// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UninstallLogstashPluginRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[&quot;logstash-input-datahub&quot;, &quot;logstash-input-maxcompute&quot; ]</p>
     */
    @NameInMap("body")
    public java.util.List<String> body;

    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UninstallLogstashPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallLogstashPluginRequest self = new UninstallLogstashPluginRequest();
        return TeaModel.build(map, self);
    }

    public UninstallLogstashPluginRequest setBody(java.util.List<String> body) {
        this.body = body;
        return this;
    }
    public java.util.List<String> getBody() {
        return this.body;
    }

    public UninstallLogstashPluginRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
