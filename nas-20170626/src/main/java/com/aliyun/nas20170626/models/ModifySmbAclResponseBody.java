// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifySmbAclResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySmbAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySmbAclResponseBody self = new ModifySmbAclResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySmbAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
