// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteInspectionTaskResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInspectionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInspectionTaskResponseBody self = new DeleteInspectionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInspectionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
