// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetLniPrivateIpAddressRequest extends TeaModel {
    /**
     * <p>IP unique identifier</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sip-xxxxx</p>
     */
    @NameInMap("IpName")
    public String ipName;

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

    public static GetLniPrivateIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLniPrivateIpAddressRequest self = new GetLniPrivateIpAddressRequest();
        return TeaModel.build(map, self);
    }

    public GetLniPrivateIpAddressRequest setIpName(String ipName) {
        this.ipName = ipName;
        return this;
    }
    public String getIpName() {
        return this.ipName;
    }

    public GetLniPrivateIpAddressRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public GetLniPrivateIpAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
