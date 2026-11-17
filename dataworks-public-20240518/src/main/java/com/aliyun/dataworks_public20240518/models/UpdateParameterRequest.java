// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateParameterRequest extends TeaModel {
    /**
     * <p>The parameter description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test parameter.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The parameter ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The owner\&quot;s account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The parameter value configuration. This parameter is required for the production environment. If you specify the same environment multiple times, only the first configuration is used.</p>
     */
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
         * <p>The project environment.</p>
         * <ul>
         * <li><p><code>Prod</code>: the production environment</p>
         * </li>
         * <li><p><code>Dev</code>: the development environment</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The parameter value.</p>
         * 
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
