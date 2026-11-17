// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ModelSelectionDelta extends TeaModel {
    /**
     * <p>The actual source model IDs to add to the unique ModelAPI. Already selected IDs must not be added again.</p>
     */
    @NameInMap("addModelCardIds")
    public java.util.List<String> addModelCardIds;

    /**
     * <p>The actual source model IDs to remove from the unique ModelAPI. This operation does not delete models in the source. You cannot clear the API or remove backup models that are still referenced by other entry points.</p>
     */
    @NameInMap("removeModelCardIds")
    public java.util.List<String> removeModelCardIds;

    public static ModelSelectionDelta build(java.util.Map<String, ?> map) throws Exception {
        ModelSelectionDelta self = new ModelSelectionDelta();
        return TeaModel.build(map, self);
    }

    public ModelSelectionDelta setAddModelCardIds(java.util.List<String> addModelCardIds) {
        this.addModelCardIds = addModelCardIds;
        return this;
    }
    public java.util.List<String> getAddModelCardIds() {
        return this.addModelCardIds;
    }

    public ModelSelectionDelta setRemoveModelCardIds(java.util.List<String> removeModelCardIds) {
        this.removeModelCardIds = removeModelCardIds;
        return this;
    }
    public java.util.List<String> getRemoveModelCardIds() {
        return this.removeModelCardIds;
    }

}
