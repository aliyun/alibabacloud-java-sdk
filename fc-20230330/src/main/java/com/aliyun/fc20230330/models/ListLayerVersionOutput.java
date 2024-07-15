// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListLayerVersionOutput extends TeaModel {
    @NameInMap("layers")
    public java.util.List<Layer> layers;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("nextVersion")
    public Integer nextVersion;

    public static ListLayerVersionOutput build(java.util.Map<String, ?> map) throws Exception {
        ListLayerVersionOutput self = new ListLayerVersionOutput();
        return TeaModel.build(map, self);
    }

    public ListLayerVersionOutput setLayers(java.util.List<Layer> layers) {
        this.layers = layers;
        return this;
    }
    public java.util.List<Layer> getLayers() {
        return this.layers;
    }

    public ListLayerVersionOutput setNextVersion(Integer nextVersion) {
        this.nextVersion = nextVersion;
        return this;
    }
    public Integer getNextVersion() {
        return this.nextVersion;
    }

}
