// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StartDIJobShrinkRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("DIJobId")
    public Long DIJobId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceToRerun")
    public Boolean forceToRerun;

    @NameInMap("RealtimeStartSettings")
    public String realtimeStartSettingsShrink;

    public static StartDIJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDIJobShrinkRequest self = new StartDIJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartDIJobShrinkRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public StartDIJobShrinkRequest setForceToRerun(Boolean forceToRerun) {
        this.forceToRerun = forceToRerun;
        return this;
    }
    public Boolean getForceToRerun() {
        return this.forceToRerun;
    }

    public StartDIJobShrinkRequest setRealtimeStartSettingsShrink(String realtimeStartSettingsShrink) {
        this.realtimeStartSettingsShrink = realtimeStartSettingsShrink;
        return this;
    }
    public String getRealtimeStartSettingsShrink() {
        return this.realtimeStartSettingsShrink;
    }

}
