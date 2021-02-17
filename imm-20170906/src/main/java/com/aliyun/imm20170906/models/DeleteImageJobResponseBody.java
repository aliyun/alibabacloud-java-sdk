// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DeleteImageJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteImageJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageJobResponseBody self = new DeleteImageJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteImageJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
