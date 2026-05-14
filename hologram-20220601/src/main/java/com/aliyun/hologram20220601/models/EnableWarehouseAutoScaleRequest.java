// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class EnableWarehouseAutoScaleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("maxClusterCount")
    public String maxClusterCount;

    /**
     * <strong>example:</strong>
     * <p>my_warehouse</p>
     */
    @NameInMap("name")
    public String name;

    public static EnableWarehouseAutoScaleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableWarehouseAutoScaleRequest self = new EnableWarehouseAutoScaleRequest();
        return TeaModel.build(map, self);
    }

    public EnableWarehouseAutoScaleRequest setMaxClusterCount(String maxClusterCount) {
        this.maxClusterCount = maxClusterCount;
        return this;
    }
    public String getMaxClusterCount() {
        return this.maxClusterCount;
    }

    public EnableWarehouseAutoScaleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
