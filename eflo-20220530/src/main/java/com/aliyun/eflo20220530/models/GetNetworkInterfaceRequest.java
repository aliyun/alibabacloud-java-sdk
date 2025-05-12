// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetNetworkInterfaceRequest extends TeaModel {
    /**
     * <p>Lingjun network interface controller ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lni-bp18exxqa2rvfn45e5pz</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

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
     * <p>Subnet of Lingjun</p>
     * 
     * <strong>example:</strong>
     * <p>subnet-f3zfzmnc</p>
     */
    @NameInMap("SubnetId")
    public String subnetId;

    public static GetNetworkInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkInterfaceRequest self = new GetNetworkInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public GetNetworkInterfaceRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public GetNetworkInterfaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetNetworkInterfaceRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    public String getSubnetId() {
        return this.subnetId;
    }

}
