// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyAclEntriesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAclEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAclEntriesResponseBody self = new ModifyAclEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAclEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
