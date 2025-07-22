// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AssociateIpAddressRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EipId")
    public String eipId;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AssociateIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateIpAddressRequest self = new AssociateIpAddressRequest();
        return TeaModel.build(map, self);
    }

    public AssociateIpAddressRequest setEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }
    public String getEipId() {
        return this.eipId;
    }

    public AssociateIpAddressRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public AssociateIpAddressRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public AssociateIpAddressRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public AssociateIpAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
