// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ContinuousStrategy extends TeaModel {
    /**
     * <p>The data arrival delay in minutes. After a window ends, the system waits for this duration before creating a run to allow data to arrive completely. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("dataDelayMinutes")
    public Integer dataDelayMinutes;

    /**
     * <p>Specifies whether to enable continuous evaluation. If this parameter is not specified or is set to true, continuous evaluation is enabled. If this parameter is set to false, continuous evaluation is disabled but the configuration is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The unit of the continuous evaluation window interval. This field is required for the current polling implementation.</p>
     * 
     * <strong>example:</strong>
     * <p>HOUR</p>
     */
    @NameInMap("intervalUnit")
    public String intervalUnit;

    /**
     * <p>The size of the continuous evaluation window interval. This parameter is used together with intervalUnit. The value must be greater than 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("intervalValue")
    public Integer intervalValue;

    public static ContinuousStrategy build(java.util.Map<String, ?> map) throws Exception {
        ContinuousStrategy self = new ContinuousStrategy();
        return TeaModel.build(map, self);
    }

    public ContinuousStrategy setDataDelayMinutes(Integer dataDelayMinutes) {
        this.dataDelayMinutes = dataDelayMinutes;
        return this;
    }
    public Integer getDataDelayMinutes() {
        return this.dataDelayMinutes;
    }

    public ContinuousStrategy setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ContinuousStrategy setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
        return this;
    }
    public String getIntervalUnit() {
        return this.intervalUnit;
    }

    public ContinuousStrategy setIntervalValue(Integer intervalValue) {
        this.intervalValue = intervalValue;
        return this;
    }
    public Integer getIntervalValue() {
        return this.intervalValue;
    }

}
