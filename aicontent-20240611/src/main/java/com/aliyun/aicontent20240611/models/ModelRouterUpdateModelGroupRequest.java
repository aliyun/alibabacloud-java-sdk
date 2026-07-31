// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterUpdateModelGroupRequest extends TeaModel {
    /**
     * <p>The full member array. An empty array clears all members.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[101, 102, 103]</p>
     */
    @NameInMap("modelList")
    public java.util.List<Long> modelList;

    /**
     * <p>The group name. This parameter performs a full overwrite. Pass the current name even if you do not want to rename the group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Professional Plan</p>
     */
    @NameInMap("name")
    public String name;

    public static ModelRouterUpdateModelGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterUpdateModelGroupRequest self = new ModelRouterUpdateModelGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterUpdateModelGroupRequest setModelList(java.util.List<Long> modelList) {
        this.modelList = modelList;
        return this;
    }
    public java.util.List<Long> getModelList() {
        return this.modelList;
    }

    public ModelRouterUpdateModelGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
