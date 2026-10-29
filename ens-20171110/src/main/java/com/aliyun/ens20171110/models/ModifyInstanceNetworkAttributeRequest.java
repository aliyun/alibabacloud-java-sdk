// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyInstanceNetworkAttributeRequest extends TeaModel {
    /**
     * <p>The ENS instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5myukg7hnpbto7m024002****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new private IP address.
     * Default value: If this parameter is not specified, an IP address is randomly assigned from the CIDR block of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The vSwitch ID.</p>
     * <ul>
     * <li>If the specified ID is the current vSwitch of the instance, the vSwitch of the instance remains unchanged.</li>
     * <li>If the specified ID is a new vSwitch, the new and old vSwitches must belong to the same edge zone.</li>
     * <li>If this parameter is not specified, a value is randomly assigned from the CIDR block of the original vSwitch.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-5rllcjb3ol6duzjdnbm1o****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static ModifyInstanceNetworkAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNetworkAttributeRequest self = new ModifyInstanceNetworkAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNetworkAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceNetworkAttributeRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public ModifyInstanceNetworkAttributeRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
