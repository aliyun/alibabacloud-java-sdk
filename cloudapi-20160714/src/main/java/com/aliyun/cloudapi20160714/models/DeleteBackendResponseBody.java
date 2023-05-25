// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteBackendResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBackendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackendResponseBody self = new DeleteBackendResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBackendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
