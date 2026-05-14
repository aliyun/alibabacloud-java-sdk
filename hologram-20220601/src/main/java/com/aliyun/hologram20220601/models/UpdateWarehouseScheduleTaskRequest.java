// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateWarehouseScheduleTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("elasticCu")
    public Long elasticCu;

    /**
     * <strong>example:</strong>
     * <p>0400</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>1980869072412614657</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>0200</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("warehouseId")
    public Long warehouseId;

    public static UpdateWarehouseScheduleTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWarehouseScheduleTaskRequest self = new UpdateWarehouseScheduleTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWarehouseScheduleTaskRequest setElasticCu(Long elasticCu) {
        this.elasticCu = elasticCu;
        return this;
    }
    public Long getElasticCu() {
        return this.elasticCu;
    }

    public UpdateWarehouseScheduleTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateWarehouseScheduleTaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateWarehouseScheduleTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateWarehouseScheduleTaskRequest setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public Long getWarehouseId() {
        return this.warehouseId;
    }

}
