// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryQuotaRequest extends TeaModel {
    @NameInMap("AkProven")
    public String akProven;

    @NameInMap("mock")
    public Boolean mock;

    @NameInMap("region")
    public String region;

    @NameInMap("tenantId")
    public String tenantId;

    public static QueryQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryQuotaRequest self = new QueryQuotaRequest();
        return TeaModel.build(map, self);
    }

    public QueryQuotaRequest setAkProven(String akProven) {
        this.akProven = akProven;
        return this;
    }
    public String getAkProven() {
        return this.akProven;
    }

    public QueryQuotaRequest setMock(Boolean mock) {
        this.mock = mock;
        return this;
    }
    public Boolean getMock() {
        return this.mock;
    }

    public QueryQuotaRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public QueryQuotaRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
