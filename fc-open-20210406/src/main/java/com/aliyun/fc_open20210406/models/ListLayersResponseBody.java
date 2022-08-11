// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListLayersResponseBody extends TeaModel {
    @NameInMap("layers")
    public java.util.List<Layer> layers;

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
