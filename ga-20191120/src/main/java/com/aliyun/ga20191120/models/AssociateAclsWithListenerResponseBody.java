// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AssociateAclsWithListenerResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AclIds")
    public java.util.List<String> aclIds;

    @NameInMap("ListenerId")
    public String listenerId;

    public static AssociateAclsWithListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateAclsWithListenerResponseBody self = new AssociateAclsWithListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateAclsWithListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssociateAclsWithListenerResponseBody setAclIds(java.util.List<String> aclIds) {
        this.aclIds = aclIds;
        return this;
    }
    public java.util.List<String> getAclIds() {
        return this.aclIds;
    }

    public AssociateAclsWithListenerResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

}
