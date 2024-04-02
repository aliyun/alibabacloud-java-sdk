// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteBizTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBizTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBizTypeResponseBody self = new DeleteBizTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBizTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
