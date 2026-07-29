// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class CreateWarehouseScheduleTaskRequest extends TeaModel {
    /**
     * <p>A description of the warehouse schedule task.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The number of elastic compute units.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("elasticCu")
    public Long elasticCu;

    /**
     * <p>The UTC end time of the task, in ISO 8601 format.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The UTC start time of the task, in ISO 8601 format.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The ID of the warehouse.</p>
     * <p>This parameter is required.</p>
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
