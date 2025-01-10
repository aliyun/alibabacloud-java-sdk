// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetSubnetRequest extends TeaModel {
    /**
     * <p>The region ID of the data center.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Lingjun subnet instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>subnet-2avf0itf</p>
     */
    @NameInMap("SubnetId")
    public String subnetId;

    /**
     * <p>The ID of the CIDR block to which Lingjun belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-cxcmdk1m</p>
     */
    @NameInMap("VpdId")
    public String vpdId;

    public static GetSubnetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubnetRequest self = new GetSubnetRequest();
        return TeaModel.build(map, self);
    }

    public GetSubnetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSubnetRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    public String getSubnetId() {
        return this.subnetId;
    }

    public GetSubnetRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

}
