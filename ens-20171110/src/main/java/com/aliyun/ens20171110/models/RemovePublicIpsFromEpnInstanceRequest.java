// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemovePublicIpsFromEpnInstanceRequest extends TeaModel {
    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    @NameInMap("InstanceInfos")
    public String instanceInfos;

    public static RemovePublicIpsFromEpnInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemovePublicIpsFromEpnInstanceRequest self = new RemovePublicIpsFromEpnInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RemovePublicIpsFromEpnInstanceRequest setEPNInstanceId(String EPNInstanceId) {
        this.EPNInstanceId = EPNInstanceId;
        return this;
    }
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    public RemovePublicIpsFromEpnInstanceRequest setInstanceInfos(String instanceInfos) {
        this.instanceInfos = instanceInfos;
        return this;
    }
    public String getInstanceInfos() {
        return this.instanceInfos;
    }

}
