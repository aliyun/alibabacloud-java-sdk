// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class EnableSmbAclResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableSmbAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableSmbAclResponseBody self = new EnableSmbAclResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableSmbAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
