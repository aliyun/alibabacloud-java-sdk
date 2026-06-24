// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UpdateModelTemplateRequest extends TeaModel {
    /**
     * <p>The model group configuration JSON object.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;defaults&quot;: {
     *         &quot;model&quot;: {
     *             &quot;primary&quot;: &quot;bailian/qwen3.5-plus&quot;
     *         }
     *     }
     * }</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The template group description.</p>
     * 
     * <strong>example:</strong>
     * <p>测试模型分组</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The model group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mt-xxxx</p>
     */
    @NameInMap("ModelTemplateId")
    public String modelTemplateId;

    /**
     * <p>The template group name.</p>
     * 
     * <strong>example:</strong>
     * <p>model-template-001</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateModelTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelTemplateRequest self = new UpdateModelTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelTemplateRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateModelTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateModelTemplateRequest setModelTemplateId(String modelTemplateId) {
        this.modelTemplateId = modelTemplateId;
        return this;
    }
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    public UpdateModelTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
