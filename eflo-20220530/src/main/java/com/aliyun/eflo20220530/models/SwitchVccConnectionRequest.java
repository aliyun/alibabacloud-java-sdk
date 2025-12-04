// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class SwitchVccConnectionRequest extends TeaModel {
    /**
     * <p>CEN</p>
     * 
     * <strong>example:</strong>
     * <p>cen-bkiw0x1347roek****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>Connection type, CENTR/VPC</p>
     * 
     * <strong>example:</strong>
     * <p>CENTR</p>
     */
    @NameInMap("ConnectionType")
    public String connectionType;

    /**
     * <p>Region ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>vSwitch ID</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-t4nahb0pxckgktxfv****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>Cloud Connect Network (CCN) ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-cn-zvp2w22****</p>
     */
    @NameInMap("VccId")
    public String vccId;

    /**
     * <p>VPC ID</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6aa4ddo97frj22t****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static SwitchVccConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchVccConnectionRequest self = new SwitchVccConnectionRequest();
        return TeaModel.build(map, self);
    }

    public SwitchVccConnectionRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public SwitchVccConnectionRequest setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public String getConnectionType() {
        return this.connectionType;
    }

    public SwitchVccConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SwitchVccConnectionRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public SwitchVccConnectionRequest setVccId(String vccId) {
        this.vccId = vccId;
        return this;
    }
    public String getVccId() {
        return this.vccId;
    }

    public SwitchVccConnectionRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
