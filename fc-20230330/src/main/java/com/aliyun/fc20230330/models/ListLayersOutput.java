// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListLayersOutput extends TeaModel {
    @NameInMap("layers")
    public java.util.List<Layer> layers;

    @NameInMap("nextToken")
    public String nextToken;

    public static ListLayersOutput build(java.util.Map<String, ?> map) throws Exception {
        ListLayersOutput self = new ListLayersOutput();
        return TeaModel.build(map, self);
    }

    public ListLayersOutput setLayers(java.util.List<Layer> layers) {
        this.layers = layers;
        return this;
    }
    public java.util.List<Layer> getLayers() {
        return this.layers;
    }

    public ListLayersOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
