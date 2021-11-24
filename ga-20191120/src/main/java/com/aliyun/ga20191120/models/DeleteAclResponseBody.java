// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteAclResponseBody extends TeaModel {
    @NameInMap("AclId")
    public String aclId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAclResponseBody self = new DeleteAclResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAclResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public DeleteAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
