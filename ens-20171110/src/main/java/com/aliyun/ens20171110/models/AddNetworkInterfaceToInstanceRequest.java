// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddNetworkInterfaceToInstanceRequest extends TeaModel {
    @NameInMap("AutoStart")
    public Boolean autoStart;

    @NameInMap("InstanceId")
    public String instanceId;

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
