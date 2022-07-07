// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class RemoveStoryFilesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveStoryFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveStoryFilesResponseBody self = new RemoveStoryFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveStoryFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
