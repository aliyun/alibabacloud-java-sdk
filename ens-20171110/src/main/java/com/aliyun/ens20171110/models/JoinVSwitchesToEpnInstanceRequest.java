// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class JoinVSwitchesToEpnInstanceRequest extends TeaModel {
    /**
     * <p>The edge-to-edge communication instance ID.</p>
     * <p>The NetworkingModel of the EPN instance must be Connection or SpeedUpAndConnection. The SpeedUp pattern does not allow you to associate vSwitches.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epn-xxxx</p>
     */
    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    /**
     * <p>The internal networking information to be added.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;VSwitchId&quot;:&quot;vs-ixxxx&quot;},{&quot;VSwitchId&quot;:&quot;vs-ixxxx&quot;}]</p>
     */
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
