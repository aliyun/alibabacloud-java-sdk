// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnSubTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDcdnSubTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnSubTaskResponseBody self = new DeleteDcdnSubTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnSubTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
