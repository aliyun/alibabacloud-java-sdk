// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeletePortResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePortResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePortResponseBody self = new DeletePortResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePortResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
