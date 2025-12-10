// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyInstanceNetworkAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the ENS instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5myukg7hnpbto7m024002****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new private IP address of the ECS instance. By default, if this parameter is empty, a private IP address is randomly assigned from the CIDR block of the specified vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The vSwitch IDs.</p>
     * <ul>
     * <li>If you set this parameter to the ID of the current vSwitch, the vSwitch of the ECS instance remains unchanged.</li>
     * <li>The input ID is a new vSwitch, and the new and old vSwitches must belong to the same node.</li>
     * <li>By default, if this parameter is not specified, a private IP address is randomly assigned from within the CIDR block of the specified vSwitch.</li>
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
