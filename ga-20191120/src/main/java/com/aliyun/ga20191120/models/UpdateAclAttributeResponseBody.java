// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAclAttributeResponseBody extends TeaModel {
    @NameInMap("AclId")
    public String aclId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAclAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAclAttributeResponseBody self = new UpdateAclAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAclAttributeResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public UpdateAclAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
