// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterInspectConfigRequest extends TeaModel {
    /**
     * <p>The list of disabled inspection items.</p>
     */
    @NameInMap("disabledCheckItems")
    public java.util.List<String> disabledCheckItems;

    /**
     * <p>Specifies whether to enable cluster inspection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The inspection period defined using RFC5545 Recurrence Rule. You must specify BYHOUR and BYMINUTE. Only FREQ=DAILY is supported. COUNT or UNTIL is not supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FREQ=DAILY;BYHOUR=10;BYMINUTE=15</p>
     */
    @NameInMap("recurrence")
    public String recurrence;

    public static CreateClusterInspectConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterInspectConfigRequest self = new CreateClusterInspectConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterInspectConfigRequest setDisabledCheckItems(java.util.List<String> disabledCheckItems) {
        this.disabledCheckItems = disabledCheckItems;
        return this;
    }
    public java.util.List<String> getDisabledCheckItems() {
        return this.disabledCheckItems;
    }

    public CreateClusterInspectConfigRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateClusterInspectConfigRequest setRecurrence(String recurrence) {
        this.recurrence = recurrence;
        return this;
    }
    public String getRecurrence() {
        return this.recurrence;
    }

}
