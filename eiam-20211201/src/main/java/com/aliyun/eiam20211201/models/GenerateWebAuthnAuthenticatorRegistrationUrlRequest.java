// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GenerateWebAuthnAuthenticatorRegistrationUrlRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dm_nfplcagj5cguo2267bkjxxxx</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>UserID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_e2jvisn35ea5lmthk267xx</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GenerateWebAuthnAuthenticatorRegistrationUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateWebAuthnAuthenticatorRegistrationUrlRequest self = new GenerateWebAuthnAuthenticatorRegistrationUrlRequest();
        return TeaModel.build(map, self);
    }

    public GenerateWebAuthnAuthenticatorRegistrationUrlRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public GenerateWebAuthnAuthenticatorRegistrationUrlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GenerateWebAuthnAuthenticatorRegistrationUrlRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
