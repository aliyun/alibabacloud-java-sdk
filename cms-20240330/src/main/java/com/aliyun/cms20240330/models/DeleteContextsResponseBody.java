// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteContextsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("deletedCount")
    public Integer deletedCount;

    /**
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteContextsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteContextsResponseBody self = new DeleteContextsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteContextsResponseBody setDeletedCount(Integer deletedCount) {
        this.deletedCount = deletedCount;
        return this;
    }
    public Integer getDeletedCount() {
        return this.deletedCount;
    }

    public DeleteContextsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
