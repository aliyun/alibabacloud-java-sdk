// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class UpdateAuthenticatorAttributeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationExternalId")
    public String applicationExternalId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthenticatorName")
    public String authenticatorName;

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

    public static UpdateAuthenticatorAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthenticatorAttributeRequest self = new UpdateAuthenticatorAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuthenticatorAttributeRequest setApplicationExternalId(String applicationExternalId) {
        this.applicationExternalId = applicationExternalId;
        return this;
    }
    public String getApplicationExternalId() {
        return this.applicationExternalId;
    }

    public UpdateAuthenticatorAttributeRequest setAuthenticatorName(String authenticatorName) {
        this.authenticatorName = authenticatorName;
        return this;
    }
    public String getAuthenticatorName() {
        return this.authenticatorName;
    }

    public UpdateAuthenticatorAttributeRequest setAuthenticatorUuid(String authenticatorUuid) {
        this.authenticatorUuid = authenticatorUuid;
        return this;
    }
    public String getAuthenticatorUuid() {
        return this.authenticatorUuid;
    }

    public UpdateAuthenticatorAttributeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
