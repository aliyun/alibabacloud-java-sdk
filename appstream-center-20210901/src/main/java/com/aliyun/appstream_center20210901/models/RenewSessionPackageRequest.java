// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RenewSessionPackageRequest extends TeaModel {
    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("SessionPackageId")
    public String sessionPackageId;

    public static RenewSessionPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewSessionPackageRequest self = new RenewSessionPackageRequest();
        return TeaModel.build(map, self);
    }

    public RenewSessionPackageRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewSessionPackageRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RenewSessionPackageRequest setSessionPackageId(String sessionPackageId) {
        this.sessionPackageId = sessionPackageId;
        return this;
    }
    public String getSessionPackageId() {
        return this.sessionPackageId;
    }

}
