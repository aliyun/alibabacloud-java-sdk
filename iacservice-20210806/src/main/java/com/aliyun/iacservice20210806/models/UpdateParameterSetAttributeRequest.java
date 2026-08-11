// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateParameterSetAttributeRequest extends TeaModel {
    /**
     * <p>The description of the parameter set. Maximum length: 1024 characters.</p>
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
     * <p>The parameter list.</p>
     */
    @NameInMap("parameters")
    public java.util.List<UpdateParameterSetAttributeRequestParameters> parameters;

    public static UpdateParameterSetAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateParameterSetAttributeRequest self = new UpdateParameterSetAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateParameterSetAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateParameterSetAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateParameterSetAttributeRequest setParameters(java.util.List<UpdateParameterSetAttributeRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<UpdateParameterSetAttributeRequestParameters> getParameters() {
        return this.parameters;
    }

    public static class UpdateParameterSetAttributeRequestParameters extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>region</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Specifies whether the parameter is a secret parameter. Secret parameters are hidden in API responses and console displays, and are stored with encryption.</p>
         */
        @NameInMap("secret")
        public Boolean secret;

        /**
         * <p>The parameter set status. Valid values: </p>
         * <p>HAS_VALUE (default): Defines a specific value. </p>
         * <p>EXPLICIT_NULL: Explicitly set to null.</p>
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
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("value")
        public String value;

        public static UpdateParameterSetAttributeRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateParameterSetAttributeRequestParameters self = new UpdateParameterSetAttributeRequestParameters();
            return TeaModel.build(map, self);
        }

        public UpdateParameterSetAttributeRequestParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateParameterSetAttributeRequestParameters setSecret(Boolean secret) {
            this.secret = secret;
            return this;
        }
        public Boolean getSecret() {
            return this.secret;
        }

        public UpdateParameterSetAttributeRequestParameters setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateParameterSetAttributeRequestParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateParameterSetAttributeRequestParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
