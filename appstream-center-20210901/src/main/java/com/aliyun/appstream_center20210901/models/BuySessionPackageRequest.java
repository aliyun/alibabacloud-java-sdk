// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class BuySessionPackageRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("MaxSessions")
    public Integer maxSessions;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <strong>example:</strong>
     * <p>p-xxxxxxxxxxxxx</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("SessionPackageName")
    public String sessionPackageName;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SessionPackageType")
    public String sessionPackageType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>appstreaming.general.entry</p>
     */
    @NameInMap("SessionSpec")
    public String sessionSpec;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("SessionType")
    public String sessionType;

    public static BuySessionPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        BuySessionPackageRequest self = new BuySessionPackageRequest();
        return TeaModel.build(map, self);
    }

    public BuySessionPackageRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public BuySessionPackageRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public BuySessionPackageRequest setMaxSessions(Integer maxSessions) {
        this.maxSessions = maxSessions;
        return this;
    }
    public Integer getMaxSessions() {
        return this.maxSessions;
    }

    public BuySessionPackageRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public BuySessionPackageRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public BuySessionPackageRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public BuySessionPackageRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public BuySessionPackageRequest setSessionPackageName(String sessionPackageName) {
        this.sessionPackageName = sessionPackageName;
        return this;
    }
    public String getSessionPackageName() {
        return this.sessionPackageName;
    }

    public BuySessionPackageRequest setSessionPackageType(String sessionPackageType) {
        this.sessionPackageType = sessionPackageType;
        return this;
    }
    public String getSessionPackageType() {
        return this.sessionPackageType;
    }

    public BuySessionPackageRequest setSessionSpec(String sessionSpec) {
        this.sessionSpec = sessionSpec;
        return this;
    }
    public String getSessionSpec() {
        return this.sessionSpec;
    }

    public BuySessionPackageRequest setSessionType(String sessionType) {
        this.sessionType = sessionType;
        return this;
    }
    public String getSessionType() {
        return this.sessionType;
    }

}
