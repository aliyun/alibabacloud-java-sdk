// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DisableWarehouseAutoScaleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my_warehouse</p>
     */
    @NameInMap("name")
    public String name;

    public static DisableWarehouseAutoScaleRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableWarehouseAutoScaleRequest self = new DisableWarehouseAutoScaleRequest();
        return TeaModel.build(map, self);
    }

    public DisableWarehouseAutoScaleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
