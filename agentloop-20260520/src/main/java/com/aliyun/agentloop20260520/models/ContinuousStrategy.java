// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ContinuousStrategy extends TeaModel {
    @NameInMap("dataDelayMinutes")
    public Integer dataDelayMinutes;

    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("intervalUnit")
    public String intervalUnit;

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
