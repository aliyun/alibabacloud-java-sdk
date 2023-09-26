// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DeleteAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppResponseBody self = new DeleteAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
