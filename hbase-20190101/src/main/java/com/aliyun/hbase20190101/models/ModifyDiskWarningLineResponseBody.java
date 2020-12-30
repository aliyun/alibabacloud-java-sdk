// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyDiskWarningLineResponseBody extends TeaModel {
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
