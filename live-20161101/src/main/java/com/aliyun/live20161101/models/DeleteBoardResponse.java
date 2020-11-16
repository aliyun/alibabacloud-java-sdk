// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteBoardResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteBoardResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBoardResponse self = new DeleteBoardResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBoardResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
