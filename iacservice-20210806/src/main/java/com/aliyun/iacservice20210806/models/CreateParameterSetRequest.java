// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateParameterSetRequest extends TeaModel {
    /**
     * <p>The idempotency token. Format: [0-9a-zA-Z-]{1,64}. We recommend that you use a UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The description of the parameter set. Maximum length: 1,024 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>This is parameterSet</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the parameter set. Maximum length: 128 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The list of parameters.</p>
     */
    @NameInMap("parameters")
    public java.util.List<CreateParameterSetRequestParameters> parameters;

    public static CreateParameterSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateParameterSetRequest self = new CreateParameterSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateParameterSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateParameterSetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateParameterSetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateParameterSetRequest setParameters(java.util.List<CreateParameterSetRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<CreateParameterSetRequestParameters> getParameters() {
        return this.parameters;
    }

    public static class CreateParameterSetRequestParameters extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>region</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Specifies whether the parameter is a secret parameter. Secret parameters are hidden in API responses and on the console, and are stored with encryption.</p>
         */
        @NameInMap("secret")
        public Boolean secret;

        /**
         * <p>The parameter status. Valid values:</p>
         * <p>HAS_VALUE (default): Defines a specific value.</p>
         * <p>EXPLICIT_NULL: Explicitly sets the value to null.</p>
         * 
         * <strong>example:</strong>
         * <p>HAS_VALUE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The parameter type (string/number/bool/map(string)/list(string)).</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The parameter value. Use JSON for complex types.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateParameterSetRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateParameterSetRequestParameters self = new CreateParameterSetRequestParameters();
            return TeaModel.build(map, self);
        }

        public CreateParameterSetRequestParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateParameterSetRequestParameters setSecret(Boolean secret) {
            this.secret = secret;
            return this;
        }
        public Boolean getSecret() {
            return this.secret;
        }

        public CreateParameterSetRequestParameters setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateParameterSetRequestParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateParameterSetRequestParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
