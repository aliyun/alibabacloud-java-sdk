// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBConfigResponseBody self = new ModifyDBConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
