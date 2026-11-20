// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class CreateWarehouseScheduleTaskRequest extends TeaModel {
    /**
     * <p>The description of the time-based elastic plan.</p>
     * 
     * <strong>example:</strong>
     * <p>user stat</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The number of elastic CPU cores. The value must be a multiple of 16, greater than or equal to 16, and less than or equal to the specifications of the current compute group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("elasticCu")
    public Long elasticCu;

    /**
     * <p>The end time. The format is HHmm (four digits, 24-hour clock). The time must be on the hour or half hour, such as 0030, 0100, or 0400.
     * The end time must be later than the start time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0200</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The start time. The format is HHmm (four digits, 24-hour clock). The time must be on the hour or half hour, such as 0030, 0100, or 0400.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0100</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The ID of the compute group. You can call ListWarehouses to obtain the ID.</p>
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
