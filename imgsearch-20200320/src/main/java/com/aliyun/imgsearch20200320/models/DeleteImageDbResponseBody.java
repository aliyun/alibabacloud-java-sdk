// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class DeleteImageDbResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteImageDbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageDbResponseBody self = new DeleteImageDbResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteImageDbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
