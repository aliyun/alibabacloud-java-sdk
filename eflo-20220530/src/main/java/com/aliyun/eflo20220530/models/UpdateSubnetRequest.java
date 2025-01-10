// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateSubnetRequest extends TeaModel {
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
     * <p>The subnet instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>subnet-f3zfzmnc</p>
     */
    @NameInMap("SubnetId")
    public String subnetId;

    /**
     * <p>The new name for the subnet instance.</p>
     * 
     * <strong>example:</strong>
     * <p>subnet-1</p>
     */
    @NameInMap("SubnetName")
    public String subnetName;

    /**
     * <p>The ID of the VPD to which the subnet belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-aof7dat1</p>
     */
    @NameInMap("VpdId")
    public String vpdId;

    /**
     * <p>The zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu-a</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static UpdateSubnetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubnetRequest self = new UpdateSubnetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubnetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSubnetRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    public String getSubnetId() {
        return this.subnetId;
    }

    public UpdateSubnetRequest setSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }
    public String getSubnetName() {
        return this.subnetName;
    }

    public UpdateSubnetRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

    public UpdateSubnetRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
