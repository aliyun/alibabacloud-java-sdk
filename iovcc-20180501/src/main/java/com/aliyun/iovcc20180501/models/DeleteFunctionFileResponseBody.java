// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteFunctionFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFunctionFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFunctionFileResponseBody self = new DeleteFunctionFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFunctionFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
