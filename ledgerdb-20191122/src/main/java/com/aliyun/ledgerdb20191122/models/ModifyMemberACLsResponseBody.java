// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ModifyMemberACLsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMemberACLsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMemberACLsResponseBody self = new ModifyMemberACLsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMemberACLsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
