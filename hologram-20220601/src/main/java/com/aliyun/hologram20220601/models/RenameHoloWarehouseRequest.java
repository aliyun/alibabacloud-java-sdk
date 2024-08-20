// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class RenameHoloWarehouseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_warehouse</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>new_name</p>
     */
    @NameInMap("newWarehouseName")
    public String newWarehouseName;

    public static RenameHoloWarehouseRequest build(java.util.Map<String, ?> map) throws Exception {
        RenameHoloWarehouseRequest self = new RenameHoloWarehouseRequest();
        return TeaModel.build(map, self);
    }

    public RenameHoloWarehouseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RenameHoloWarehouseRequest setNewWarehouseName(String newWarehouseName) {
        this.newWarehouseName = newWarehouseName;
        return this;
    }
    public String getNewWarehouseName() {
        return this.newWarehouseName;
    }

}
