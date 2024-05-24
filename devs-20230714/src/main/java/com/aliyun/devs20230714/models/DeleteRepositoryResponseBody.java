// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeleteRepositoryResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static DeleteRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryResponseBody self = new DeleteRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
