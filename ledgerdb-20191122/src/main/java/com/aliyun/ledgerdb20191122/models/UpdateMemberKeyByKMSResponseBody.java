// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class UpdateMemberKeyByKMSResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMemberKeyByKMSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemberKeyByKMSResponseBody self = new UpdateMemberKeyByKMSResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMemberKeyByKMSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
