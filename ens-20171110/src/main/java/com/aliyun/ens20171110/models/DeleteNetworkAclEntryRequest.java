// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteNetworkAclEntryRequest extends TeaModel {
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
