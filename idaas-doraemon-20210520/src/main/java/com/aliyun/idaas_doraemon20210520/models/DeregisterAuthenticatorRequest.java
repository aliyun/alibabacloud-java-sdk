// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class DeregisterAuthenticatorRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationExternalId")
    public String applicationExternalId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthenticatorUuid")
    public String authenticatorUuid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DeregisterAuthenticatorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeregisterAuthenticatorRequest self = new DeregisterAuthenticatorRequest();
        return TeaModel.build(map, self);
    }

    public DeregisterAuthenticatorRequest setApplicationExternalId(String applicationExternalId) {
        this.applicationExternalId = applicationExternalId;
        return this;
    }
    public String getApplicationExternalId() {
        return this.applicationExternalId;
    }

    public DeregisterAuthenticatorRequest setAuthenticatorUuid(String authenticatorUuid) {
        this.authenticatorUuid = authenticatorUuid;
        return this;
    }
    public String getAuthenticatorUuid() {
        return this.authenticatorUuid;
    }

    public DeregisterAuthenticatorRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
