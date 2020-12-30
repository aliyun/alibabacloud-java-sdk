// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class GrantServiceLinkedRoleResponseBody extends TeaModel {
    @NameInMap("SLRStatus")
    public String SLRStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static GrantServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantServiceLinkedRoleResponseBody self = new GrantServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantServiceLinkedRoleResponseBody setSLRStatus(String SLRStatus) {
        this.SLRStatus = SLRStatus;
        return this;
    }
    public String getSLRStatus() {
        return this.SLRStatus;
    }

    public GrantServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
