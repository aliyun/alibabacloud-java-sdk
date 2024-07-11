// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyDiskWarningLineResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FC4A930D-3AEE-4C9D-BC70-C0F2EEEAA174</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDiskWarningLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskWarningLineResponseBody self = new ModifyDiskWarningLineResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDiskWarningLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
