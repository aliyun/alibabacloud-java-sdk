// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateOperationEventScheduleTimeResponseBody extends TeaModel {
    /**
     * <p>Returns <code>true</code> if the scheduled time is successfully updated, or <code>false</code> otherwise.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The unique identifier for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>11F64C4C-EC50-5472-BC5D-7FD9F51499F6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOperationEventScheduleTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOperationEventScheduleTimeResponseBody self = new UpdateOperationEventScheduleTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOperationEventScheduleTimeResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateOperationEventScheduleTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
