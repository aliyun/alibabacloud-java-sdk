// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveVSwitchesFromEpnInstanceRequest extends TeaModel {
    /**
     * <p>The ID of theEPN instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epn-****</p>
     */
    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    /**
     * <p>The internal networking information that you want to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VSwitchesInfo=[{&quot;VSwitchId&quot;:&quot;vs-ixxxx&quot;},{&quot;VSwitchId&quot;:&quot;vs-ixxxx&quot;}]</p>
     */
    @NameInMap("VSwitchesInfo")
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
