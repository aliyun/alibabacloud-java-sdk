// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceKernelVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>27B9A130-7C4B-40D9-84E8-2FC081097AAC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeDBInstanceKernelVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceKernelVersionResponseBody self = new UpgradeDBInstanceKernelVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceKernelVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
