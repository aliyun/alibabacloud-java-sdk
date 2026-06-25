// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetConsumerResponseBody extends TeaModel {
    /**
     * <p>O código de resposta.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Os dados de resposta.</p>
     */
    @NameInMap("data")
    public GetConsumerResponseBodyData data;

    /**
     * <p>A mensagem de resposta.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>O ID da solicitação.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetConsumerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerResponseBody self = new GetConsumerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConsumerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetConsumerResponseBody setData(GetConsumerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetConsumerResponseBodyData getData() {
        return this.data;
    }

    public GetConsumerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConsumerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetConsumerResponseBodyData extends TeaModel {
        /**
         * <p>As configurações de autenticação por par de AccessKey.</p>
         */
        @NameInMap("akSkIdentityConfigs")
        public java.util.List<AkSkIdentityConfig> akSkIdentityConfigs;

        /**
         * <p>A configuração de autenticação de chave de API.</p>
         */
        @NameInMap("apiKeyIdentityConfig")
        public ApiKeyIdentityConfig apiKeyIdentityConfig;

        /**
         * <p>O ID do consumidor de API.</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        /**
         * <p>O carimbo de data/hora de criação.</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        /**
         * <p>O status de publicação da API no ambiente atual.</p>
         */
        @NameInMap("deployStatus")
        public String deployStatus;

        /**
         * <p>A descrição.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Indica se o consumidor de API está habilitado.</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>A configuração de autenticação JWT.</p>
         */
        @NameInMap("jwtIdentityConfig")
        public JwtIdentityConfig jwtIdentityConfig;

        /**
         * <p>O nome do consumidor de API.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>O carimbo de data/hora de atualização.</p>
         */
        @NameInMap("updateTimestamp")
        public Long updateTimestamp;

        public static GetConsumerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerResponseBodyData self = new GetConsumerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetConsumerResponseBodyData setAkSkIdentityConfigs(java.util.List<AkSkIdentityConfig> akSkIdentityConfigs) {
            this.akSkIdentityConfigs = akSkIdentityConfigs;
            return this;
        }
        public java.util.List<AkSkIdentityConfig> getAkSkIdentityConfigs() {
            return this.akSkIdentityConfigs;
        }

        public GetConsumerResponseBodyData setApiKeyIdentityConfig(ApiKeyIdentityConfig apiKeyIdentityConfig) {
            this.apiKeyIdentityConfig = apiKeyIdentityConfig;
            return this;
        }
        public ApiKeyIdentityConfig getApiKeyIdentityConfig() {
            return this.apiKeyIdentityConfig;
        }

        public GetConsumerResponseBodyData setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public GetConsumerResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public GetConsumerResponseBodyData setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public GetConsumerResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetConsumerResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetConsumerResponseBodyData setJwtIdentityConfig(JwtIdentityConfig jwtIdentityConfig) {
            this.jwtIdentityConfig = jwtIdentityConfig;
            return this;
        }
        public JwtIdentityConfig getJwtIdentityConfig() {
            return this.jwtIdentityConfig;
        }

        public GetConsumerResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetConsumerResponseBodyData setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

}
