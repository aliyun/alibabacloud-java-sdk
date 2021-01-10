// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteSpaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpaceResponseBody self = new DeleteSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
