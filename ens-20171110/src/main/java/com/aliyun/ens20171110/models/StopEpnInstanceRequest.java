// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StopEpnInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the EPN instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epn-20201014152822q2S9tQ</p>
     */
    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    public static StopEpnInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopEpnInstanceRequest self = new StopEpnInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopEpnInstanceRequest setEPNInstanceId(String EPNInstanceId) {
        this.EPNInstanceId = EPNInstanceId;
        return this;
    }
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

}
