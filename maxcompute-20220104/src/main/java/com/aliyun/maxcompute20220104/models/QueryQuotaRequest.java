// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryQuotaRequest extends TeaModel {
    /**
     * <p>The trusted AccessKey pairs.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("AkProven")
    public String akProven;

    /**
     * <p>Specifies whether to include submodules. Valid values: true and false. -true: The request includes submodules. -false (default): The request does not include submodules.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("mock")
    public Boolean mock;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>483212237127906</p>
     */
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
