// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRowDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("modelCode")
    public String modelCode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("modelId")
    public Long modelId;

    @NameInMap("modelName")
    public String modelName;

    /**
     * <strong>example:</strong>
     * <p>&quot;{\&quot;total_calls\&quot;:21,\&quot;video_duration\&quot;:210,\&quot;total_amount\&quot;:126,\&quot;image_count\&quot;:0}&quot;</p>
     */
    @NameInMap("values")
    public String values;

    public static ModelRowDTO build(java.util.Map<String, ?> map) throws Exception {
        ModelRowDTO self = new ModelRowDTO();
        return TeaModel.build(map, self);
    }

    public ModelRowDTO setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public ModelRowDTO setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public ModelRowDTO setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ModelRowDTO setValues(String values) {
        this.values = values;
        return this;
    }
    public String getValues() {
        return this.values;
    }

}
