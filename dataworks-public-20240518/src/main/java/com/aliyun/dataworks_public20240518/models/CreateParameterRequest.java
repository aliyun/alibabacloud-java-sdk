// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateParameterRequest extends TeaModel {
    /**
     * <p>The description of the parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test parameter.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The parameter name. It must be unique within the workspace, be prefixed with <code>workspace.</code>, and not exceed 255 characters. The part of the name after the prefix must start with a letter and can contain only letters, digits, and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace.para</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The account ID of the owner.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The workspace ID. This parameter is required when <code>Scope</code> is set to <code>Project</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The value configurations for the parameter. A configuration for the production environment is required. If you provide duplicate configurations for an environment, only the first one is used.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Properties")
    public java.util.List<CreateParameterRequestProperties> properties;

    /**
     * <p>The scope of the parameter. The default value is <code>Project</code>. No other values are currently supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Project</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The type of the parameter.</p>
     * <ul>
     * <li><p><code>PlainConstant</code>: plaintext constant.</p>
     * </li>
     * <li><p><code>SecretConstant</code>: secret constant.</p>
     * </li>
     * <li><p><code>Variable</code>: variable.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PlainConstant</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateParameterRequest self = new CreateParameterRequest();
        return TeaModel.build(map, self);
    }

    public CreateParameterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateParameterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateParameterRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateParameterRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateParameterRequest setProperties(java.util.List<CreateParameterRequestProperties> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.List<CreateParameterRequestProperties> getProperties() {
        return this.properties;
    }

    public CreateParameterRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateParameterRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateParameterRequestProperties extends TeaModel {
        /**
         * <p>The environment.</p>
         * <ul>
         * <li><p><code>Prod</code>: production environment</p>
         * </li>
         * <li><p><code>Dev</code>: development environment</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The value of the parameter. The value can contain Chinese characters, letters, digits, and the following special characters: /, :, ., [, ], ,, \, \&quot;, &quot;, _, =, ?, space, carriage return, line feed, +, -, \*, %, &amp;, @, !, $, #, {, and }.</p>
         * 
         * <strong>example:</strong>
         * <p>value123</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateParameterRequestProperties build(java.util.Map<String, ?> map) throws Exception {
            CreateParameterRequestProperties self = new CreateParameterRequestProperties();
            return TeaModel.build(map, self);
        }

        public CreateParameterRequestProperties setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public CreateParameterRequestProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
