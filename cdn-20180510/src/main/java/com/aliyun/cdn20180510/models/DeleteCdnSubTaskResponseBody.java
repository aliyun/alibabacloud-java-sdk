// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteCdnSubTaskResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCdnSubTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCdnSubTaskResponseBody self = new DeleteCdnSubTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCdnSubTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
