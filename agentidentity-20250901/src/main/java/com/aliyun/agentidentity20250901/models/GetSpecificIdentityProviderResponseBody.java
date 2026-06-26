// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetSpecificIdentityProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SpecificIdentityProviderConfiguration")
    public GetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration specificIdentityProviderConfiguration;

    public static GetSpecificIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSpecificIdentityProviderResponseBody self = new GetSpecificIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSpecificIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSpecificIdentityProviderResponseBody setSpecificIdentityProviderConfiguration(GetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration specificIdentityProviderConfiguration) {
        this.specificIdentityProviderConfiguration = specificIdentityProviderConfiguration;
        return this;
    }
    public GetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration getSpecificIdentityProviderConfiguration() {
        return this.specificIdentityProviderConfiguration;
    }

    public static class GetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration extends TeaModel {
        @NameInMap("IDPMetadata")
        public String IDPMetadata;

        @NameInMap("IdentityProviderType")
        public String identityProviderType;

        @NameInMap("SSOStatus")
        public String SSOStatus;

        public static GetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration self = new GetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration();
            return TeaModel.build(map, self);
        }

        public GetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration setIDPMetadata(String IDPMetadata) {
            this.IDPMetadata = IDPMetadata;
            return this;
        }
        public String getIDPMetadata() {
            return this.IDPMetadata;
        }

        public GetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration setIdentityProviderType(String identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        public GetSpecificIdentityProviderResponseBodySpecificIdentityProviderConfiguration setSSOStatus(String SSOStatus) {
            this.SSOStatus = SSOStatus;
            return this;
        }
        public String getSSOStatus() {
            return this.SSOStatus;
        }

    }

}
