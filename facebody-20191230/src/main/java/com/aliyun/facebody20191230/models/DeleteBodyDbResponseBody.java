// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteBodyDbResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBodyDbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBodyDbResponseBody self = new DeleteBodyDbResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBodyDbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
