// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StartDIJobResponseBody extends TeaModel {
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
