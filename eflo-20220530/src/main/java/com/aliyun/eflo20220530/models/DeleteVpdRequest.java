// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteVpdRequest extends TeaModel {
    /**
     * <p>The ID of the region in which the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Lingjun CIDR block.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-zr0farea</p>
     */
    @NameInMap("VpdId")
    public String vpdId;

    public static DeleteVpdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpdRequest self = new DeleteVpdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVpdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteVpdRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

}
