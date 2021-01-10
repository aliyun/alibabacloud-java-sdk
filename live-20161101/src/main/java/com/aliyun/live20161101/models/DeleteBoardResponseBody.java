// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteBoardResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBoardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBoardResponseBody self = new DeleteBoardResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBoardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
