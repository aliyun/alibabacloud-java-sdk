// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyNetworkAttributeRequest extends TeaModel {
    @NameInMap("NetworkId")
    public String networkId;

    @NameInMap("NetworkName")
    public String networkName;

    @NameInMap("Description")
    public String description;

    public static ModifyNetworkAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkAttributeRequest self = new ModifyNetworkAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkAttributeRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public ModifyNetworkAttributeRequest setNetworkName(String networkName) {
        this.networkName = networkName;
        return this;
    }
    public String getNetworkName() {
        return this.networkName;
    }

    public ModifyNetworkAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
