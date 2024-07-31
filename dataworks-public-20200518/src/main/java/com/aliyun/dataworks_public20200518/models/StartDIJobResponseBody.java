// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StartDIJobResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>999431B2-6013-577F-B684-36F7433C753B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartDIJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartDIJobResponseBody self = new StartDIJobResponseBody();
        return TeaModel.build(map, self);
    }

    public StartDIJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
