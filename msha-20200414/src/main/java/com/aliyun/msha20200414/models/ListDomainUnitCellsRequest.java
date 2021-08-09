// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class ListDomainUnitCellsRequest extends TeaModel {
    // 域名Id
    @NameInMap("DomainId")
    public Long domainId;

    @NameInMap("MshaTenantId")
    public String mshaTenantId;

    @NameInMap("UnitType")
    public String unitType;

    public static ListDomainUnitCellsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDomainUnitCellsRequest self = new ListDomainUnitCellsRequest();
        return TeaModel.build(map, self);
    }

    public ListDomainUnitCellsRequest setDomainId(Long domainId) {
        this.domainId = domainId;
        return this;
    }
    public Long getDomainId() {
        return this.domainId;
    }

    public ListDomainUnitCellsRequest setMshaTenantId(String mshaTenantId) {
        this.mshaTenantId = mshaTenantId;
        return this;
    }
    public String getMshaTenantId() {
        return this.mshaTenantId;
    }

    public ListDomainUnitCellsRequest setUnitType(String unitType) {
        this.unitType = unitType;
        return this;
    }
    public String getUnitType() {
        return this.unitType;
    }

}
