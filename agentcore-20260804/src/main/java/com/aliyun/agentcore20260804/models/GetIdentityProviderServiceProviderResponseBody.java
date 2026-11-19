// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetIdentityProviderServiceProviderResponseBody extends TeaModel {
    /**
     * <p>The business result code. If the request fails, troubleshoot the issue based on the HTTP status code and the message.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The SP information. For the result structure, see the response fields of this operation. The response of an asynchronous write operation indicates that the request is accepted, but does not guarantee that the background task is complete.</p>
     */
    @NameInMap("data")
    public GetIdentityProviderServiceProviderResponseBodyData data;

    /**
     * <p>The processing status of the current request. This status does not indicate the final result of the background task.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request acceptance or error message. For asynchronous task results, check them by calling the corresponding query operation.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the request. You can use this ID to associate the current call with troubleshooting. Keep this ID if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>request-example</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the current request is successful. A value of true indicates that the request is processed successfully. For asynchronous write operations, you must continue to query the task results.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetIdentityProviderServiceProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderServiceProviderResponseBody self = new GetIdentityProviderServiceProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderServiceProviderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIdentityProviderServiceProviderResponseBody setData(GetIdentityProviderServiceProviderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIdentityProviderServiceProviderResponseBodyData getData() {
        return this.data;
    }

    public GetIdentityProviderServiceProviderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetIdentityProviderServiceProviderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIdentityProviderServiceProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIdentityProviderServiceProviderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetIdentityProviderServiceProviderResponseBodyData extends TeaModel {
        /**
         * <p>The SAML assertion consumer URL of the local SP. Configure this value in the external IdP.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://sp.example.com/saml/acs">https://sp.example.com/saml/acs</a></p>
         */
        @NameInMap("acsUrl")
        public String acsUrl;

        /**
         * <p>The entity identifier of the local SP. Configure this value in the external IdP. This is not the Entity ID of the external IdP.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://sp.example.com/entity">https://sp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>The SP metadata XML of the local SP. Use this file for import in the external IdP. Do not submit this file as the IdP XML for SAML configuration.</p>
         * 
         * <strong>example:</strong>
         * <p><EntityDescriptor xmlns="urn:oasis:names:tc:SAML:2.0:metadata" entityID="https://sp.example.com/entity"><SPSSODescriptor protocolSupportEnumeration="urn:oasis:names:tc:SAML:2.0:protocol"><AssertionConsumerService Binding="urn:oasis:names:tc:SAML:2.0:bindings:HTTP-POST" Location="https://sp.example.com/saml/acs" index="0"/></SPSSODescriptor></EntityDescriptor></p>
         */
        @NameInMap("metadataXml")
        public String metadataXml;

        /**
         * <p>Required. The query parameter. Only the exact value SAML is supported. The response returns SAML.</p>
         * 
         * <strong>example:</strong>
         * <p>SAML</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The valid URL returned when protocol is set to OIDC. Configure this value as the callback URL in the external IdP. This field is empty or not returned when SAML is used. The meanings of the original SAML fields remain unchanged.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://signin-cn-hangzhou.aliyunagentid.com/example-pool/sso/oidc/callback">https://signin-cn-hangzhou.aliyunagentid.com/example-pool/sso/oidc/callback</a></p>
         */
        @NameInMap("redirectUri")
        public String redirectUri;

        public static GetIdentityProviderServiceProviderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderServiceProviderResponseBodyData self = new GetIdentityProviderServiceProviderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderServiceProviderResponseBodyData setAcsUrl(String acsUrl) {
            this.acsUrl = acsUrl;
            return this;
        }
        public String getAcsUrl() {
            return this.acsUrl;
        }

        public GetIdentityProviderServiceProviderResponseBodyData setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetIdentityProviderServiceProviderResponseBodyData setMetadataXml(String metadataXml) {
            this.metadataXml = metadataXml;
            return this;
        }
        public String getMetadataXml() {
            return this.metadataXml;
        }

        public GetIdentityProviderServiceProviderResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetIdentityProviderServiceProviderResponseBodyData setRedirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        public String getRedirectUri() {
            return this.redirectUri;
        }

    }

}
