// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelGroupModelDTO extends TeaModel {
    /**
     * <p>The numeric ID of the model.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>The model identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("modelCode")
    public String modelCode;

    /**
     * <p>The model type.</p>
     * 
     * <strong>example:</strong>
     * <p>Chat</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>The name of the model.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen-Max</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The platform to which the model belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("platform")
    public String platform;

    /**
     * <p>The model version.</p>
     * 
     * <strong>example:</strong>
     * <p>v0</p>
     */
    @NameInMap("version")
    public String version;

    public static ModelGroupModelDTO build(java.util.Map<String, ?> map) throws Exception {
        ModelGroupModelDTO self = new ModelGroupModelDTO();
        return TeaModel.build(map, self);
    }

    public ModelGroupModelDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModelGroupModelDTO setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public ModelGroupModelDTO setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ModelGroupModelDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelGroupModelDTO setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ModelGroupModelDTO setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
