// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ModelProperties extends TeaModel {
    @NameInMap("contextSize")
    public Integer contextSize;

    public static ModelProperties build(java.util.Map<String, ?> map) throws Exception {
        ModelProperties self = new ModelProperties();
        return TeaModel.build(map, self);
    }

    public ModelProperties setContextSize(Integer contextSize) {
        this.contextSize = contextSize;
        return this;
    }
    public Integer getContextSize() {
        return this.contextSize;
    }

}
