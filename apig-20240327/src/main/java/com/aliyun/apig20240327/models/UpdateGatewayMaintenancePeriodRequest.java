// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayMaintenancePeriodRequest extends TeaModel {
    @NameInMap("maintenancePeriod")
    public UpdateGatewayMaintenancePeriodRequestMaintenancePeriod maintenancePeriod;

    public static UpdateGatewayMaintenancePeriodRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayMaintenancePeriodRequest self = new UpdateGatewayMaintenancePeriodRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayMaintenancePeriodRequest setMaintenancePeriod(UpdateGatewayMaintenancePeriodRequestMaintenancePeriod maintenancePeriod) {
        this.maintenancePeriod = maintenancePeriod;
        return this;
    }
    public UpdateGatewayMaintenancePeriodRequestMaintenancePeriod getMaintenancePeriod() {
        return this.maintenancePeriod;
    }

    public static class UpdateGatewayMaintenancePeriodRequestMaintenancePeriod extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>02:00</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>02:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static UpdateGatewayMaintenancePeriodRequestMaintenancePeriod build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayMaintenancePeriodRequestMaintenancePeriod self = new UpdateGatewayMaintenancePeriodRequestMaintenancePeriod();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayMaintenancePeriodRequestMaintenancePeriod setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateGatewayMaintenancePeriodRequestMaintenancePeriod setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
