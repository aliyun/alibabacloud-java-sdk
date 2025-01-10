// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateVpdRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the VPD instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-omqutbff</p>
     */
    @NameInMap("VpdId")
    public String vpdId;

    /**
     * <p>The name of the VPD instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-lingjun</p>
     */
    @NameInMap("VpdName")
    public String vpdName;

    public static UpdateVpdRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpdRequest self = new UpdateVpdRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVpdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateVpdRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

    public UpdateVpdRequest setVpdName(String vpdName) {
        this.vpdName = vpdName;
        return this;
    }
    public String getVpdName() {
        return this.vpdName;
    }

}
