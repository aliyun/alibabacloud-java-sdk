// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class BatchModelErrorDTO extends TeaModel {
    /**
     * <p>The failure cause.</p>
     * 
     * <strong>example:</strong>
     * <p>The model type cannot be empty</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The model ID.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <p>The model name.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("name")
    public String name;

    public static BatchModelErrorDTO build(java.util.Map<String, ?> map) throws Exception {
        BatchModelErrorDTO self = new BatchModelErrorDTO();
        return TeaModel.build(map, self);
    }

    public BatchModelErrorDTO setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public BatchModelErrorDTO setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public BatchModelErrorDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
