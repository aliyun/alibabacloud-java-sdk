// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEpnInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEpnInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEpnInstanceResponseBody self = new DeleteEpnInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEpnInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
