// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class SetSpecificIdentityProviderResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configuration information of the identity provider.</p>
     */
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
        /**
         * <p>The IdP metadata content.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;corpId&quot;:&quot;dingxxxxxxxxxx&quot;,&quot;appKey&quot;:&quot;dingxxxxxxxxxx&quot;,&quot;syncCallbackStatus&quot;:&quot;Enabled&quot;}</p>
         */
        @NameInMap("IDPMetadata")
        public String IDPMetadata;

        /**
         * <p>The type of the identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("IdentityProviderType")
        public String identityProviderType;

        /**
         * <p>The SSO enabling status.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
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
