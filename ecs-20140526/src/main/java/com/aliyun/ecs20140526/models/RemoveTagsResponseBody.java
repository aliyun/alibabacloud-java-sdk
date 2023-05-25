// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RemoveTagsResponseBody extends TeaModel {
    /**
     * <p>The type of the resource. Valid values:</p>
     * <br>
     * <p>*   disk</p>
     * <p>*   instance</p>
     * <p>*   image</p>
     * <p>*   securitygroup</p>
     * <p>*   snapshot</p>
     * <br>
     * <p>All the preceding values must be in lowercase.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagsResponseBody self = new RemoveTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
