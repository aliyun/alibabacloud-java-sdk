// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyInstanceMaintainTimeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceMaintainTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMaintainTimeResponseBody self = new ModifyInstanceMaintainTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMaintainTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
