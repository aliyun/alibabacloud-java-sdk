// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteAutoCcWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAutoCcWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoCcWhitelistResponseBody self = new DeleteAutoCcWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAutoCcWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
