// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteAclResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AclId")
    public String aclId;

    public static DeleteAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAclResponseBody self = new DeleteAclResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAclResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

}
