// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ApplyDistributionMallRequest extends TeaModel {
    @NameInMap("BindBizId")
    public String bindBizId;

    @NameInMap("DistributionMallName")
    public String distributionMallName;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("MallType")
    public String mallType;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("TenantId")
    public String tenantId;

    public static ApplyDistributionMallRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDistributionMallRequest self = new ApplyDistributionMallRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDistributionMallRequest setBindBizId(String bindBizId) {
        this.bindBizId = bindBizId;
        return this;
    }
    public String getBindBizId() {
        return this.bindBizId;
    }

    public ApplyDistributionMallRequest setDistributionMallName(String distributionMallName) {
        this.distributionMallName = distributionMallName;
        return this;
    }
    public String getDistributionMallName() {
        return this.distributionMallName;
    }

    public ApplyDistributionMallRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public ApplyDistributionMallRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ApplyDistributionMallRequest setMallType(String mallType) {
        this.mallType = mallType;
        return this;
    }
    public String getMallType() {
        return this.mallType;
    }

    public ApplyDistributionMallRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ApplyDistributionMallRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ApplyDistributionMallRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
