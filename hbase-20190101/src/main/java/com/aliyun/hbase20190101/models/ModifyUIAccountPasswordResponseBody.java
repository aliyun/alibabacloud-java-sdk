// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyUIAccountPasswordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BED4ADEB-4EA9-507E-892C-84112D6AC7C1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUIAccountPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUIAccountPasswordResponseBody self = new ModifyUIAccountPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUIAccountPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
