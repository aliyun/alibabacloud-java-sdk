// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class GetAuthenticatorRequest extends TeaModel {
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

    public static GetAuthenticatorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthenticatorRequest self = new GetAuthenticatorRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthenticatorRequest setApplicationExternalId(String applicationExternalId) {
        this.applicationExternalId = applicationExternalId;
        return this;
    }
    public String getApplicationExternalId() {
        return this.applicationExternalId;
    }

    public GetAuthenticatorRequest setAuthenticatorUuid(String authenticatorUuid) {
        this.authenticatorUuid = authenticatorUuid;
        return this;
    }
    public String getAuthenticatorUuid() {
        return this.authenticatorUuid;
    }

    public GetAuthenticatorRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
