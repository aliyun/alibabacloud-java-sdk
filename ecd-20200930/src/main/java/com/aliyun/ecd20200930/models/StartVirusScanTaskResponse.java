// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class StartVirusScanTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ScanTaskId")
    @Validation(required = true)
    public Long scanTaskId;

    public static StartVirusScanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartVirusScanTaskResponse self = new StartVirusScanTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartVirusScanTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartVirusScanTaskResponse setScanTaskId(Long scanTaskId) {
        this.scanTaskId = scanTaskId;
        return this;
    }
    public Long getScanTaskId() {
        return this.scanTaskId;
    }

}
