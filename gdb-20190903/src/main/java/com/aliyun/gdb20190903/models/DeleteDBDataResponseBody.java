// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gdb20190903.models;

import com.aliyun.tea.*;

public class DeleteDBDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDBDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBDataResponseBody self = new DeleteDBDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
