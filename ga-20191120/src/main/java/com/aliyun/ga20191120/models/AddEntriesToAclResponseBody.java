// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AddEntriesToAclResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AclId")
    public String aclId;

    public static AddEntriesToAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddEntriesToAclResponseBody self = new AddEntriesToAclResponseBody();
        return TeaModel.build(map, self);
    }

    public AddEntriesToAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddEntriesToAclResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

}
