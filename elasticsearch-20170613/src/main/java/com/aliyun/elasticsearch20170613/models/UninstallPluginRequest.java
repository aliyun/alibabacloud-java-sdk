// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UninstallPluginRequest extends TeaModel {
    /**
     * <p>The names of the system plug-ins to uninstall.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;aliyun-sql&quot;,&quot;codec-compression&quot;]</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to forcibly uninstall the plug-ins. You can use this parameter to cancel the installation of plug-ins that are being installed. This parameter is only applicable to instances that use the new architecture. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("force")
    public Boolean force;

    public static UninstallPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallPluginRequest self = new UninstallPluginRequest();
        return TeaModel.build(map, self);
    }

    public UninstallPluginRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UninstallPluginRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UninstallPluginRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
