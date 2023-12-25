// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterConfigInXMLResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterConfigInXMLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterConfigInXMLResponseBody self = new ModifyDBClusterConfigInXMLResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterConfigInXMLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
