// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddNetworkInterfaceToInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically restart the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoStart")
    public Boolean autoStart;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourInstance ID</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The network parameters in JSON string format. Currently, only IPv6 is supported. An example of adding an IPv6 gateway is as follows:
     * [{&quot;ipType&quot;: &quot;public&quot;, &quot;ipAddressType&quot;: &quot;ipv6&quot;}]</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ipType&quot;: &quot;public&quot;, &quot;ipAddressType&quot;: &quot;ipv6&quot; }]</p>
     */
    @NameInMap("Networks")
    public String networks;

    public static AddNetworkInterfaceToInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddNetworkInterfaceToInstanceRequest self = new AddNetworkInterfaceToInstanceRequest();
        return TeaModel.build(map, self);
    }

    public AddNetworkInterfaceToInstanceRequest setAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    public AddNetworkInterfaceToInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddNetworkInterfaceToInstanceRequest setNetworks(String networks) {
        this.networks = networks;
        return this;
    }
    public String getNetworks() {
        return this.networks;
    }

}
