// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateSnatEntryRequest extends TeaModel {
    @NameInMap("EipAffinity")
    public Integer eipAffinity;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SnatEntryName")
    public String snatEntryName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SnatIp")
    public String snatIp;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SnatTableId")
    public String snatTableId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceCIDR")
    public String sourceCIDR;

    public static CreateSnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSnatEntryRequest self = new CreateSnatEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateSnatEntryRequest setEipAffinity(Integer eipAffinity) {
        this.eipAffinity = eipAffinity;
        return this;
    }
    public Integer getEipAffinity() {
        return this.eipAffinity;
    }

    public CreateSnatEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSnatEntryRequest setSnatEntryName(String snatEntryName) {
        this.snatEntryName = snatEntryName;
        return this;
    }
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    public CreateSnatEntryRequest setSnatIp(String snatIp) {
        this.snatIp = snatIp;
        return this;
    }
    public String getSnatIp() {
        return this.snatIp;
    }

    public CreateSnatEntryRequest setSnatTableId(String snatTableId) {
        this.snatTableId = snatTableId;
        return this;
    }
    public String getSnatTableId() {
        return this.snatTableId;
    }

    public CreateSnatEntryRequest setSourceCIDR(String sourceCIDR) {
        this.sourceCIDR = sourceCIDR;
        return this;
    }
    public String getSourceCIDR() {
        return this.sourceCIDR;
    }

}
