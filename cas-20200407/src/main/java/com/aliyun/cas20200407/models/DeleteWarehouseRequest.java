// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteWarehouseRequest extends TeaModel {
    /**
     * <p>The certificate warehouse instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cas-wh-Q7ID6V</p>
     */
    @NameInMap("WarehouseInstanceId")
    public String warehouseInstanceId;

    public static DeleteWarehouseRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWarehouseRequest self = new DeleteWarehouseRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWarehouseRequest setWarehouseInstanceId(String warehouseInstanceId) {
        this.warehouseInstanceId = warehouseInstanceId;
        return this;
    }
    public String getWarehouseInstanceId() {
        return this.warehouseInstanceId;
    }

}
