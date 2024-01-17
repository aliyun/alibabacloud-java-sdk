// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AskSessionPackageRenewPriceRequest extends TeaModel {
    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("SessionPackageId")
    public String sessionPackageId;

    public static AskSessionPackageRenewPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        AskSessionPackageRenewPriceRequest self = new AskSessionPackageRenewPriceRequest();
        return TeaModel.build(map, self);
    }

    public AskSessionPackageRenewPriceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public AskSessionPackageRenewPriceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public AskSessionPackageRenewPriceRequest setSessionPackageId(String sessionPackageId) {
        this.sessionPackageId = sessionPackageId;
        return this;
    }
    public String getSessionPackageId() {
        return this.sessionPackageId;
    }

}
