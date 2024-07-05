// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteStoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1B3D5E0A-D8B8-4DA0-8127-ED32C851****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteStoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStoryResponseBody self = new DeleteStoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
