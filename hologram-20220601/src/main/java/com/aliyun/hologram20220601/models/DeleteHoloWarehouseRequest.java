// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DeleteHoloWarehouseRequest extends TeaModel {
    /**
     * <p>The name of the virtual warehouse.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_warehouse</p>
     */
    @NameInMap("name")
    public String name;

    public static DeleteHoloWarehouseRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHoloWarehouseRequest self = new DeleteHoloWarehouseRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHoloWarehouseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
