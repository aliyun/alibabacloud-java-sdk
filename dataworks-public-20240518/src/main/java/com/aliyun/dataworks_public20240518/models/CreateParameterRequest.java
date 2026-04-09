// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateParameterRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>这是一个测试参数</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace.para</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Properties")
    public java.util.List<CreateParameterRequestProperties> properties;

    /**
     * <strong>example:</strong>
     * <p>Project</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
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
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
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
