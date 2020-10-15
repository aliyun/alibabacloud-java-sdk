// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddNetworkInterfaceToInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("Networks")
    @Validation(required = true)
    public String networks;

    public static AddNetworkInterfaceToInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddNetworkInterfaceToInstanceRequest self = new AddNetworkInterfaceToInstanceRequest();
        return TeaModel.build(map, self);
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
