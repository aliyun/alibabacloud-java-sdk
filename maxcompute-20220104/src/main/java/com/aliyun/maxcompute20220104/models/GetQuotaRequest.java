// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaRequest extends TeaModel {
    /**
     * <p>The trusted AccessKey pairs.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("AkProven")
    @Deprecated
    public String akProven;

    /**
     * <p>Specifies whether to include submodules. Valid values: -true: The request includes submodules. -false: The request does not include submodules. This is the default value.</p>
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
    @Deprecated
    public String region;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>520539530998273</p>
     */
    @NameInMap("tenantId")
    @Deprecated
    public String tenantId;

    public static GetQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaRequest self = new GetQuotaRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public GetQuotaRequest setAkProven(String akProven) {
        this.akProven = akProven;
        return this;
    }
    public String getAkProven() {
        return this.akProven;
    }

    public GetQuotaRequest setMock(Boolean mock) {
        this.mock = mock;
        return this;
    }
    public Boolean getMock() {
        return this.mock;
    }

    @Deprecated
    public GetQuotaRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    @Deprecated
    public GetQuotaRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
