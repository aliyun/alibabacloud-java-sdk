// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteChunksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteChunksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteChunksResponseBody self = new DeleteChunksResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteChunksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
