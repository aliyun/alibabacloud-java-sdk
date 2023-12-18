// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteNetworkAclEntryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNetworkAclEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkAclEntryResponseBody self = new DeleteNetworkAclEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkAclEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
