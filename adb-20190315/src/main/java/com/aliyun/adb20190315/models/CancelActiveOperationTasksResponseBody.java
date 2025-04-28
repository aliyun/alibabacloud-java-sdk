// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class CancelActiveOperationTasksResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>am-xxxxxxxx</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>642F3512-C628-5D0C-8815-F6670CEA00D4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelActiveOperationTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelActiveOperationTasksResponseBody self = new CancelActiveOperationTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelActiveOperationTasksResponseBody setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public CancelActiveOperationTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
