// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AddEntriesToAclResponseBody extends TeaModel {
    /**
     * <p>The ACL ID.</p>
     * 
     * <strong>example:</strong>
     * <p>nacl-hp34s2h0xx1ht4nwo****</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddEntriesToAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddEntriesToAclResponseBody self = new AddEntriesToAclResponseBody();
        return TeaModel.build(map, self);
    }

    public AddEntriesToAclResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public AddEntriesToAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
