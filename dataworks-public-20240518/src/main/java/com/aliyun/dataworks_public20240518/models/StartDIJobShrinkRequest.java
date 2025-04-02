// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StartDIJobShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated. Use the Id parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("DIJobId")
    @Deprecated
    public Long DIJobId;

    /**
     * <p>Specifies whether to forcefully rerun all synchronization steps. If you do not configure this parameter, the system does not perform the forcible rerun operation.</p>
     * <ul>
     * <li>If the system does not perform the forcible rerun operation, only the steps that are not run start to run.</li>
     * <li>If the system performs the forcible rerun operation, all steps start to rerun.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceToRerun")
    public Boolean forceToRerun;

    /**
     * <p>The ID of the synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The settings for starting real-time synchronization.</p>
     * <pre><code>{
     *   &quot;StartTime&quot;:1663765058
     * }
     * </code></pre>
     */
    @NameInMap("RealtimeStartSettings")
    public String realtimeStartSettingsShrink;

    public static StartDIJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDIJobShrinkRequest self = new StartDIJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
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

    public StartDIJobShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public StartDIJobShrinkRequest setRealtimeStartSettingsShrink(String realtimeStartSettingsShrink) {
        this.realtimeStartSettingsShrink = realtimeStartSettingsShrink;
        return this;
    }
    public String getRealtimeStartSettingsShrink() {
        return this.realtimeStartSettingsShrink;
    }

}
