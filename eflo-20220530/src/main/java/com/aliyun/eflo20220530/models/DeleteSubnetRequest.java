// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteSubnetRequest extends TeaModel {
    /**
     * <p>The region ID of the disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Lingjun subnet ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>subnet-f3zfzmnc</p>
     */
    @NameInMap("SubnetId")
    public String subnetId;

    /**
     * <p>Lingjun CIDR block ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-iv2zm1qf</p>
     */
    @NameInMap("VpdId")
    public String vpdId;

    /**
     * <p>Zone</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DeleteSubnetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubnetRequest self = new DeleteSubnetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSubnetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteSubnetRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    public String getSubnetId() {
        return this.subnetId;
    }

    public DeleteSubnetRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

    public DeleteSubnetRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
