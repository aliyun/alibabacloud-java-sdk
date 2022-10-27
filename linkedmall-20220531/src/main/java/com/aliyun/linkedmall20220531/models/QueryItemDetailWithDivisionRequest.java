// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryItemDetailWithDivisionRequest extends TeaModel {
    @NameInMap("DistributionMallId")
    public String distributionMallId;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("DivisionCode")
    public String divisionCode;

    @NameInMap("LmItemId")
    public String lmItemId;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryItemDetailWithDivisionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryItemDetailWithDivisionRequest self = new QueryItemDetailWithDivisionRequest();
        return TeaModel.build(map, self);
    }

    public QueryItemDetailWithDivisionRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public QueryItemDetailWithDivisionRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public QueryItemDetailWithDivisionRequest setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public QueryItemDetailWithDivisionRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public QueryItemDetailWithDivisionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
