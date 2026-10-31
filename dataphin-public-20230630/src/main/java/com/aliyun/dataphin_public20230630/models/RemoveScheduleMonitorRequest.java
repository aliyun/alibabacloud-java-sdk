// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RemoveScheduleMonitorRequest extends TeaModel {
    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The request body for removing scheduling monitoring.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RemoveCommand")
    public RemoveScheduleMonitorRequestRemoveCommand removeCommand;

    public static RemoveScheduleMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveScheduleMonitorRequest self = new RemoveScheduleMonitorRequest();
        return TeaModel.build(map, self);
    }

    public RemoveScheduleMonitorRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public RemoveScheduleMonitorRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public RemoveScheduleMonitorRequest setRemoveCommand(RemoveScheduleMonitorRequestRemoveCommand removeCommand) {
        this.removeCommand = removeCommand;
        return this;
    }
    public RemoveScheduleMonitorRequestRemoveCommand getRemoveCommand() {
        return this.removeCommand;
    }

    public static class RemoveScheduleMonitorRequestRemoveCommand extends TeaModel {
        /**
         * <p>The ID of the monitored item.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6912345678901234</p>
         */
        @NameInMap("MonitoredItemId")
        public Long monitoredItemId;

        /**
         * <p>The type of the monitored item. Valid values: LOGICAL_FIELD, OND_ID_NODE, SCHEDULE_PHYSICAL_NODE, MANUAL_PHYSICAL_NODE, ODM_NODE, LOGICAL_TABLE_NODE, and PROJECT.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SCHEDULE_PHYSICAL_NODE</p>
         */
        @NameInMap("MonitoredItemType")
        public String monitoredItemType;

        public static RemoveScheduleMonitorRequestRemoveCommand build(java.util.Map<String, ?> map) throws Exception {
            RemoveScheduleMonitorRequestRemoveCommand self = new RemoveScheduleMonitorRequestRemoveCommand();
            return TeaModel.build(map, self);
        }

        public RemoveScheduleMonitorRequestRemoveCommand setMonitoredItemId(Long monitoredItemId) {
            this.monitoredItemId = monitoredItemId;
            return this;
        }
        public Long getMonitoredItemId() {
            return this.monitoredItemId;
        }

        public RemoveScheduleMonitorRequestRemoveCommand setMonitoredItemType(String monitoredItemType) {
            this.monitoredItemType = monitoredItemType;
            return this;
        }
        public String getMonitoredItemType() {
            return this.monitoredItemType;
        }

    }

}
