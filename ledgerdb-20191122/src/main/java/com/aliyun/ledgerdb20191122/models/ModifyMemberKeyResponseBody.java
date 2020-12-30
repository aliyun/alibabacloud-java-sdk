// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ModifyMemberKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMemberKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMemberKeyResponseBody self = new ModifyMemberKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMemberKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
