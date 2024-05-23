// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AssignPrivateIpAddressesRequest extends TeaModel {
    /**
     * <p>The ID of the ENI.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    /**
     * <p>The ID of the vSwitch.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static AssignPrivateIpAddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignPrivateIpAddressesRequest self = new AssignPrivateIpAddressesRequest();
        return TeaModel.build(map, self);
    }

    public AssignPrivateIpAddressesRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public AssignPrivateIpAddressesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
