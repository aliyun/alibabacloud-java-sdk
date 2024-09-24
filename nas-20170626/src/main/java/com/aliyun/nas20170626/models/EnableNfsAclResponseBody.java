// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class EnableNfsAclResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>29F4F360-A6A8-561A-A45B-A0F6882969BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableNfsAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableNfsAclResponseBody self = new EnableNfsAclResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableNfsAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
