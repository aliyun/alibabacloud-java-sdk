// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNetworkAclRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("NetworkAclName")
    public String networkAclName;

    public static CreateNetworkAclRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkAclRequest self = new CreateNetworkAclRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkAclRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNetworkAclRequest setNetworkAclName(String networkAclName) {
        this.networkAclName = networkAclName;
        return this;
    }
    public String getNetworkAclName() {
        return this.networkAclName;
    }

}
