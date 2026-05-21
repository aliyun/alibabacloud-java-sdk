// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateMaintenanceWindowRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>02:00</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>00:00</p>
     */
    @NameInMap("startTime")
    public String startTime;

    public static UpdateMaintenanceWindowRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMaintenanceWindowRequest self = new UpdateMaintenanceWindowRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMaintenanceWindowRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateMaintenanceWindowRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
