// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNetworkAclRequest extends TeaModel {
    /**
     * <p>The description of the network ACL.</p>
     * <br>
     * <p>The description must be 1 to 256 characters in length. The description cannot start with \*\*http:// **or** https://\*\*.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the network ACL.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length. The name cannot start with \*\*http:// **or** https://\*\*.</p>
     */
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
