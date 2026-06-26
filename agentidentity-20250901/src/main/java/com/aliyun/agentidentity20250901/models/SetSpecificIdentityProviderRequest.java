// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class SetSpecificIdentityProviderRequest extends TeaModel {
    @NameInMap("IDPMetadata")
    public String IDPMetadata;

    @NameInMap("IdentityProviderType")
    public String identityProviderType;

    @NameInMap("SSOStatus")
    public String SSOStatus;

    @NameInMap("UserPoolName")
    public String userPoolName;

    public static SetSpecificIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSpecificIdentityProviderRequest self = new SetSpecificIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public SetSpecificIdentityProviderRequest setIDPMetadata(String IDPMetadata) {
        this.IDPMetadata = IDPMetadata;
        return this;
    }
    public String getIDPMetadata() {
        return this.IDPMetadata;
    }

    public SetSpecificIdentityProviderRequest setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
        return this;
    }
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    public SetSpecificIdentityProviderRequest setSSOStatus(String SSOStatus) {
        this.SSOStatus = SSOStatus;
        return this;
    }
    public String getSSOStatus() {
        return this.SSOStatus;
    }

    public SetSpecificIdentityProviderRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
