// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceEngineVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C4907B00-A208-4E0C-A636-AA85140E406C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeDBInstanceEngineVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceEngineVersionResponseBody self = new UpgradeDBInstanceEngineVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceEngineVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
