// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DeleteAppForInnerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAppForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppForInnerResponseBody self = new DeleteAppForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
