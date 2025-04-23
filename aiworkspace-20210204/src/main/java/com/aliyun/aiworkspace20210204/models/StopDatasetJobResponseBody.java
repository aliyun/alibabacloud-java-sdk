// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class StopDatasetJobResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F620FFD3-FFDC-5873-A70C-6971CC45F467</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopDatasetJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopDatasetJobResponseBody self = new StopDatasetJobResponseBody();
        return TeaModel.build(map, self);
    }

    public StopDatasetJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
