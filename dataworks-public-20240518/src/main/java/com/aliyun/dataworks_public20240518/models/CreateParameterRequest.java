// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateParameterRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test parameter</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the parameter. It must be unique within the workspace. It must start with &quot;workspace.&quot;. The subsequent content must start with a letter and can contain only letters, underscores, and digits. The total length of the name cannot exceed 255 characters.</p>
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
     * <p>The workspace ID. This parameter is required when Scope is set to Project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The parameter value configurations. This parameter is required for the production environment. If duplicate environment configurations exist in the array, the subsequent configurations do not take effect.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Properties")
    public java.util.List<CreateParameterRequestProperties> properties;

    /**
     * <p>The scope of the parameter. Default value: Project. Other types are currently not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Project</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The type. Valid values:</p>
     * <ul>
     * <li>PlainConstant: plaintext constant.</li>
     * <li>SecretConstant: ciphertext constant.</li>
     * <li>Variable: variable.</li>
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
         * <p>The project environment. Valid values:</p>
         * <ul>
         * <li>Prod: production.</li>
         * <li>Dev: development.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The parameter value. Only Chinese characters, letters, digits, and specific special characters are allowed, such as /, :, ., [, ], ,, \, \&quot;, &quot;, _, =, ?, space, carriage return, line feed, +, -, *, %, &amp;, @, !, $, #, {, and }.</p>
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
