// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteAppKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAppKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppKeyResponseBody self = new DeleteAppKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
