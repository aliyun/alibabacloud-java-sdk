// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ObtainJwtAuthenticationTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>atntkn_01kqflm0sxxx8nmdc1cb5dskxxxxx</p>
     */
    @NameInMap("authenticationTokenId")
    public String authenticationTokenId;

    /**
     * <strong>example:</strong>
     * <p>jwt</p>
     */
    @NameInMap("authenticationTokenType")
    public String authenticationTokenType;

    /**
     * <strong>example:</strong>
     * <p>test_jwt_subject</p>
     */
    @NameInMap("consumerId")
    public String consumerId;

    /**
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("consumerType")
    public String consumerType;

    /**
     * <strong>example:</strong>
     * <p>1649830225000</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <strong>example:</strong>
     * <p>app_ngtkgrrxxxxktg5eao6z4xxxxx</p>
     */
    @NameInMap("creatorId")
    public String creatorId;

    /**
     * <strong>example:</strong>
     * <p>application</p>
     */
    @NameInMap("creatorType")
    public String creatorType;

    /**
     * <strong>example:</strong>
     * <p>atp_01kr2cmj5gxxx4fvmls2e93dxxxxx</p>
     */
    @NameInMap("credentialProviderId")
    public String credentialProviderId;

    /**
     * <strong>example:</strong>
     * <p>1772693568000</p>
     */
    @NameInMap("expirationTime")
    public Long expirationTime;

    /**
     * <p>EIAM实例ID。</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("jwtContent")
    public ObtainJwtAuthenticationTokenResponseBodyJwtContent jwtContent;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("revoked")
    public Boolean revoked;

    /**
     * <strong>example:</strong>
     * <p>1649830225000</p>
     */
    @NameInMap("updateTime")
    public Long updateTime;

    public static ObtainJwtAuthenticationTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ObtainJwtAuthenticationTokenResponseBody self = new ObtainJwtAuthenticationTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public ObtainJwtAuthenticationTokenResponseBody setAuthenticationTokenId(String authenticationTokenId) {
        this.authenticationTokenId = authenticationTokenId;
        return this;
    }
    public String getAuthenticationTokenId() {
        return this.authenticationTokenId;
    }

    public ObtainJwtAuthenticationTokenResponseBody setAuthenticationTokenType(String authenticationTokenType) {
        this.authenticationTokenType = authenticationTokenType;
        return this;
    }
    public String getAuthenticationTokenType() {
        return this.authenticationTokenType;
    }

    public ObtainJwtAuthenticationTokenResponseBody setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public ObtainJwtAuthenticationTokenResponseBody setConsumerType(String consumerType) {
        this.consumerType = consumerType;
        return this;
    }
    public String getConsumerType() {
        return this.consumerType;
    }

    public ObtainJwtAuthenticationTokenResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ObtainJwtAuthenticationTokenResponseBody setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public ObtainJwtAuthenticationTokenResponseBody setCreatorType(String creatorType) {
        this.creatorType = creatorType;
        return this;
    }
    public String getCreatorType() {
        return this.creatorType;
    }

    public ObtainJwtAuthenticationTokenResponseBody setCredentialProviderId(String credentialProviderId) {
        this.credentialProviderId = credentialProviderId;
        return this;
    }
    public String getCredentialProviderId() {
        return this.credentialProviderId;
    }

    public ObtainJwtAuthenticationTokenResponseBody setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public Long getExpirationTime() {
        return this.expirationTime;
    }

    public ObtainJwtAuthenticationTokenResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ObtainJwtAuthenticationTokenResponseBody setJwtContent(ObtainJwtAuthenticationTokenResponseBodyJwtContent jwtContent) {
        this.jwtContent = jwtContent;
        return this;
    }
    public ObtainJwtAuthenticationTokenResponseBodyJwtContent getJwtContent() {
        return this.jwtContent;
    }

    public ObtainJwtAuthenticationTokenResponseBody setRevoked(Boolean revoked) {
        this.revoked = revoked;
        return this;
    }
    public Boolean getRevoked() {
        return this.revoked;
    }

    public ObtainJwtAuthenticationTokenResponseBody setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static class ObtainJwtAuthenticationTokenResponseBodyJwtContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sk-Nx2vzxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("derivedShortToken")
        public String derivedShortToken;

        /**
         * <strong>example:</strong>
         * <p>eyJhbGciOixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("jwtValue")
        public String jwtValue;

        public static ObtainJwtAuthenticationTokenResponseBodyJwtContent build(java.util.Map<String, ?> map) throws Exception {
            ObtainJwtAuthenticationTokenResponseBodyJwtContent self = new ObtainJwtAuthenticationTokenResponseBodyJwtContent();
            return TeaModel.build(map, self);
        }

        public ObtainJwtAuthenticationTokenResponseBodyJwtContent setDerivedShortToken(String derivedShortToken) {
            this.derivedShortToken = derivedShortToken;
            return this;
        }
        public String getDerivedShortToken() {
            return this.derivedShortToken;
        }

        public ObtainJwtAuthenticationTokenResponseBodyJwtContent setJwtValue(String jwtValue) {
            this.jwtValue = jwtValue;
            return this;
        }
        public String getJwtValue() {
            return this.jwtValue;
        }

    }

}
