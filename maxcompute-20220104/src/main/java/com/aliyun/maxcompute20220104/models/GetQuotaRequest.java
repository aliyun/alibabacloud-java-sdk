// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaRequest extends TeaModel {
    /**
     * <p>The trusted AccessKey pairs.</p>
     */
    @NameInMap("AkProven")
    public String akProven;

    /**
     * <p>Specifies whether to include submodules. Valid values: -true: The request includes submodules. -false: The request does not include submodules. This is the default value.</p>
     */
    @NameInMap("mock")
    public Boolean mock;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The tenant ID.</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaRequest self = new GetQuotaRequest();
        return TeaModel.build(map, self);
    }

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

    public GetQuotaRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetQuotaRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
