// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableInternalAuthenticationSourceRequest extends TeaModel {
    /**
     * <p>内部认证源ID，比如 ia_password, ia_otp_sms 等</p>
     * 
     * <strong>example:</strong>
     * <p>ia_password</p>
     */
    @NameInMap("AuthenticationSourceId")
    public String authenticationSourceId;

    /**
     * <p>IDaaS EIAM的实例id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_111ccc11xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static EnableInternalAuthenticationSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableInternalAuthenticationSourceRequest self = new EnableInternalAuthenticationSourceRequest();
        return TeaModel.build(map, self);
    }

    public EnableInternalAuthenticationSourceRequest setAuthenticationSourceId(String authenticationSourceId) {
        this.authenticationSourceId = authenticationSourceId;
        return this;
    }
    public String getAuthenticationSourceId() {
        return this.authenticationSourceId;
    }

    public EnableInternalAuthenticationSourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
