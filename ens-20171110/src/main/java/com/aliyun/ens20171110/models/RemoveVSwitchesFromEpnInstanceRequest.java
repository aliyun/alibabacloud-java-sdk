// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveVSwitchesFromEpnInstanceRequest extends TeaModel {
    @NameInMap("EPNInstanceId")
    @Validation(required = true)
    public String EPNInstanceId;

    @NameInMap("VSwitchesInfo")
    @Validation(required = true)
    public String vSwitchesInfo;

    public static RemoveVSwitchesFromEpnInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveVSwitchesFromEpnInstanceRequest self = new RemoveVSwitchesFromEpnInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RemoveVSwitchesFromEpnInstanceRequest setEPNInstanceId(String EPNInstanceId) {
        this.EPNInstanceId = EPNInstanceId;
        return this;
    }
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    public RemoveVSwitchesFromEpnInstanceRequest setVSwitchesInfo(String vSwitchesInfo) {
        this.vSwitchesInfo = vSwitchesInfo;
        return this;
    }
    public String getVSwitchesInfo() {
        return this.vSwitchesInfo;
    }

}
