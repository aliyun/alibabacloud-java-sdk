// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListMachineNetworkInfoShrinkRequest extends TeaModel {
    @NameInMap("MachineHpnInfo")
    public String machineHpnInfoShrink;

    public static ListMachineNetworkInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMachineNetworkInfoShrinkRequest self = new ListMachineNetworkInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListMachineNetworkInfoShrinkRequest setMachineHpnInfoShrink(String machineHpnInfoShrink) {
        this.machineHpnInfoShrink = machineHpnInfoShrink;
        return this;
    }
    public String getMachineHpnInfoShrink() {
        return this.machineHpnInfoShrink;
    }

}
