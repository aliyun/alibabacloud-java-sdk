// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewDesktopGroupRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    @NameInMap("KeepSamePeriod")
    public Integer keepSamePeriod;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("RegionId")
    public String regionId;

    public static RenewDesktopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewDesktopGroupRequest self = new RenewDesktopGroupRequest();
        return TeaModel.build(map, self);
    }

    public RenewDesktopGroupRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public RenewDesktopGroupRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public RenewDesktopGroupRequest setKeepSamePeriod(Integer keepSamePeriod) {
        this.keepSamePeriod = keepSamePeriod;
        return this;
    }
    public Integer getKeepSamePeriod() {
        return this.keepSamePeriod;
    }

    public RenewDesktopGroupRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewDesktopGroupRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RenewDesktopGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
