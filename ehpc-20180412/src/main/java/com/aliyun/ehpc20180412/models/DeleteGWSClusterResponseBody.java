// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteGWSClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGWSClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGWSClusterResponseBody self = new DeleteGWSClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGWSClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
