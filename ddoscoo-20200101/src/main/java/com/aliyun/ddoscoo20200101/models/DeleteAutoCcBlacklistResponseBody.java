// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteAutoCcBlacklistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAutoCcBlacklistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoCcBlacklistResponseBody self = new DeleteAutoCcBlacklistResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAutoCcBlacklistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
