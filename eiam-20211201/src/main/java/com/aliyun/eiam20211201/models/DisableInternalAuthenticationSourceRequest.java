// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableInternalAuthenticationSourceRequest extends TeaModel {
    /**
     * <p>The ID of the internal authentication source.</p>
     * 
     * <strong>example:</strong>
     * <p>ia_password</p>
     */
    @NameInMap("AuthenticationSourceId")
    public String authenticationSourceId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_111xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DisableInternalAuthenticationSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableInternalAuthenticationSourceRequest self = new DisableInternalAuthenticationSourceRequest();
        return TeaModel.build(map, self);
    }

    public DisableInternalAuthenticationSourceRequest setAuthenticationSourceId(String authenticationSourceId) {
        this.authenticationSourceId = authenticationSourceId;
        return this;
    }
    public String getAuthenticationSourceId() {
        return this.authenticationSourceId;
    }

    public DisableInternalAuthenticationSourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
