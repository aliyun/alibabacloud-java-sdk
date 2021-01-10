// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteOpenAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteOpenAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOpenAccountResponseBody self = new DeleteOpenAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOpenAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
