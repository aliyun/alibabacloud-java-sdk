// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemovePublicIpsFromEpnInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the EPN instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epn-xxxx</p>
     */
    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    /**
     * <p>The information about the public IP addresses that you want to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;PublicIpAddress&quot;:&quot;2.230.XX.XX&quot;},{&quot;PublicIpAddress&quot;:&quot;2.230.XX.XX&quot;}]</p>
     */
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
