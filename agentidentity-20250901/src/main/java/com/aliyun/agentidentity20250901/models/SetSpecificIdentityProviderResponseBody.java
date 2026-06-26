// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class SetSpecificIdentityProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SpecificIdentityProviderConfiguration")
    public SetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration specificIdentityProviderConfiguration;

    public static SetSpecificIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSpecificIdentityProviderResponseBody self = new SetSpecificIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSpecificIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetSpecificIdentityProviderResponseBody setSpecificIdentityProviderConfiguration(SetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration specificIdentityProviderConfiguration) {
        this.specificIdentityProviderConfiguration = specificIdentityProviderConfiguration;
        return this;
    }
    public SetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration getSpecificIdentityProviderConfiguration() {
        return this.specificIdentityProviderConfiguration;
    }

    public static class SetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration extends TeaModel {
        @NameInMap("IDPMetadata")
        public String IDPMetadata;

        @NameInMap("IdentityProviderType")
        public String identityProviderType;

        @NameInMap("SSOStatus")
        public String SSOStatus;

        public static SetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration build(java.util.Map<String, ?> map) throws Exception {
            SetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration self = new SetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration();
            return TeaModel.build(map, self);
        }

        public SetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration setIDPMetadata(String IDPMetadata) {
            this.IDPMetadata = IDPMetadata;
            return this;
        }
        public String getIDPMetadata() {
            return this.IDPMetadata;
        }

        public SetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration setIdentityProviderType(String identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        public SetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration setSSOStatus(String SSOStatus) {
            this.SSOStatus = SSOStatus;
            return this;
        }
        public String getSSOStatus() {
            return this.SSOStatus;
        }

    }

}
