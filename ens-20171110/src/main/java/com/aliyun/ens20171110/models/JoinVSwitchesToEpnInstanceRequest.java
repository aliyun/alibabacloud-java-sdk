// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class JoinVSwitchesToEpnInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the edge network instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epn-xxxx</p>
     */
    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    /**
     * <p>The information about the internal networking to which you want to add the edge network instance.</p>
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
