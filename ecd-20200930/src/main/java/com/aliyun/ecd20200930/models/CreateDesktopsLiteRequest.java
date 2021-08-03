// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopsLiteRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("BundleId")
    public String bundleId;

    @NameInMap("UserAssignMode")
    public String userAssignMode;

    @NameInMap("Amount")
    public Integer amount;

    @NameInMap("EnableInternetAccess")
    public Boolean enableInternetAccess;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    public static CreateDesktopsLiteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDesktopsLiteRequest self = new CreateDesktopsLiteRequest();
        return TeaModel.build(map, self);
    }

    public CreateDesktopsLiteRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDesktopsLiteRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public CreateDesktopsLiteRequest setUserAssignMode(String userAssignMode) {
        this.userAssignMode = userAssignMode;
        return this;
    }
    public String getUserAssignMode() {
        return this.userAssignMode;
    }

    public CreateDesktopsLiteRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateDesktopsLiteRequest setEnableInternetAccess(Boolean enableInternetAccess) {
        this.enableInternetAccess = enableInternetAccess;
        return this;
    }
    public Boolean getEnableInternetAccess() {
        return this.enableInternetAccess;
    }

    public CreateDesktopsLiteRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateDesktopsLiteRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateDesktopsLiteRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateDesktopsLiteRequest setEndUserId(java.util.List<String> endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

}
