// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListLayerVersionsResponseBody extends TeaModel {
    /**
     * <p>The information about layer versions.</p>
     */
    @NameInMap("layers")
    public java.util.List<Layer> layers;

    /**
     * <p>The initial version of the layer for the next query.</p>
     */
    @NameInMap("nextVersion")
    public Integer nextVersion;

    public static ListLayerVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLayerVersionsResponseBody self = new ListLayerVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLayerVersionsResponseBody setLayers(java.util.List<Layer> layers) {
        this.layers = layers;
        return this;
    }
    public java.util.List<Layer> getLayers() {
        return this.layers;
    }

    public ListLayerVersionsResponseBody setNextVersion(Integer nextVersion) {
        this.nextVersion = nextVersion;
        return this;
    }
    public Integer getNextVersion() {
        return this.nextVersion;
    }

}
