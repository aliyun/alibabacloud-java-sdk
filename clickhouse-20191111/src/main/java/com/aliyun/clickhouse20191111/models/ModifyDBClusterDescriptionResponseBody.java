// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterDescriptionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>05321590-BB65-4720-8CB6-8218E041CDD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterDescriptionResponseBody self = new ModifyDBClusterDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
