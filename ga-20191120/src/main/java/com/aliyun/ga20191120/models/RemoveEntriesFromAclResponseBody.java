// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class RemoveEntriesFromAclResponseBody extends TeaModel {
    /**
     * <p>The ID of the ACL.</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveEntriesFromAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveEntriesFromAclResponseBody self = new RemoveEntriesFromAclResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveEntriesFromAclResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public RemoveEntriesFromAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
