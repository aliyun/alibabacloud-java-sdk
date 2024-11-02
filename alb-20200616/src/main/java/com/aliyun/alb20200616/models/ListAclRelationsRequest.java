// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAclRelationsRequest extends TeaModel {
    /**
     * <p>The access control list (ACL) IDs. You can query at most five ACLs in each call.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclIds")
    public java.util.List<String> aclIds;

    public static ListAclRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAclRelationsRequest self = new ListAclRelationsRequest();
        return TeaModel.build(map, self);
    }

    public ListAclRelationsRequest setAclIds(java.util.List<String> aclIds) {
        this.aclIds = aclIds;
        return this;
    }
    public java.util.List<String> getAclIds() {
        return this.aclIds;
    }

}
