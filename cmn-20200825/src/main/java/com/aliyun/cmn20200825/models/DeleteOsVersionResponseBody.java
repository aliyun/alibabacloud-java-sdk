// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteOsVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteOsVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOsVersionResponseBody self = new DeleteOsVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOsVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
