// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryChildDivisionCodeByIdRequest extends TeaModel {
    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("DivisionCode")
    public String divisionCode;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryChildDivisionCodeByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChildDivisionCodeByIdRequest self = new QueryChildDivisionCodeByIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryChildDivisionCodeByIdRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public QueryChildDivisionCodeByIdRequest setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public QueryChildDivisionCodeByIdRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
