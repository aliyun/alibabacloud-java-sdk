// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateModelGroupRequest extends TeaModel {
    /**
     * <p>The array of model IDs. At least one element is required. Each element must be the numeric model ID, not the model identifier.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[101, 102, 103]</p>
     */
    @NameInMap("modelList")
    public java.util.List<Long> modelList;

    /**
     * <p>The group name. The name must be 1 to 50 characters in length and must be unique within the tenant (case-insensitive).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Professional Plan</p>
     */
    @NameInMap("name")
    public String name;

    public static ModelRouterCreateModelGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateModelGroupRequest self = new ModelRouterCreateModelGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateModelGroupRequest setModelList(java.util.List<Long> modelList) {
        this.modelList = modelList;
        return this;
    }
    public java.util.List<Long> getModelList() {
        return this.modelList;
    }

    public ModelRouterCreateModelGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
