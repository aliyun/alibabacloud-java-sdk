// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteMultiZoneClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>169A3910-A39E-4BC2-AA9F-E7AD8D473527</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMultiZoneClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultiZoneClusterResponseBody self = new DeleteMultiZoneClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMultiZoneClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
