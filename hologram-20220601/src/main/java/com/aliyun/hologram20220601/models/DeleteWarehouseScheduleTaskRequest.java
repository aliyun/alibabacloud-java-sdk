// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DeleteWarehouseScheduleTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2034449120420339713</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("warehouseId")
    public String warehouseId;

    public static DeleteWarehouseScheduleTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWarehouseScheduleTaskRequest self = new DeleteWarehouseScheduleTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWarehouseScheduleTaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteWarehouseScheduleTaskRequest setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public String getWarehouseId() {
        return this.warehouseId;
    }

}
