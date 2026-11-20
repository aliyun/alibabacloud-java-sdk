// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateWarehouseScheduleTaskRequest extends TeaModel {
    /**
     * <p>The number of CPU cores to scale out. The value must be a multiple of 16, greater than or equal to 16, and less than or equal to the specifications of the current compute group.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("elasticCu")
    public Long elasticCu;

    /**
     * <p>The end time. The format is HHmm (four digits, 24-hour clock). The time must be on the hour or half hour, such as 0030, 0100, or 0400. The end time must be later than the start time.</p>
     * 
     * <strong>example:</strong>
     * <p>0400</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The elastic plan ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1980869072412614657</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The start time. The format is HHmm (four digits, 24-hour clock). The time must be on the hour or half hour, such as 0030, 0100, or 0400.</p>
     * 
     * <strong>example:</strong>
     * <p>0200</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The compute group ID.</p>
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
