// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class RegionType extends TeaModel {
    /**
     * <p>The name of the region.</p>
     */
    @NameInMap("LocalName")
    public String localName;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RegionType build(java.util.Map<String, ?> map) throws Exception {
        RegionType self = new RegionType();
        return TeaModel.build(map, self);
    }

    public RegionType setLocalName(String localName) {
        this.localName = localName;
        return this;
    }
    public String getLocalName() {
        return this.localName;
    }

    public RegionType setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
