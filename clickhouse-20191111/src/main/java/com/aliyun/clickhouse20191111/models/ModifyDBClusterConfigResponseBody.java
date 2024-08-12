// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A9AA1E0A-2AEE-5847-87CF-E4FDC0E66052</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterConfigResponseBody self = new ModifyDBClusterConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
