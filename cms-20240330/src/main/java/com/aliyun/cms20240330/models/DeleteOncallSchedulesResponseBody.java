// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteOncallSchedulesResponseBody extends TeaModel {
    /**
     * <p>The actual number of deleted records.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("deletedCount")
    public Integer deletedCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteOncallSchedulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOncallSchedulesResponseBody self = new DeleteOncallSchedulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOncallSchedulesResponseBody setDeletedCount(Integer deletedCount) {
        this.deletedCount = deletedCount;
        return this;
    }
    public Integer getDeletedCount() {
        return this.deletedCount;
    }

    public DeleteOncallSchedulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
