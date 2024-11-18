// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class RebalanceHoloWarehouseRequest extends TeaModel {
    /**
     * <p>The name of the virtual warehouse.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_oss</p>
     */
    @NameInMap("name")
    public String name;

    public static RebalanceHoloWarehouseRequest build(java.util.Map<String, ?> map) throws Exception {
        RebalanceHoloWarehouseRequest self = new RebalanceHoloWarehouseRequest();
        return TeaModel.build(map, self);
    }

    public RebalanceHoloWarehouseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
