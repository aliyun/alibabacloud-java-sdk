// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class Authorization extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("parameters")
    public AuthorizationParameters parameters;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>APIKey</p>
     */
    @NameInMap("type")
    public String type;

    public static Authorization build(java.util.Map<String, ?> map) throws Exception {
        Authorization self = new Authorization();
        return TeaModel.build(map, self);
    }

    public Authorization setParameters(AuthorizationParameters parameters) {
        this.parameters = parameters;
        return this;
    }
    public AuthorizationParameters getParameters() {
        return this.parameters;
    }

    public Authorization setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class AuthorizationParameters extends TeaModel {
        @NameInMap("apiKeyParameter")
        public APIKeyAuthParameter apiKeyParameter;

        public static AuthorizationParameters build(java.util.Map<String, ?> map) throws Exception {
            AuthorizationParameters self = new AuthorizationParameters();
            return TeaModel.build(map, self);
        }

        public AuthorizationParameters setApiKeyParameter(APIKeyAuthParameter apiKeyParameter) {
            this.apiKeyParameter = apiKeyParameter;
            return this;
        }
        public APIKeyAuthParameter getApiKeyParameter() {
            return this.apiKeyParameter;
        }

    }

}
