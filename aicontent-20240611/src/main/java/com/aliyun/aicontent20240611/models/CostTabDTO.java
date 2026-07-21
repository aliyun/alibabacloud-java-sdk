// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class CostTabDTO extends TeaModel {
    /**
     * <p>Tab UUID</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>Tab display name</p>
     * 
     * <strong>example:</strong>
     * <p>全部</p>
     */
    @NameInMap("label")
    public String label;

    /**
     * <p>List of associated model types</p>
     */
    @NameInMap("modelTypes")
    public java.util.List<String> modelTypes;

    public static CostTabDTO build(java.util.Map<String, ?> map) throws Exception {
        CostTabDTO self = new CostTabDTO();
        return TeaModel.build(map, self);
    }

    public CostTabDTO setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CostTabDTO setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public CostTabDTO setModelTypes(java.util.List<String> modelTypes) {
        this.modelTypes = modelTypes;
        return this;
    }
    public java.util.List<String> getModelTypes() {
        return this.modelTypes;
    }

}
