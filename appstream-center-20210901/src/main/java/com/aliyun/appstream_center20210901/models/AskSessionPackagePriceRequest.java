// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AskSessionPackagePriceRequest extends TeaModel {
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("MaxSessions")
    public Integer maxSessions;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("Region")
    public String region;

    @NameInMap("SessionPackageType")
    public String sessionPackageType;

    @NameInMap("SessionSpec")
    public String sessionSpec;

    @NameInMap("SessionType")
    public String sessionType;

    public static AskSessionPackagePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        AskSessionPackagePriceRequest self = new AskSessionPackagePriceRequest();
        return TeaModel.build(map, self);
    }

    public AskSessionPackagePriceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public AskSessionPackagePriceRequest setMaxSessions(Integer maxSessions) {
        this.maxSessions = maxSessions;
        return this;
    }
    public Integer getMaxSessions() {
        return this.maxSessions;
    }

    public AskSessionPackagePriceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public AskSessionPackagePriceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public AskSessionPackagePriceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AskSessionPackagePriceRequest setSessionPackageType(String sessionPackageType) {
        this.sessionPackageType = sessionPackageType;
        return this;
    }
    public String getSessionPackageType() {
        return this.sessionPackageType;
    }

    public AskSessionPackagePriceRequest setSessionSpec(String sessionSpec) {
        this.sessionSpec = sessionSpec;
        return this;
    }
    public String getSessionSpec() {
        return this.sessionSpec;
    }

    public AskSessionPackagePriceRequest setSessionType(String sessionType) {
        this.sessionType = sessionType;
        return this;
    }
    public String getSessionType() {
        return this.sessionType;
    }

}
