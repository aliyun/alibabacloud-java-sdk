// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class JoinVSwitchesToEpnInstanceRequest extends TeaModel {
    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    @NameInMap("VSwitchesInfo")
    public String vSwitchesInfo;

    public static JoinVSwitchesToEpnInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinVSwitchesToEpnInstanceRequest self = new JoinVSwitchesToEpnInstanceRequest();
        return TeaModel.build(map, self);
    }

    public JoinVSwitchesToEpnInstanceRequest setEPNInstanceId(String EPNInstanceId) {
        this.EPNInstanceId = EPNInstanceId;
        return this;
    }
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    public JoinVSwitchesToEpnInstanceRequest setVSwitchesInfo(String vSwitchesInfo) {
        this.vSwitchesInfo = vSwitchesInfo;
        return this;
    }
    public String getVSwitchesInfo() {
        return this.vSwitchesInfo;
    }

}
