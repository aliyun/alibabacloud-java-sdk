// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNetworkAclEntryResponseBody extends TeaModel {
    @NameInMap("NetworkAclEntryId")
    public String networkAclEntryId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateNetworkAclEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkAclEntryResponseBody self = new CreateNetworkAclEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkAclEntryResponseBody setNetworkAclEntryId(String networkAclEntryId) {
        this.networkAclEntryId = networkAclEntryId;
        return this;
    }
    public String getNetworkAclEntryId() {
        return this.networkAclEntryId;
    }

    public CreateNetworkAclEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
