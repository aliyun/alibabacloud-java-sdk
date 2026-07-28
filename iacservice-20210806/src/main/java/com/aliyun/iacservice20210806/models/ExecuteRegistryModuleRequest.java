// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ExecuteRegistryModuleRequest extends TeaModel {
    /**
     * <p>The idempotency token. Format: [0-9a-zA-Z-]{1,64}. We recommend that you use a UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The set of parameters used by the template.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;region\&quot;: \&quot;cn-hangzhou\&quot;, \&quot;vpcId\&quot;: \&quot;vpc-bp145sc90s26q0qbkfb6i\&quot;, \&quot;functionName\&quot;: \&quot;filemgr-cn-hangzhou-063fd4aead\&quot;, \&quot;mountPointsServerAddr\&quot;: \&quot;063fd4aead-dex50.cn-hangzhou.nas.aliyuncs.com\&quot;}</p>
     */
    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    public static ExecuteRegistryModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRegistryModuleRequest self = new ExecuteRegistryModuleRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteRegistryModuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ExecuteRegistryModuleRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

}
