// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteNetworkAclEntryRequest extends TeaModel {
    /**
     * <p>The ID of the network ACL for which you want to delete a rule.</p>
     * 
     * <strong>example:</strong>
     * <p>nae-5****</p>
     */
    @NameInMap("NetworkAclEntryId")
    public String networkAclEntryId;

    public static DeleteNetworkAclEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkAclEntryRequest self = new DeleteNetworkAclEntryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkAclEntryRequest setNetworkAclEntryId(String networkAclEntryId) {
        this.networkAclEntryId = networkAclEntryId;
        return this;
    }
    public String getNetworkAclEntryId() {
        return this.networkAclEntryId;
    }

}
