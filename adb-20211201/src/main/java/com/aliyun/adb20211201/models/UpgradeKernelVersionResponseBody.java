// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UpgradeKernelVersionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A444FFFFFF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeKernelVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeKernelVersionResponseBody self = new UpgradeKernelVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeKernelVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
