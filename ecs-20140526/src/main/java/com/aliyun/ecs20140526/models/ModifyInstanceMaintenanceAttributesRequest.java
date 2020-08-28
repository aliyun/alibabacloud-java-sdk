// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceMaintenanceAttributesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("MaintenanceWindow")
    public java.util.List<ModifyInstanceMaintenanceAttributesRequestMaintenanceWindow> maintenanceWindow;

    @NameInMap("ActionOnMaintenance")
    public String actionOnMaintenance;

    public static ModifyInstanceMaintenanceAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMaintenanceAttributesRequest self = new ModifyInstanceMaintenanceAttributesRequest();
        return TeaModel.build(map, self);
    }

    public static class ModifyInstanceMaintenanceAttributesRequestMaintenanceWindow extends TeaModel {
        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        public static ModifyInstanceMaintenanceAttributesRequestMaintenanceWindow build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceMaintenanceAttributesRequestMaintenanceWindow self = new ModifyInstanceMaintenanceAttributesRequestMaintenanceWindow();
            return TeaModel.build(map, self);
        }

    }

}
