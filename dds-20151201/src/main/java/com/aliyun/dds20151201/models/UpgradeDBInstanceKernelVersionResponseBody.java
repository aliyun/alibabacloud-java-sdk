// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceKernelVersionResponseBody extends TeaModel {
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
