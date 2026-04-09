// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateParameterRequest extends TeaModel {
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
     * <p>12345</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Owner")
    public String owner;

    @NameInMap("Properties")
    public java.util.List<UpdateParameterRequestProperties> properties;

    public static UpdateParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateParameterRequest self = new UpdateParameterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateParameterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateParameterRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateParameterRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateParameterRequest setProperties(java.util.List<UpdateParameterRequestProperties> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.List<UpdateParameterRequestProperties> getProperties() {
        return this.properties;
    }

    public static class UpdateParameterRequestProperties extends TeaModel {
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

        public static UpdateParameterRequestProperties build(java.util.Map<String, ?> map) throws Exception {
            UpdateParameterRequestProperties self = new UpdateParameterRequestProperties();
            return TeaModel.build(map, self);
        }

        public UpdateParameterRequestProperties setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public UpdateParameterRequestProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
