// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class RestartHoloWarehouseRequest extends TeaModel {
    /**
     * <p>The name of the virtual warehouse.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_warehouse</p>
     */
    @NameInMap("name")
    public String name;

    public static RestartHoloWarehouseRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartHoloWarehouseRequest self = new RestartHoloWarehouseRequest();
        return TeaModel.build(map, self);
    }

    public RestartHoloWarehouseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
