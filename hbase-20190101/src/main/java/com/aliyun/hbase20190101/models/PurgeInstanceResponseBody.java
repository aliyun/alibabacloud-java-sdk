// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class PurgeInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>276F899F-E952-496F-81B8-BD46D86854E3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PurgeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PurgeInstanceResponseBody self = new PurgeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public PurgeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
