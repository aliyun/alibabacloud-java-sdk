// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateAclResponseBody extends TeaModel {
    @NameInMap("AclId")
    public String aclId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAclResponseBody self = new CreateAclResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAclResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public CreateAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
