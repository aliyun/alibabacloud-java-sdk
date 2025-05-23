// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateClusterInspectConfigRequest extends TeaModel {
    /**
     * <p>The list of disabled inspection check items.</p>
     */
    @NameInMap("disabledCheckItems")
    public java.util.List<String> disabledCheckItems;

    /**
     * <p>Specifies whether to enable cluster inspection.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The inspection period defined using RFC5545 Recurrence Rule. You must specify BYHOUR and BYMINUTE. Only FREQ=DAILY is supported. COUNT or UNTIL is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>FREQ=DAILY;BYHOUR=10;BYMINUTE=15</p>
     */
    @NameInMap("scheduleTime")
    public String scheduleTime;

    public static UpdateClusterInspectConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterInspectConfigRequest self = new UpdateClusterInspectConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterInspectConfigRequest setDisabledCheckItems(java.util.List<String> disabledCheckItems) {
        this.disabledCheckItems = disabledCheckItems;
        return this;
    }
    public java.util.List<String> getDisabledCheckItems() {
        return this.disabledCheckItems;
    }

    public UpdateClusterInspectConfigRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateClusterInspectConfigRequest setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public String getScheduleTime() {
        return this.scheduleTime;
    }

}
