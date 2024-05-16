// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteAppCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAppCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppCodeResponseBody self = new DeleteAppCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
