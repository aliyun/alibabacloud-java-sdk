// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewDesktopOversoldGroupRequest extends TeaModel {
    @NameInMap("OversoldGroupId")
    public String oversoldGroupId;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    public static RenewDesktopOversoldGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewDesktopOversoldGroupRequest self = new RenewDesktopOversoldGroupRequest();
        return TeaModel.build(map, self);
    }

    public RenewDesktopOversoldGroupRequest setOversoldGroupId(String oversoldGroupId) {
        this.oversoldGroupId = oversoldGroupId;
        return this;
    }
    public String getOversoldGroupId() {
        return this.oversoldGroupId;
    }

    public RenewDesktopOversoldGroupRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewDesktopOversoldGroupRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

}
