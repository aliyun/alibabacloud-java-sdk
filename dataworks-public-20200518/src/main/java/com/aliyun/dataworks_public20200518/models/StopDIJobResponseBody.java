// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StopDIJobResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>92F778C7-8F00-53B1-AE1A-B3B17101247D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopDIJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopDIJobResponseBody self = new StopDIJobResponseBody();
        return TeaModel.build(map, self);
    }

    public StopDIJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
