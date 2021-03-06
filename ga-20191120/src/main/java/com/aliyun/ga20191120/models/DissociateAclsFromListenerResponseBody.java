// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DissociateAclsFromListenerResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AclIds")
    public java.util.List<String> aclIds;

    @NameInMap("ListenerId")
    public String listenerId;

    public static DissociateAclsFromListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DissociateAclsFromListenerResponseBody self = new DissociateAclsFromListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public DissociateAclsFromListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DissociateAclsFromListenerResponseBody setAclIds(java.util.List<String> aclIds) {
        this.aclIds = aclIds;
        return this;
    }
    public java.util.List<String> getAclIds() {
        return this.aclIds;
    }

    public DissociateAclsFromListenerResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

}
