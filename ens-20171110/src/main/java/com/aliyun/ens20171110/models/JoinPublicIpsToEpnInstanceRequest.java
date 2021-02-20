// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class JoinPublicIpsToEpnInstanceRequest extends TeaModel {
    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    @NameInMap("InstanceInfos")
    public String instanceInfos;

    public static JoinPublicIpsToEpnInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinPublicIpsToEpnInstanceRequest self = new JoinPublicIpsToEpnInstanceRequest();
        return TeaModel.build(map, self);
    }

    public JoinPublicIpsToEpnInstanceRequest setEPNInstanceId(String EPNInstanceId) {
        this.EPNInstanceId = EPNInstanceId;
        return this;
    }
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    public JoinPublicIpsToEpnInstanceRequest setInstanceInfos(String instanceInfos) {
        this.instanceInfos = instanceInfos;
        return this;
    }
    public String getInstanceInfos() {
        return this.instanceInfos;
    }

}
