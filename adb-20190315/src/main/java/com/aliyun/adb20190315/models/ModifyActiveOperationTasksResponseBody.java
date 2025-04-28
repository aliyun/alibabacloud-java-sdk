// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationTasksResponseBody extends TeaModel {
    /**
     * <p>The O\&amp;M event IDs that are separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8B709A33-5E8D-511F-A225-AFC0B6AAAD76</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyActiveOperationTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationTasksResponseBody self = new ModifyActiveOperationTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationTasksResponseBody setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ModifyActiveOperationTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
