// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNetworkAclRequest extends TeaModel {
    /**
     * <p>The description of the network ACL.</p>
     * <p>The description must be 1 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>This is my NetworkAcl.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Enter a name for the network ACL.</p>
     * <p>The name must be 1 to 128 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-1</p>
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
