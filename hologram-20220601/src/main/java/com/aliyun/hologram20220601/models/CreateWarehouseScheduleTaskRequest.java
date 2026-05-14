// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class CreateWarehouseScheduleTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>user stat</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("elasticCu")
    public Long elasticCu;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0200</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0100</p>
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

    public static CreateWarehouseScheduleTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWarehouseScheduleTaskRequest self = new CreateWarehouseScheduleTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateWarehouseScheduleTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWarehouseScheduleTaskRequest setElasticCu(Long elasticCu) {
        this.elasticCu = elasticCu;
        return this;
    }
    public Long getElasticCu() {
        return this.elasticCu;
    }

    public CreateWarehouseScheduleTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateWarehouseScheduleTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateWarehouseScheduleTaskRequest setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public Long getWarehouseId() {
        return this.warehouseId;
    }

}
