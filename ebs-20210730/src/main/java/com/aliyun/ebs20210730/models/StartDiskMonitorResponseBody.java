// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartDiskMonitorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartDiskMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartDiskMonitorResponseBody self = new StartDiskMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public StartDiskMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
