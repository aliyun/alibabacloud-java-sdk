// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteNetworkAclRequest extends TeaModel {
    /**
     * <p>The ID of the network ACL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nacl-bp1lhl0taikrbgnh****</p>
     */
    @NameInMap("NetworkAclId")
    public String networkAclId;

    public static DeleteNetworkAclRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkAclRequest self = new DeleteNetworkAclRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkAclRequest setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
    }

}
