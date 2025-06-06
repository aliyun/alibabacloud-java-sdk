// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListLayersResponseBody extends TeaModel {
    /**
     * <p>The list of layers.</p>
     */
    @NameInMap("layers")
    public java.util.List<Layer> layers;

    /**
     * <p>The name of the start layer for the next query, which is also the token used to obtain more results.</p>
     * 
     * <strong>example:</strong>
     * <p>next-layer-name</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListLayersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLayersResponseBody self = new ListLayersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLayersResponseBody setLayers(java.util.List<Layer> layers) {
        this.layers = layers;
        return this;
    }
    public java.util.List<Layer> getLayers() {
        return this.layers;
    }

    public ListLayersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
